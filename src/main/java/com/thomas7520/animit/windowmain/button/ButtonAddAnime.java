package com.thomas7520.animit.windowmain.button;

import com.thomas7520.animit.windowcreate.WindowAddAnime;

import javax.swing.*;

public class ButtonAddAnime extends JButton {


    public ButtonAddAnime()  {
        setBounds(0, 0, 400, 40);
        setFocusable(false);
        addActionListener(event -> new WindowAddAnime());
    }

}
