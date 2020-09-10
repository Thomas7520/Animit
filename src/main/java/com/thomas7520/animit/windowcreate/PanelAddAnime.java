package com.thomas7520.animit.windowcreate;

import com.thomas7520.animit.Animit;
import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.utils.ComboBoxDisplayName;
import com.thomas7520.animit.windowcreate.button.*;

import javax.swing.*;

public class PanelAddAnime extends JLabel {


    public PanelAddAnime(Anime anime) {




        JComboBox<Object> origineList = new JComboBox<>(Animit.ORIGINES_LIST.toArray());
        origineList.setFocusable(false);
        origineList.setRenderer(new ComboBoxDisplayName("Origine de l'animé"));
        origineList.setSelectedIndex(-1);
        origineList.setBounds(0, 120, 200, 20);
        origineList.setSelectedIndex(-1);
        origineList.addActionListener(action -> {
            String selectItem = (String) origineList.getSelectedItem();
            anime.setOrigine(selectItem);
        });

        JComboBox<Object> statusList = new JComboBox<>(Animit.STATUS_LIST.toArray());
        statusList.setRenderer(new ComboBoxDisplayName("Status de l'animé"));
        statusList.setSelectedIndex(-1);
        statusList.setBounds(0, 140, 200, 20);
        statusList.addActionListener(action -> {
            String selectItem = (String) statusList.getSelectedItem();
            anime.setStatus(selectItem);
        });



        this.add(new ButtonAnimeName(anime));
        this.add(new ButtonAnimeOriginalName(anime));
        this.add(new ButtonAnimeStudio(anime));
        this.add(new ButtonAnimeEpisodes(anime));
        this.add(new ButtonCreateAnime(anime));
        this.add(new ButtonSelectGenres(anime));
        this.add(origineList);
        this.add(statusList);



    }

}
