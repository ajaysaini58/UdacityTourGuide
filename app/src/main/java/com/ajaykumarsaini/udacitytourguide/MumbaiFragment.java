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

public class MumbaiFragment extends Fragment {
    public MumbaiFragment() {
    }
    RecyclerView mumbaiRecyclerView;
    ArrayList<PlaceInfo> mumbaiPlaceList;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        mumbaiPlaceList = new ArrayList<>();
        // Insert dummy data in the list
        insertDummyData();
        View rootView = inflater.inflate(R.layout.fragment_mumbai,container,false);
        mumbaiRecyclerView = rootView.findViewById(R.id.mumbai_recycler_view);
        mumbaiRecyclerView.setLayoutManager(new LinearLayoutManager(this.getActivity()));
        PlaceAdapter mumbaiplaceAdapter = new PlaceAdapter(getActivity(),mumbaiPlaceList);
        mumbaiRecyclerView.setAdapter(mumbaiplaceAdapter);
        return rootView;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    private void insertDummyData(){
        mumbaiPlaceList.add(new PlaceInfo(R.drawable.img_gatewayofindia_mumbai,getString(R.string.goi_mumbai_heading),getString(R.string.goi_mumbai_desc)));
        mumbaiPlaceList.add(new PlaceInfo(R.drawable.img_marinedrive_mumbai,getString(R.string.marinedrive_mumbai_heading),getString(R.string.marinedrive_mumbai_desc)));
        mumbaiPlaceList.add(new PlaceInfo(R.drawable.img_juhu_mumbai,getString(R.string.juhu_mumbai_heading),getString(R.string.juhu_mumbai_desc)));
        mumbaiPlaceList.add(new PlaceInfo(R.drawable.img_colaba_mumbai,getString(R.string.colaba_mumbai_heading),getString(R.string.colaba_mumbai_desc)));
    }
}
