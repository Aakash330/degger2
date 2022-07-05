package com.example.degger2use;

import dagger.Component;
import dagger.Module;

@Component( modules ={WheelsModule.class})
public interface CarComponent {
    Car getCar();

    void injectfield(MainActivity mainActivity);
}
