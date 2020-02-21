package com.example.braurei;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class DrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container){
                             Bundle savedInstanceState){
                RecyclerView drinkRecycler = (RecyclerView)inflater.inflate(
                        R.layout.fragment_drink,container,false);

    }
}
