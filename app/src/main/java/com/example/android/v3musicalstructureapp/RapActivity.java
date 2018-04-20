package com.example.android.v3musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class RapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Songs> songsArrayList = new ArrayList<>();
        songsArrayList.add(new Songs(R.drawable.cent_50, "In Da Club", "50 cent"));
        songsArrayList.add(new Songs(R.drawable.eminem_song, "Love the Way You Lie", "Eminem"));
        songsArrayList.add(new Songs(R.drawable.eminem_song, "Not Afraid", "Eminem"));
        songsArrayList.add(new Songs(R.drawable.tupac_shakur, "Only God Can Judge Me", "Tupac Shakur"));
        songsArrayList.add(new Songs(R.drawable.tupac_cover, "Hit Em Up", "Tupac Shakur"));
        songsArrayList.add(new Songs(R.drawable.kendrick_lamar, "DNA", "Kendrick Lamar"));
        songsArrayList.add(new Songs(R.drawable.jay_z, "Girls, Girls, Girls", "Jay - Z"));

        SongAdapter songAdapter = new SongAdapter(this, 0, songsArrayList);

        ListView songListView = findViewById(R.id.song_listView);

        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(RapActivity.this, MediaPlayerActivity.class);
                songIntent.putExtra("image", songsArrayList.get(position).getImageSongId());
                songIntent.putExtra("textSong", songsArrayList.get(position).getSongNameId());
                songIntent.putExtra("textSinger", songsArrayList.get(position).getSingerNameId());
                startActivity(songIntent);
            }
        });
    }
}
