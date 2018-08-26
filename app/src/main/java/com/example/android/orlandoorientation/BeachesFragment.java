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
public class BeachesFragment extends Fragment {

    public BeachesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourGuide> tours = new ArrayList<TourGuide>();

        tours.add(new TourGuide(getString(R.string.cocoa), getString(R.string.info_cocoa), R.drawable.cocoa_beach));
        tours.add(new TourGuide(getString(R.string.clearwater), getString(R.string.info_clearwater), R.drawable.clearwater));
        tours.add(new TourGuide(getString(R.string.vero), getString(R.string.info_vero_beach), R.drawable.vero_beach));
        tours.add(new TourGuide(getString(R.string.madeira), getString(R.string.info_madeira), R.drawable.madeira_beach));
        tours.add(new TourGuide(getString(R.string.st_pete), getString(R.string.info_st_pete), R.drawable.st_pete_beach));
        tours.add(new TourGuide(getString(R.string.new_smyrna), getString(R.string.info_new_smyrna), R.drawable.new_smyrna_beach));
        tours.add(new TourGuide(getString(R.string.port_canaveral), getString(R.string.info_port_canaveral), R.drawable.port_canaveral));
        tours.add(new TourGuide(getString(R.string.daytona), getString(R.string.info_daytona), R.drawable.daytona_beach));

        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}