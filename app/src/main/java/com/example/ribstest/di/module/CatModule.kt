package com.example.ribstest.di.module

import com.example.ribstest.Cat
import dagger.Module
import dagger.Provides

@Module
class CatModule {

    @Provides
    fun provideCat() : Cat{
        return Cat()
    }

}