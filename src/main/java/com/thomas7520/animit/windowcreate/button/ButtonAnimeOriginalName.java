package com.thomas7520.animit.windowcreate.button;

import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.utils.TextPrompt;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ButtonAnimeOriginalName extends JTextField {

    public ButtonAnimeOriginalName(Anime anime) {
        setBounds(0, 20, 400, 40);
        setSize(200, 20);
        new TextPrompt("Saisir le nom original...", this);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                anime.setOriginalName(getText());
            }
        });
    }
}
