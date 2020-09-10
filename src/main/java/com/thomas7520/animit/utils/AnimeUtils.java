package com.thomas7520.animit.utils;

import java.util.ArrayList;
import java.util.List;

public class AnimeUtils {

    private final List<Anime> animes = new ArrayList<>();

    public List<Anime> getAnimes() {
        return animes;
    }

    public void addAnime(Anime anime) {
        animes.add(anime);
    }


}
