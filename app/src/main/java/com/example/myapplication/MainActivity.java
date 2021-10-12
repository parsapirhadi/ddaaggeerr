package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component=DaggerCarComponent.builder().build();
        component.getcar().setString("77777777777");
        Car car=component.getcar();//////////////////component.inject(this);///////reverse with this line to inject feild
        car.drive();
        car.setString("555555555");

        startActivity(new Intent(this,sss.class));

    }
}