package com.thomas7520.animit.windowcreate;

import com.thomas7520.animit.utils.Anime;

import javax.swing.*;

public class WindowAddAnime extends JFrame {

    public Anime anime;

    public WindowAddAnime() {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        this.setTitle("Ajouter un animé.");
        this.setSize(800, 600);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.anime = new Anime();
        this.setContentPane(new PanelAddAnime(anime));

        this.setVisible(true);
    }

}
