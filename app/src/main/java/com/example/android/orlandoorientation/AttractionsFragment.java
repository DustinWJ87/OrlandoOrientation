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
public class AttractionsFragment extends Fragment {

    public AttractionsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourGuide> tours = new ArrayList<TourGuide>();

        tours.add(new TourGuide(getString(R.string.walt_disney_world), getString(R.string.info_walt_disney_world), R.drawable.disney_world));
        tours.add(new TourGuide(getString(R.string.universal_studios), getString(R.string.info_universal_studios), R.drawable.universal_studios));
        tours.add(new TourGuide(getString(R.string.seaworld), getString(R.string.info_seaworld), R.drawable.seaworld));
        tours.add(new TourGuide(getString(R.string.busch_gardens), getString(R.string.info_busch_gardens), R.drawable.busch_gardens));
        tours.add(new TourGuide(getString(R.string.legoland), getString(R.string.info_legoland), R.drawable.legoland));
        tours.add(new TourGuide(getString(R.string.hard_rock_cafe), getString(R.string.info_hard_rock_casino), R.drawable.hardrock_casino));
        tours.add(new TourGuide(getString(R.string.orlando_icon), getString(R.string.info_orlando_icon), R.drawable.orlando_icon));
        tours.add(new TourGuide(getString(R.string.kennedy_space_center), getString(R.string.info_kennedy_space_center), R.drawable.kennedy_space_center));

        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}