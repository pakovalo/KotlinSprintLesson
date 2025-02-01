package org.example.lesson_2

import java.time.LocalTime

fun main () {

    val departureTime = LocalTime.of(9, 39)
    val travelTimeInMinutes = 457
    val travelTimeHours = (travelTimeInMinutes / minuteInHours).toLong()
    val travelTimeMinutes = (travelTimeInMinutes % minuteInHours).toLong()
    val arrivalTime = departureTime.plusHours(travelTimeHours).plusMinutes(travelTimeMinutes)

    println("Время прибытия поезда: $arrivalTime")

}

const val minuteInHours = 60