package com.example.oopdema

import android.util.Log

class Car {
    var maxSpeed = 30
    fun start() {
        Log.i("MyTag", "Car is starting")
        Log.i("MyTag", "car speed is $maxSpeed")
    }
}