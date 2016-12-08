package com.example.mauriziopietrantuono.app.dagger.carsandanimals;

import com.example.mauriziopietrantuono.app.MainActivity;

import dagger.Component;

@Component(modules = CarModule.class)
public interface CarComponent {

    void inject(MainActivity mainActivity);

}
