package com.example.degger2use;

import android.util.Log;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {
    private static final String TAG = "WheelsModule";

    @Provides
    static Rims provideRims() {
        Log.d(TAG, "provideRims: ");
        return new Rims();
    }

    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        Log.d(TAG, "provideTires: ");
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        Log.d(TAG, "provideWheels: ");
        return new Wheels(rims, tires);
    }
}
