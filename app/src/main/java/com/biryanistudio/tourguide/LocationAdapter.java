package com.biryanistudio.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aakaash on 24/03/17 at 11:55 PM.
 */

class LocationAdapter extends ArrayAdapter<Location> {

    LocationAdapter(@NonNull Context context, @NonNull List<Location> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        Location location = getItem(position);
        ((ImageView) convertView.findViewById(R.id.picture)).setImageDrawable(ContextCompat.getDrawable(getContext(), location != null ? location.getDrawableId() : 0));
        ((TextView) convertView.findViewById(R.id.name)).setText(location != null ? location.getName() : null);
        return convertView;
    }
}
