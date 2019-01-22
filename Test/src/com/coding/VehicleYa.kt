package com.coding

class VehicleYah(var wheels :Int) {

    fun getSeats(): Int{
        return wheels*2
    }

}

fun main(args: Array<String>) {

    var s = VehicleYah(5)
    println(s.wheels)
    println(s.getSeats())

}