package com.example.ribstest.di.component

import com.example.ribstest.MainActivity
import com.example.ribstest.di.module.CatModule
import com.example.ribstest.di.module.DogModule
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [CatModule::class, DogModule::class])
interface PetComponent {

    fun injectTest(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {

        fun build(): PetComponent

        fun dogModule(dogModule: DogModule): Builder
        fun catModule(catModule: CatModule): Builder
    }
}