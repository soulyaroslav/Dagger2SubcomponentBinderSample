package com.example.yaroslav_havryshchuk.daggersecondsampleproject;

import android.app.Application;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.DaggerAppComponent;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.SubcomponentBuilder;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

public class App extends Application {

    @Inject
    Map<Class<?>, Provider<SubcomponentBuilder>> subcomponentBuilders;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent.builder().build().inject(this);
    }

    public Map<Class<?>, Provider<SubcomponentBuilder>> getSubcomponentBuilders() {
        return subcomponentBuilders;
    }
}
