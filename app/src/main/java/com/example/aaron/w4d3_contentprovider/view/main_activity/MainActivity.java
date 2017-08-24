package com.example.aaron.w4d3_contentprovider.view.main_activity;
/************************************************************************************
 ************************************************************************************
 **     1. Create a a custom content provider with an underlying                   **
 **      SQL database(Create any database with at least 5 columns and 10 rows).    **
 **      Then retrieve data from that content provider and populate the            **
 **      recyclerViewAdd the following features to the same app                    **
 **     2. Use VectorDrawable to create an image using an xml                      **
 **     3. Create a button behavior using StateListDrawable                        **
 **********************************************************************************/

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.aaron.w4d3_contentprovider.MainActivity.DaggerMainActivityComponent;
import com.example.aaron.w4d3_contentprovider.R;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View{
    @Inject
    MainActivityPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        createDagger();
        //presenter.init();
        //presenter.initEntries();
       // presenter.initDatabase();
        presenter.getInfo();

    }
    private void createDagger() {
        DaggerMainActivityComponent.create().inject(this);
    }

    @Override
    public void showError(String s) {

    }

    @Override
    public void onSaveData(boolean isSaved) {

    }
}
