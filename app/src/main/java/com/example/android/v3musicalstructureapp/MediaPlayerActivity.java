package com.example.android.v3musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MediaPlayerActivity extends AppCompatActivity {

    private ImageView imageSongView;
    private TextView nameSongView;
    private TextView nameSingerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);
        setup();
        Intent intent = getIntent();
        int image = intent.getIntExtra("image", 0);
        String song_playing = intent.getStringExtra("textSong");
        String singer_playing = intent.getStringExtra("textSinger");

        imageSongView.setImageResource(image);
        nameSongView.setText(song_playing);
        nameSingerView.setText(singer_playing);

    }

    public void setup() {
        imageSongView = findViewById(R.id.iv_song);
        nameSongView = findViewById(R.id.tv_name_song);
        nameSingerView = findViewById(R.id.tv_name_singer);
    }
}
