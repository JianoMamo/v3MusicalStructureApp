package com.example.android.v3musicalstructureapp;

public class Songs {

    private int imageSongId;
    private String songNameId;
    private String singerNameId;

    public Songs(int imageSongId, String songNameId, String singerNameId) {
        this.imageSongId = imageSongId;
        this.songNameId = songNameId;
        this.singerNameId = singerNameId;
    }

    public int getImageSongId() {
        return imageSongId;
    }

    public String getSongNameId() {
        return songNameId;
    }

    public String getSingerNameId() {
        return singerNameId;
    }
}
