package com.example.android.v3musicalstructureapp;

public class Albums {

    private int imageAlbumId;
    private String nameAlbumId;

    public Albums(int imageAlbumId, String nameAlbumId) {
        this.imageAlbumId = imageAlbumId;
        this.nameAlbumId = nameAlbumId;
    }

    public int getImageAlbumId() {
        return imageAlbumId;
    }

    public String getNameAlbumId() {
        return nameAlbumId;
    }
}
