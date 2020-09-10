package com.thomas7520.animit;

import com.thomas7520.animit.utils.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Animit {

    public static final Logger logger = Logger.getLogger("Animit");

    public static final ArrayList<String> GENRES_LIST = new Genres();
    public static final ArrayList<String> ORIGINES_LIST = new Origines();
    public static final ArrayList<String> STATUS_LIST = new Status();
    public static final AnimeUtils ANIME_UTILS = new AnimeUtils();
    private static File directoryAnime;

    public static void main(String[] args) throws URISyntaxException, FileNotFoundException {
        new AnimeLoader();
    }

    public static File getDirectoryAnime() {
        return directoryAnime;
    }

    public static void setDirectoryAnime(File directoryAnime) {
        Animit.directoryAnime = directoryAnime;
    }
}
