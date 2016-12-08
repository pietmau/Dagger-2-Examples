package com.example.mauriziopietrantuono.app.dagger.carsandanimals;

import com.example.mauriziopietrantuono.app.pojos.animals.Dog;
import com.example.mauriziopietrantuono.app.pojos.animals.Tail;
import com.example.mauriziopietrantuono.app.pojos.cars.Car;
import com.example.mauriziopietrantuono.app.pojos.cars.Motor;

import dagger.Module;
import dagger.Provides;

@Module
public class CarModule {

    @Provides
    Dog provideDog(Tail tail) {
        return new Dog(tail);
    }

    @Provides
    Tail provideTail(){
        return new Tail();
    }
}
