package com.example.android.v3musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RockActivity extends AppCompatActivity {

    @BindView(R.id.song_listView)
    ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ButterKnife.bind(this);

        final ArrayList<Songs> songsArrayList = new ArrayList<>();
        songsArrayList.add(new Songs(R.drawable.guns_n_roses, "Paradise City", "Guns n Roses"));
        songsArrayList.add(new Songs(R.drawable.metallica, "Master Of Puppets", "Metallica"));
        songsArrayList.add(new Songs(R.drawable.iron_maiden, "The Troopers", "Iron Maiden"));
        songsArrayList.add(new Songs(R.drawable.the_doors, "Riders On The Storm", "The Doors"));
        songsArrayList.add(new Songs(R.drawable.led_zeppelin, "Stairway To Heaven", "Led Zeppelin"));
        songsArrayList.add(new Songs(R.drawable.queen, "Bohemian Rhapsody", "Queen"));
        songsArrayList.add(new Songs(R.drawable.iron_maiden_fear_of_the_dark, "Fear Of The Dark", "Iron Maiden"));

        SongAdapter songAdapter = new SongAdapter(this, 0, songsArrayList);

        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(RockActivity.this, MediaPlayerActivity.class);
                songIntent.putExtra("image", songsArrayList.get(position).getImageSongId());
                songIntent.putExtra("textSong", songsArrayList.get(position).getSongNameId());
                songIntent.putExtra("textSinger", songsArrayList.get(position).getSingerNameId());
                startActivity(songIntent);
            }
        });
    }
}
