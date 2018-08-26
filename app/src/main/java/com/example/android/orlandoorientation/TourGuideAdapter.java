package com.example.android.orlandoorientation;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourGuideAdapter extends ArrayAdapter<TourGuide> {

    public TourGuideAdapter(Activity context, ArrayList<TourGuide> tours) {
        super(context, 0, tours);
    }

    @NonNull
    @Override
    public View getView(int pos, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TourGuide currentTour = getItem(pos);

        TextView titleTextView = (TextView) listItemView.findViewById(R.id.item_title);

        titleTextView.setText(currentTour.getTourTitle());

        TextView informationTextView = (TextView) listItemView.findViewById(R.id.item_information);

        informationTextView.setText(currentTour.getTourInformation());

        TextView contactTextView = (TextView) listItemView.findViewById(R.id.contact_number);

        contactTextView.setText(currentTour.getContactNumber());

        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);

        imageView.setImageResource(currentTour.getImageResourceId());

        return listItemView;
    }
}