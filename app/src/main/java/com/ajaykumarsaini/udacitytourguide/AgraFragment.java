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

public class AgraFragment extends Fragment {
    public AgraFragment() {
    }

    RecyclerView agraRecyclerView;
    ArrayList<PlaceInfo> agraPlaceList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        agraPlaceList = new ArrayList<>();
        // Insert dummy data in the list
        insertDummyData();
        View rootView = inflater.inflate(R.layout.fragment_agra,container,false);
        agraRecyclerView = rootView.findViewById(R.id.agra_recycler_view);
        agraRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        PlaceAdapter agraplaceAdapter = new PlaceAdapter(getActivity(),agraPlaceList);
        agraRecyclerView.setAdapter(agraplaceAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void insertDummyData(){
        agraPlaceList.add(new PlaceInfo(R.drawable.img_fort_agra,getString(R.string.agrafort_agra_heading),getString(R.string.agrafort_agra_desc)));
        agraPlaceList.add(new PlaceInfo(R.drawable.img_taj_agra,getString(R.string.taj_agra_heading),getString(R.string.taj_agra_desc)));
        agraPlaceList.add(new PlaceInfo(R.drawable.img_fatehpursikr_agra,getString(R.string.fatepur_agra_heading),getString(R.string.fatepur_agra_desc)));
        agraPlaceList.add(new PlaceInfo(R.drawable.img_itimad_agra,getString(R.string.itimad_agra_heading),getString(R.string.itimad_agra_desc)));
    }
}
