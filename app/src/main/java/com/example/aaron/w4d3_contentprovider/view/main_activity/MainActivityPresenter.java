package com.example.aaron.w4d3_contentprovider.view.main_activity;

import com.example.aaron.w4d3_contentprovider.model.ContentProvider.FirebaseHelper;
import com.example.aaron.w4d3_contentprovider.model.ContentProvider.SellItem;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by aaron on 8/23/17.
 */

public class MainActivityPresenter implements MainActivityContract.Presenter {
    MainActivityContract.View view;
    FirebaseDatabase database;
    DatabaseReference myRef;
    DatabaseReference movieReference;
    List<SellItem> sellItemList = new ArrayList<>();


    //@Override
    public void onSaveData(boolean isSaved) {

    }

    @Override
    public void attachView(MainActivityContract.View view) {

    }

    @Override
    public void detatchView(MainActivityContract.View view) {

    }

    @Override
    public void saveDataTCloud(String s) {

    }

    public void initDatabase(){
        for(SellItem item : sellItemList){
            myRef.child(item.getItemName()).setValue(item);
        }
    }

    public void initEntries(){
        String[] itemNames = {"Item 1", " Item 2", "Item 3", "Item 4", "Item 5", "Item 6", "Item 7", "Item 8", "Item 9", "Item 10"};
        String[] itemDescription = {"Description 1", " Description 2", "Description 3", "Description 4", "Description 5", "Description 6", "Description 7", "Description 8", "Description 9", "Description 10"};
        String[] itemManufacture = {"Manufacture 1", " Manufacture 2", "Manufacture 3", "Manufacture 4", "Manufacture 5", "Manufacture 6", "Manufacture 7", "Manufacture 8", "Manufacture 9", "Manufacture 10"};
        int[] itemRating = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
        double[] itemPrice = {10.00, 20.00, 30.00, 40.00, 50.00, 60.00, 70.00, 80.00, 90.00, 100.00};

        for (int i = 0; i < itemNames.length; i++) {
            sellItemList.add(new SellItem(itemNames[i],itemDescription[i], itemManufacture[i], itemRating[i],itemPrice[i]));
        }
    }

    public void getInfo(){
        FirebaseHelper fh = new FirebaseHelper();

        fh.getDatabaseList();
    }



}
