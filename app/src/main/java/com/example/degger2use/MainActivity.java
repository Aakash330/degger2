package com.example.degger2use;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.degger2use.databinding.ActivityMainBinding;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding mainBinding;
   @Inject Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mainBinding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mainBinding.getRoot());
        CarComponent carComponent=DaggerCarComponent.create();
        carComponent.injectfield(MainActivity.this);
        car.drive();
    }
}