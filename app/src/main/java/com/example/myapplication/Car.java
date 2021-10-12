package com.example.myapplication;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Singleton;
@Singleton
public class Car {
String string;
private Driver driver;
    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Inject
    public Car(Driver driver) {
        this.driver=driver;
    }
    public void drive(){
        Log.e("drive","drive");

    }
}
