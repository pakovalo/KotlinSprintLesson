package org.example.lesson_2

import java.time.LocalTime

fun main () {

    val departureTime = LocalTime.of(9, 39)
    val travelTimeInMinutes = 457
    val travelTimeHours = (travelTimeInMinutes / MINUTES_IN_HOUR).toLong()
    val travelTimeMinutes = (travelTimeInMinutes % MINUTES_IN_HOUR).toLong()
    val arrivalTime = departureTime.plusHours(travelTimeHours).plusMinutes(travelTimeMinutes)

    print("Время прибытия поезда: $arrivalTime")

}

const val MINUTES_IN_HOUR  = 60
