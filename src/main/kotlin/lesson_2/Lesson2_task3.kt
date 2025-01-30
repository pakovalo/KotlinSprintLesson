package org.example.lesson_2

import java.time.LocalTime

fun main () {

    val departureTime = LocalTime.of(9, 39)
    val travelTimeInMinutes = 457
    val travelTimeHours = (travelTimeInMinutes / 60).toLong()
    val travelTimeMinutes = (travelTimeInMinutes % 60).toLong()
    val arrivalTime = departureTime.plusHours(travelTimeHours).plusMinutes(travelTimeMinutes)

    println("Время прибытия поезда: $arrivalTime")

}