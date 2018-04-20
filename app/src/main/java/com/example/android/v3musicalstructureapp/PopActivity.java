package com.example.android.v3musicalstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PopActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_list);

        final ArrayList<Songs> songsArrayList = new ArrayList<>();
        songsArrayList.add(new Songs(R.drawable.lana_del_ray, "Born to die", "Lana Del Ray"));
        songsArrayList.add(new Songs(R.drawable.rihanna, "Umbrella", "Rihanna"));
        songsArrayList.add(new Songs(R.drawable.ariana_grande_1508207469, "Problem", "Ariana Grande"));
        songsArrayList.add(new Songs(R.drawable.sam_smith_album_cover, "Stay With Me", "Sam Smith"));
        songsArrayList.add(new Songs(R.drawable.beyonce, "Halo", "Beyonce"));
        songsArrayList.add(new Songs(R.drawable.ed_sheeran, "Perfect", "Ed Sheeran"));
        songsArrayList.add(new Songs(R.drawable.katy_perry, "Roar", "Katy Perry"));

        SongAdapter songAdapter = new SongAdapter(this, 0, songsArrayList);

        ListView songListView = findViewById(R.id.song_listView);

        songListView.setAdapter(songAdapter);

        songListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent songIntent = new Intent(PopActivity.this, MediaPlayerActivity.class);
                songIntent.putExtra("image", songsArrayList.get(position).getImageSongId());
                songIntent.putExtra("textSong", songsArrayList.get(position).getSongNameId());
                songIntent.putExtra("textSinger", songsArrayList.get(position).getSingerNameId());
                startActivity(songIntent);
            }
        });

    }
}
