package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.main;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

@Module
public class MainActivityModule {

    private String name;

    public MainActivityModule(String name) {
        this.name = name;
    }

    @Provides
    String provideActivityName() {
        return name;
    }
}
