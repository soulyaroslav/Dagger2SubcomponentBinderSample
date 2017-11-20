package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di;

import android.content.Context;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.App;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.main.MainActivityComponent;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

@Module(subcomponents = MainActivityComponent.class)
public class AppModule {

    @Provides
    @Singleton
    static Context provideAppContext(App app) {
        return app;
    }
}
