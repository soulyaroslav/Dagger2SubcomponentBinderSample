package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.App;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

@Singleton
@Component(modules = {AppModule.class, SubcomponentBinderModule.class})
public interface AppComponent {

    void inject(App app);
}
