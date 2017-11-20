package com.example.yaroslav_havryshchuk.daggersecondsampleproject;

import android.app.Activity;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.SubcomponentBuilder;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util.SubcomponentProvider;

import java.util.Map;

import javax.inject.Inject;
import javax.inject.Provider;

/**
 * Created by Yaroslav_Havryshchuk on 10/24/2017.
 */

public abstract class BaseActivity extends Activity implements SubcomponentProvider {

    @Inject
    Map<Class<?>, Provider<SubcomponentBuilder>> subcomponentBuilders;

    @Override
    public SubcomponentBuilder provideSubComponent(Class<?> clazz) {
        return subcomponentBuilders.get(clazz).get();
    }

    protected abstract void inject();
}
