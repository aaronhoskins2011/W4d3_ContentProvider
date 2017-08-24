package com.example.aaron.w4d3_contentprovider.MainActivity;

import com.example.aaron.w4d3_contentprovider.view.main_activity.MainActivityPresenter;

import dagger.Module;
import dagger.Provides;

/**
 * Created by aaron on 8/22/17.
 */

@Module
public class MainActivityModule {
    //@Singleton
    @Provides
    MainActivityPresenter provideMainActivityPresenter(){
        return new MainActivityPresenter();
    }
}
