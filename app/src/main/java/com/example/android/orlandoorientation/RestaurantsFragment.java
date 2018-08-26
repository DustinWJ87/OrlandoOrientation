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
public class RestaurantsFragment extends Fragment {

    public RestaurantsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<TourGuide> tours = new ArrayList<TourGuide>();

        tours.add(new TourGuide(getString(R.string.oceanaire), getString(R.string.info_oceanaire), getString(R.string.call_ahead) + getString(R.string.contact_oceanaire), R.drawable.oceanaire));
        tours.add(new TourGuide(getString(R.string.yard_house), getString(R.string.info_yard_house), getString(R.string.call_ahead) + getString(R.string.contact_yard_house), R.drawable.yard_house));
        tours.add(new TourGuide(getString(R.string.maggianos), getString(R.string.info_maggianos), getString(R.string.call_ahead) + getString(R.string.contact_maggianos), R.drawable.maggianos));
        tours.add(new TourGuide(getString(R.string.normans), getString(R.string.info_normans), getString(R.string.call_ahead) + getString(R.string.contact_normans), R.drawable.normans));
        tours.add(new TourGuide(getString(R.string.kekes), getString(R.string.info_kekes), getString(R.string.call_ahead) + getString(R.string.contact_kekes), R.drawable.kekes));
        tours.add(new TourGuide(getString(R.string.cowfish), getString(R.string.info_cowfish), getString(R.string.call_ahead) + getString(R.string.contact_cowfish), R.drawable.cowfish));
        tours.add(new TourGuide(getString(R.string.bull_and_bear), getString(R.string.info_bull_and_bear), getString(R.string.call_ahead) + getString(R.string.contact_bull_and_bear), R.drawable.bull_and_bear));
        tours.add(new TourGuide(getString(R.string.la_luce), getString(R.string.info_la_luce), getString(R.string.call_ahead) + getString(R.string.contact_la_luce), R.drawable.la_luce));

        TourGuideAdapter adapter = new TourGuideAdapter(getActivity(), tours);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}
