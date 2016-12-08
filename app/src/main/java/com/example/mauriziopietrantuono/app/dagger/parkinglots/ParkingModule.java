package com.example.mauriziopietrantuono.app.dagger.parkinglots;

import com.example.mauriziopietrantuono.app.pojos.cars.Car;
import com.example.mauriziopietrantuono.app.pojos.cars.ParkingLot;

import dagger.Module;
import dagger.Provides;

@Module
public class ParkingModule {

    @Provides
    ParkingLot providesParkingLot(Car car){return new ParkingLot(car);}

}
