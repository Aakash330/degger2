package com.example.degger2use;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    //follow of code-first of constructor second is field inject and third is method inject by degger2

   //field inject
    @Inject Engine engine;
    private Wheels wheels;
    //constructor injection
    @Inject
    public Car( Wheels wheels) {
        this.wheels = wheels;
    }


    //method injection
    @Inject
    public void enableRemote(Remote remote) {
        remote.setListener(this);
    }

    public void drive() {
        Log.d(TAG, "driving...");
    }
}
