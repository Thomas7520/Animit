package com.thomas7520.animit.windowcreate.button;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thomas7520.animit.Animit;
import com.thomas7520.animit.utils.Anime;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.util.Date;

public class ButtonCreateAnime extends JButton {


    public ButtonCreateAnime(Anime anime) {
        setBounds(0, 180, 400, 40);
        setSize(200, 20);

        addActionListener(event -> {
//            if(window.anime.getName().isEmpty()) {
//            }

            anime.setAddedTime(new Date().getTime());
            System.out.println(anime.toString());

            try {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            File animeFile = new File(Animit.getDirectoryAnime() + File.separator + anime.getName() + ".json");
            animeFile.createNewFile();
            Writer writer = Files.newBufferedWriter(animeFile.toPath());

            gson.toJson(anime, writer);


                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
