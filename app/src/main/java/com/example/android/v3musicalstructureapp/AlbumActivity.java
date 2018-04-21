package com.example.android.v3musicalstructureapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.album_list);

        final ArrayList<Albums> albumsArrayList = new ArrayList<>();
        albumsArrayList.add(new Albums(R.drawable.pop_album, "Pop"));
        albumsArrayList.add(new Albums(R.drawable.rock_albums, "Rock"));
        albumsArrayList.add(new Albums(R.drawable.rap_album, "Rap"));
        albumsArrayList.add(new Albums(R.drawable.classic_album, "Classical"));

        AlbumAdapter albumAdapter = new AlbumAdapter(this, 0, albumsArrayList);

        GridView albumGridView = findViewById(R.id.album_grid_view);

        albumGridView.setAdapter(albumAdapter);

        albumGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent albumIntent = new Intent(AlbumActivity.this, PopActivity.class);
                        startActivity(albumIntent);
                        break;

                    case 1:
                        Intent albumIntent1 = new Intent(AlbumActivity.this, RockActivity.class);
                        startActivity(albumIntent1);
                        break;


                    case 2:
                        Intent albumIntent2 = new Intent(AlbumActivity.this, RapActivity.class);
                        startActivity(albumIntent2);
                        break;

                    case 3:
                        Intent albumIntent3 = new Intent(AlbumActivity.this, ClassicActivity.class);
                        startActivity(albumIntent3);

                }
            }
        });
    }
}








