package com.example.android.orlandoorientation;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class NightLifeFragment extends Fragment {

    public NightLifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourGuide> tours = new ArrayList<TourGuide>();

        tours.add(new TourGuide(getString(R.string.orlando_city_soccer), getString(R.string.info_orlando_city_soccer), R.drawable.orlando_city_soccer));
        tours.add(new TourGuide(getString(R.string.orlando_magic), getString(R.string.info_orlando_magic), R.drawable.orlando_magic));
        tours.add(new TourGuide(getString(R.string.disney_springs), getString(R.string.info_disney_springs), R.drawable.disney_springs));
        tours.add(new TourGuide(getString(R.string.citywalk), getString(R.string.info_citywalk), R.drawable.citywalk));
        tours.add(new TourGuide(getString(R.string.i_drive), getString(R.string.info_i_drive), R.drawable.i_drive));
        tours.add(new TourGuide(getString(R.string.downtown_orlando), getString(R.string.info_downtown_orlando), R.drawable.downtown_orlando));

        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}