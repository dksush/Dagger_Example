package com.example.ribstest.di.module

import com.example.ribstest.Dog
import dagger.Module
import dagger.Provides

@Module
class DogModule {

    @Provides
    fun provideDog() : Dog{
        return Dog()
    }
}