package com.thomas7520.animit;

import com.google.gson.Gson;
import com.thomas7520.animit.utils.Anime;
import com.thomas7520.animit.windowmain.WindowAnime;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.net.URISyntaxException;
import java.util.Arrays;

import static com.thomas7520.animit.Animit.*;
import static com.thomas7520.animit.Animit.logger;
import static java.util.Objects.requireNonNull;

public class AnimeLoader {


    public AnimeLoader() throws URISyntaxException, FileNotFoundException {
        this.initialization();
    }


    private void initialization() throws URISyntaxException, FileNotFoundException {

        String jarDirectoryPath = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI()).getParentFile().getAbsolutePath() + "/Animit";
        File directoryAnime = new File(jarDirectoryPath);
        Animit.setDirectoryAnime(directoryAnime);

        if(!directoryAnime.mkdirs()) {
            for (File file : requireNonNull(directoryAnime.listFiles())) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                ANIME_UTILS.addAnime(new Gson().fromJson(reader, Anime.class));
            }

            logger.info(ANIME_UTILS.getAnimes().size() + " animes has been load : " + Arrays.toString(ANIME_UTILS.getAnimes()
                    .stream()
                    .map(Anime::getName)
                    .toArray(String[]::new)));
        }
        new WindowAnime();
    }

}
