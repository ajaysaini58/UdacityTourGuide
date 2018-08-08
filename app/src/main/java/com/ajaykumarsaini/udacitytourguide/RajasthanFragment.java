package com.ajaykumarsaini.udacitytourguide;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import CustomAdapter.PlaceAdapter;
import ModelClass.PlaceInfo;

public class RajasthanFragment extends Fragment {
    public RajasthanFragment() {
    }
    RecyclerView rajasthanRecyclerView;
    ArrayList<PlaceInfo> rajasthanPlaceList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        rajasthanPlaceList = new ArrayList<>();
        // Insert dummy data in the list
        insertDummyData();
        View rootView = inflater.inflate(R.layout.fragment_rajasthan,container,false);
        rajasthanRecyclerView = rootView.findViewById(R.id.rajasthan_recycler_view);
        rajasthanRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        PlaceAdapter rajasthanplaceAdapter = new PlaceAdapter(getActivity(),rajasthanPlaceList);
        rajasthanRecyclerView.setAdapter(rajasthanplaceAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void insertDummyData(){
        rajasthanPlaceList.add(new PlaceInfo(R.drawable.img_jaipur_rajasthan,getString(R.string.jaipur_rajasthan_heading),getString(R.string.jaipur_rajasthan_desc)));
        rajasthanPlaceList.add(new PlaceInfo(R.drawable.img_udaipur_rajasthan,getString(R.string.udaipur_rajasthan_heading),getString(R.string.udaipur_rajasthan_desc)));
        rajasthanPlaceList.add(new PlaceInfo(R.drawable.img_jaisalmer_rajasthan,getString(R.string.jaisalmer_rajasthan_heading),getString(R.string.jaisalmer_rajasthan_desc)));
        rajasthanPlaceList.add(new PlaceInfo(R.drawable.img_mountabu_rajasthan,getString(R.string.mountabu_rajasthan_heading),getString(R.string.mountabu_rajasthan_desc)));
    }
}
