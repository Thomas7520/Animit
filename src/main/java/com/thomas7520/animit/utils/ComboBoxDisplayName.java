package com.thomas7520.animit.utils;

import javax.swing.*;
import java.awt.*;

public class ComboBoxDisplayName extends JLabel implements ListCellRenderer {


    private String title;

    public ComboBoxDisplayName(String title) {
        this.title = title;
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value,
                                                  int index, boolean isSelected, boolean hasFocus) {
        if (index == -1 && value == null)
            setText(title);
        else
            setText(value.toString());
        return this;
    }
}
