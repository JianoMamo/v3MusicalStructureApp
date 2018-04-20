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

public class AlbumAdapter extends ArrayAdapter<Albums> {
    public AlbumAdapter(@NonNull Context context, int resource, @NonNull List<Albums> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View gridItemView = convertView;

        if (gridItemView == null)
            gridItemView = LayoutInflater.from(getContext()).inflate(R.layout.album_item, parent, false);

        Albums currentAlbum = getItem(position);
        ImageView albumImageView = gridItemView.findViewById(R.id.iv_album_photo);
        albumImageView.setImageResource(currentAlbum.getImageAlbumId());
        TextView albumNameView = gridItemView.findViewById(R.id.tv_album_name);
        albumNameView.setText(currentAlbum.getNameAlbumId());
        return gridItemView;
    }
}
