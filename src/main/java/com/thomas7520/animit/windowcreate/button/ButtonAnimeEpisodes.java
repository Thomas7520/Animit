package com.thomas7520.animit.windowcreate.button;

import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.utils.TextPrompt;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ButtonAnimeEpisodes extends JTextField {

    public ButtonAnimeEpisodes(Anime anime) {
        setBounds(0, 160, 400, 40);
        setSize(200, 20);
        new TextPrompt("Saisir le nombre d'épisodes...", this);

        addKeyListener(new KeyAdapter() {

            @Override
            public void keyReleased(KeyEvent event) {
                char caracter = event.getKeyChar();
                if (((caracter < '0') || (caracter > '9'))
                        && (caracter != '\b')) {
                    event.consume();
                    return;
                }

                if (!getText().isEmpty()) anime.setEpisodes(Integer.parseInt(getText()));
                super.keyReleased(event);
            }


        });
    }



}
