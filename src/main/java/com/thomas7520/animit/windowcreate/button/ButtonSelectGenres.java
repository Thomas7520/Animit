package com.thomas7520.animit.windowcreate.button;

import com.thomas7520.animit.Animit;
import com.thomas7520.animit.utils.Anime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonSelectGenres extends JButton{

    public ButtonSelectGenres(Anime anime) {
        setText("Sélectionnez le(s) genre(s)");

        JPopupMenu genres = new JPopupMenu();


        Animit.GENRES_LIST.forEach(genre -> {
            JMenuItem item = new JCheckBoxMenuItem(genre);
            item.addActionListener(new OpenAction(anime, genres, this, item.getText()));
            genres.add(item);

        });


        this.addActionListener(event -> {
            if(!genres.isVisible()) {
                Point point = getLocationOnScreen();
                genres.setInvoker(this);
                genres.setLocation((int) point.getX(),
                        (int) point.getY() + getHeight());
                genres.setVisible(true);
            } else {
                genres.setVisible(false);
            }

        });

        setFocusable(false);
        setBounds(0,100,200,20);
    }

    private static class OpenAction implements ActionListener {

        private Anime anime;
        private JPopupMenu menu;
        private JButton button;
        private String name;

        private OpenAction(Anime anime, JPopupMenu menu, JButton button, String name) {
            this.anime = anime;
            this.menu = menu;
            this.button = button;
            this.name = name;
        }

        @Override
        public void actionPerformed(ActionEvent event) {
            if (!anime.getGenres().contains(name)) {
                anime.getGenres().add(name);
            } else {
                anime.getGenres().remove(name);
            }

            menu.show(button, 0, button.getHeight());
        }
    }
}
