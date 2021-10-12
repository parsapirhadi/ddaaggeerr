package com.example.myapplication;


import javax.inject.Singleton;

import dagger.Component;
@Singleton
@Component
public interface CarComponent {
    Car getcar();

/////////void inject(MainActivity mainActivity);
}
