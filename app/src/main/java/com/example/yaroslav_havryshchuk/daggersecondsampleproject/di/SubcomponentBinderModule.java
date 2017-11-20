package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.main.MainActivityComponent;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.SubcomponentBuilder;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.SubcomponentKey;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

@Module
public abstract class SubcomponentBinderModule {

    @Binds
    @IntoMap
    @SubcomponentKey(MainActivityComponent.Builder.class)
    abstract SubcomponentBuilder bindMainActivityComponent(MainActivityComponent.Builder builder);
}
