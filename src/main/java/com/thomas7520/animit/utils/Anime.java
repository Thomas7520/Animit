package com.thomas7520.animit.utils;

import java.util.ArrayList;
import java.util.List;

public class Anime {

    private String name, originalName, origine, studio, opinion, status;
    private int episodes;
    private long addedTime;
    private boolean liked;
    private List<String> genres = new ArrayList<>();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOriginalName() {
        return originalName;
    }

    public void setOriginalName(String originalName) {
        this.originalName = originalName;
    }

    public String getOrigine() {
        return origine;
    }

    public void setOrigine(String origine) {
        this.origine = origine;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public long getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(long addedTime) {
        this.addedTime = addedTime;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public List<String> getGenres() {
        return genres;
    }

    public void setGenres(List<String> genres) {
        this.genres = genres;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "name='" + name + '\'' +
                ", originalName='" + originalName + '\'' +
                ", origine='" + origine + '\'' +
                ", studio='" + studio + '\'' +
                ", opinion='" + opinion + '\'' +
                ", status='" + status + '\'' +
                ", episodes=" + episodes +
                ", addedTime=" + addedTime +
                ", genres=" + genres +
                '}';
    }
}
