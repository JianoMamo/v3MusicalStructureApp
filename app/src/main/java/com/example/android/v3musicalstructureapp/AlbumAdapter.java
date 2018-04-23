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

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumAdapter extends ArrayAdapter<Albums> {
    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List<Albums> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);
            ButterKnife.bind(this,convertView);
        }

        ButterKnife.bind(this,convertView);
        ViewHolder holder = new ViewHolder(convertView);

        Albums currentAlbum = getItem(position);
        holder.albumImageView.setImageResource(currentAlbum.getImageAlbumId());
        holder.albumNameView.setText(currentAlbum.getNameAlbumId());
        return convertView;
        }

    static class ViewHolder {

        @BindView(R.id.iv_album_photo) ImageView albumImageView;
        @BindView(R.id.tv_album_name) TextView albumNameView;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
