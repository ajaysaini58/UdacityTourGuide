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

public class DelhiFragment extends Fragment {
    public DelhiFragment() {
    }

    RecyclerView delhiRecyclerView;
    ArrayList<PlaceInfo> delhiPlaceList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        delhiPlaceList = new ArrayList<>();
        // Insert dummy data in the list
        insertDummyData();
        View rootView = inflater.inflate(R.layout.fragment_delhi,container,false);
        delhiRecyclerView = rootView.findViewById(R.id.delhi_recycler_view);
        delhiRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        PlaceAdapter delhiplaceAdapter = new PlaceAdapter(getActivity(),delhiPlaceList);
        delhiRecyclerView.setAdapter(delhiplaceAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void insertDummyData() {
        delhiPlaceList.add(new PlaceInfo(R.drawable.img_akshardham_delhi,getString(R.string.akshardham_delhi_heading),getString(R.string.akshardham_delhi_desc)));
        delhiPlaceList.add(new PlaceInfo(R.drawable.img_lotustemple_delhi,getString(R.string.lotus_delhi_heading),getString(R.string.lotus_delhi_desc)));
        delhiPlaceList.add(new PlaceInfo(R.drawable.img_jamamasjid_delhi,getString(R.string.jamamasjid_delhi_heading),getString(R.string.jamamasjid_delhi_desc)));
        delhiPlaceList.add(new PlaceInfo(R.drawable.img_indiagate_delhi,getString(R.string.indiagate_delhi_heading),getString(R.string.indiagate_delhi_desc)));
    }
}
