package com.example.aaron.w4d3_contentprovider;

/**
 * Created by aaron on 8/23/17.
 */

public interface BasePresenter <V extends BaseView> {

    void attachView(V view);
    void detatchView(V view);
}
