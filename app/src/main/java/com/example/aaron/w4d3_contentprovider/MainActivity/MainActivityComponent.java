package com.example.aaron.w4d3_contentprovider.MainActivity;

import com.example.aaron.w4d3_contentprovider.view.main_activity.MainActivity;

import dagger.Component;

/**
 * Created by aaron on 8/22/17.
 */
@Component(modules = MainActivityModule.class)
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
