package com.example.android.orlandoorientation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SlideFragment extends Fragment {
    public static final String ARG_SLIDE = "ARG_SLIDE";

    private int mSlide;

    public static SlideFragment newInstance(int slide) {
        Bundle args = new Bundle();
        args.putInt(ARG_SLIDE, slide);
        SlideFragment fragment = new SlideFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mSlide = getArguments().getInt(ARG_SLIDE);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_slide, container, false);
        TextView textView = (TextView) view;
        textView.setText("Fragment #" + mSlide);
        return view;
    }
}