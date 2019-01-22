package com.coding

object car{
    var wheels = 4
    fun getSeats(): Int{
        return wheels*2
    }
}

fun main(args: Array<String>) {

    println(car.wheels)
    println(car.getSeats())
}