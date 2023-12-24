package com.company.render;

/**
 * Anime
 */
public class Anime {
    private int animeId;
    private String animeName;
    private String animeDesc;

    // Default Constructor
    public Anime() {
    }

    // Parameterized Constructor
    public Anime(int animeId, String animeName, String animeDesc) {
        this.animeId = animeId;
        this.animeName = animeName;
        this.animeDesc = animeDesc;
    }

    // Getter for animeId
    public int getAnimeId() {
        return animeId;
    }

    // Setter for animeId
    public void setAnimeId(int animeId) {
        this.animeId = animeId;
    }

    // Getter for animeName
    public String getAnimeName() {
        return animeName;
    }

    // Setter for animeName
    public void setAnimeName(String animeName) {
        this.animeName = animeName;
    }

    // Getter for animeDesc
    public String getAnimeDesc() {
        return animeDesc;
    }

    // Setter for animeDesc
    public void setAnimeDesc(String animeDesc) {
        this.animeDesc = animeDesc;
    }

    // toString method for displaying the object as a string
    @Override
    public String toString() {
        return "Anime{" +
                "animeId=" + animeId +
                ", animeName='" + animeName + '\'' +
                ", animeDesc='" + animeDesc + '\'' +
                '}';
    }
}

