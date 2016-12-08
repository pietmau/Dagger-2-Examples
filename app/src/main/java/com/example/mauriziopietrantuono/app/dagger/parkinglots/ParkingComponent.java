package com.example.mauriziopietrantuono.app.dagger.parkinglots;


import com.example.mauriziopietrantuono.app.SecondActivity;
import com.example.mauriziopietrantuono.app.dagger.carsandanimals.CarModule;

import dagger.Component;

@Component(modules = ParkingModule.class, dependencies = CarModule.class)
public interface ParkingComponent {

    void inject(SecondActivity mainActivity);
}
