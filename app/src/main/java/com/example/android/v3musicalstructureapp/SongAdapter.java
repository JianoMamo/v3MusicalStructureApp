package com.example.android.v3musicalstructureapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class SongAdapter extends ArrayAdapter<Songs> {

    public SongAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Songs> songsArrayList) {
        super(context, resource, songsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        Songs currentSong = getItem(position);
        TextView songView = listItemView.findViewById(R.id.tv_song_name);
        songView.setText(currentSong.getSongNameId());
        TextView singerView = listItemView.findViewById(R.id.tv_singer_name);
        singerView.setText(currentSong.getSingerNameId());
        ImageView imageSongView = listItemView.findViewById(R.id.iv_cover);
        imageSongView.setImageResource(currentSong.getImageSongId());
        return listItemView;
    }
}
