package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.main;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.MainActivity;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.Component;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.SubcomponentBuilder;

import dagger.Subcomponent;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends Component<MainActivity> {

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<MainActivityComponent> {
        Builder homeActivityModule(MainActivityModule module);
    }
}
