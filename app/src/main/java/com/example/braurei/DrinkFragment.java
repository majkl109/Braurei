package com.example.braurei;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class DrinkFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container){
                             Bundle savedInstanceState){
                RecyclerView drinkRecycler = (RecyclerView)inflater.inflate(
                        R.layout.fragment_drink,container,false);

                int [] drinksImages = new int[Drink.drinks.length];
                for(int i = 0; i< drinksImages.length, i++){
                    drinksImages[i] = Drink.drinks[i].getImageResourceId();
            }
                CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(drinksImages);
                drinkRecycler.setAdapter(adapter);
            GridLayoutManager layoutManager = new GridLayoutManager(getActivity(),2);
            drinkRecycler.setLayoutManager(layoutManager);
            return drinkRecycler;
    }
}
