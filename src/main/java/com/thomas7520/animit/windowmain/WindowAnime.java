package com.thomas7520.animit.windowmain;

import javax.swing.*;

public class WindowAnime extends JFrame {
    private JTextField txtName;
    private JComboBox<String> comboBox;

    public WindowAnime() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setTitle("Animit");
        this.setSize(1100, 900);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(new PanelAnime());
        this.setVisible(true);

    }
}
