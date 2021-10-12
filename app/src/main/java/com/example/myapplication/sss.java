package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class sss extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sss);
        CarComponent component=DaggerCarComponent.create();
        Car car=component.getcar();//////////////////component.inject(this);///////reverse with this line to inject feild
        car.drive();
        Log.e("{{{{{{",""+car.getString());
    }
}
