package com.example.yaroslav_havryshchuk.daggersecondsampleproject.di.util;

/**
 * Created by Yaroslav_Havryshchuk on 10/24/2017.
 */

public interface SubcomponentProvider {
    SubcomponentBuilder provideSubComponent(Class<?> clazz);
}
