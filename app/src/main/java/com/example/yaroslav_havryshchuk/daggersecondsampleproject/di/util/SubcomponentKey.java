package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import dagger.MapKey;

/**
 * Created by Yaroslav_Havryshchuk on 10/23/2017.
 */

@MapKey
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface SubcomponentKey {
    Class<?> value();
}
