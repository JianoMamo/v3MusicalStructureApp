package com.example.android.v3musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ClassicActivity extends AppCompatActivity {

    @BindView(R.id.song_listView)
    ListView songListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);
        ButterKnife.bind(this);

        final ArrayList<Songs> songsArrayList = new ArrayList<>();
        songsArrayList.add(new Songs(R.drawable.beethoven, "Symphony No. 9 in D minor (\"Choral\")", "Ludwig van Beethoven"));
        songsArrayList.add(new Songs(R.drawable.beethoven_moonlight, "Moonlight", "Ludwig van Beethoven"));
        songsArrayList.add(new Songs(R.drawable.bach, "Toccata and Fugue in D Minor", "Johann Sebastian Bach"));
        songsArrayList.add(new Songs(R.drawable.tchaikovsky, "Waltz of the Flowers", "Pyotr Ilyich Tchaikovsky"));
        songsArrayList.add(new Songs(R.drawable.chopin_by_wodzinska, "Nocturne op.9 No.2", "Frédéric Chopin"));
        songsArrayList.add(new Songs(R.drawable.mozart_wolfgang_amadeus, "Wolfgang Amadeus Mozart", "Requiem in D minor"));
        songsArrayList.add(new Songs(R.drawable.vivaldi, "Four Seasons", "Vivaldi"));

        SongAdapter songAdapter = new SongAdapter(this, 0, songsArrayList);

        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(ClassicActivity.this, MediaPlayerActivity.class);
                songIntent.putExtra("image", songsArrayList.get(position).getImageSongId());
                songIntent.putExtra("textSong", songsArrayList.get(position).getSongNameId());
                songIntent.putExtra("textSinger", songsArrayList.get(position).getSingerNameId());
                startActivity(songIntent);
            }
        });
    }
}
