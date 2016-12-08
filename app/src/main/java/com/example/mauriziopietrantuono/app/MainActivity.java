package com.example.mauriziopietrantuono.app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.mauriziopietrantuono.app.dagger.CarComponent;
import com.example.mauriziopietrantuono.app.dagger.CarModule;
import com.example.mauriziopietrantuono.app.dagger.DaggerCarComponent;
import com.example.mauriziopietrantuono.app.pojos.animals.Dog;
import com.example.mauriziopietrantuono.app.pojos.cars.Car;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject Car car;
    @Inject Dog dog;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder().carModule(new CarModule()).build();
        component.inject(this);
    }

}
