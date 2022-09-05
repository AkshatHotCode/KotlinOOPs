package com.example.oopdema

import android.util.Log

class Driver(var name : String, credit : Int) {
    var totalCredit  = 50
    val car = Car()

    init{
        totalCredit += credit
        car.maxSpeed = 150
        car.start()
    }

    fun showDetails(){
        Log.i("MyTag", "Name of the driver is $name with $totalCredit")
    }
}