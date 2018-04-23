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

import butterknife.BindView;
import butterknife.ButterKnife;


public class SongAdapter extends ArrayAdapter<Songs> {

    public SongAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Songs> songsArrayList) {
        super(context, resource, songsArrayList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {



        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
            ButterKnife.bind(this,convertView);
        }

        ButterKnife.bind(this,convertView);
        ViewHolder holder = new ViewHolder(convertView);

        Songs currentSong = getItem(position);
        holder.songTextView.setText(currentSong.getSongNameId());
        holder.singerNameTextView.setText(currentSong.getSingerNameId());
        holder.songImageView.setImageResource(currentSong.getImageSongId());
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.tv_song_name) TextView songTextView;
        @BindView(R.id.tv_singer_name) TextView singerNameTextView;
        @BindView(R.id.iv_cover) ImageView songImageView;

        public ViewHolder(View view) {
            ButterKnife.bind(this,view);
        }
    }
}
