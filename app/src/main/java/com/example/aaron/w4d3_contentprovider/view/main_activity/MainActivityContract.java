package com.example.aaron.w4d3_contentprovider.view.main_activity;

import android.view.View;

import com.example.aaron.w4d3_contentprovider.BasePresenter;
import com.example.aaron.w4d3_contentprovider.BaseView;

/**
 * Created by aaron on 8/23/17.
 */

public interface MainActivityContract {

    interface View extends BaseView {
        void onSaveData(boolean isSaved);
    }


    interface Presenter extends BasePresenter<View> {
        void saveDataTCloud(String s);
    }
}
