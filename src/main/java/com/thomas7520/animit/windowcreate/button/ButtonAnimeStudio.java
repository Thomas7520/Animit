package com.thomas7520.animit.windowcreate.button;

import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.utils.TextPrompt;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ButtonAnimeStudio extends JTextField {

    public ButtonAnimeStudio(Anime anime) {
        setBounds(0, 60, 400, 80);
        setSize(200, 20);
        new TextPrompt("Saisir le nom du studio...", this);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                anime.setStudio(getText());
            }
        });
    }

}
