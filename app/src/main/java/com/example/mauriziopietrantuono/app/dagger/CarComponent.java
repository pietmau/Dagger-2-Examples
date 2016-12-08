package com.example.mauriziopietrantuono.app.dagger;

import com.example.mauriziopietrantuono.app.MainActivity;
import com.example.mauriziopietrantuono.app.pojos.cars.Car;

import dagger.Component;

@Component(modules = CarModule.class)
public interface CarComponent {

    void inject(MainActivity mainActivity);

}
