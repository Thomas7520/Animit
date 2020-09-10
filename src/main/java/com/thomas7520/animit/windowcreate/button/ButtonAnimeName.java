package com.thomas7520.animit.windowcreate.button;

import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.utils.TextPrompt;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class ButtonAnimeName extends JTextField {


    public ButtonAnimeName(Anime anime) {
        setBounds(0, 0, 400, 40);
        setSize(200, 20);
        new TextPrompt("Saisir le nom...", this);

        addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent event) {
                anime.setName(getText());
            }
        });
    }

}
