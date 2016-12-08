package com.example.mauriziopietrantuono.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mauriziopietrantuono.app.dagger.carsandanimals.CarModule;
import com.example.mauriziopietrantuono.app.dagger.parkinglots.DaggerParkingComponent;
import com.example.mauriziopietrantuono.app.pojos.cars.ParkingLot;

import javax.inject.Inject;

public class SecondActivity extends AppCompatActivity {
    @Inject ParkingLot parkingLot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        DaggerParkingComponent.builder().carModule(new CarModule()).build().inject(SecondActivity.this);
    }
}
