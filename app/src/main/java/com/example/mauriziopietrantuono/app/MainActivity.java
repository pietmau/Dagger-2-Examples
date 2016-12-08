package com.example.mauriziopietrantuono.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mauriziopietrantuono.app.dagger.carsandanimals.CarComponent;
import com.example.mauriziopietrantuono.app.dagger.carsandanimals.CarModule;
import com.example.mauriziopietrantuono.app.dagger.carsandanimals.DaggerCarComponent;
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
        component.inject(MainActivity.this);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });
    }

}
