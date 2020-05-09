package com.example.ribstest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.ribstest.di.component.DaggerPetComponent
import com.example.ribstest.di.module.CatModule
import com.example.ribstest.di.module.DogModule
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var cat: Cat

    @Inject
    lateinit var dog: Dog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        injectComponent()

        Log.v("cat", cat.getCatName())
        Log.v("dog", dog.getDogName())
    }

    private fun injectComponent() {
        DaggerPetComponent.builder()
            .catModule(CatModule())
            .dogModule(DogModule())
            .build()
            .injectTest(this)
    }


}
