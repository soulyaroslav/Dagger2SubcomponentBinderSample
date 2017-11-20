package com.example.yaroslav_havryshchuk.daggersecondsampleproject;

import android.os.Bundle;
import android.util.Log;

import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.main.MainActivityComponent;
import com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.main.MainActivityModule;

import javax.inject.Inject;

public class MainActivity extends BaseActivity {

    @Inject
    String name;

    private MainActivityComponent.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        inject();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("TAG", name);
    }

    @Override
    protected void inject() {
        builder = (MainActivityComponent.Builder) provideSubComponent(MainActivityComponent.Builder.class);
        builder.homeActivityModule(new MainActivityModule("Activity"))
                .build()
                .inject(this);
    }
}
