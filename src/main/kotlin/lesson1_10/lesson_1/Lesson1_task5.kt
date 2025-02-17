package org.example.lesson1_10.lesson_1

fun main () {

    val secondsAll = 6480
    val seconds = secondsAll % secondsInMinute
    val minuteAll = secondsAll / secondsInMinute
    val minute = minuteAll % minuteInHours
    val hours = minuteAll / minuteInHours
    val timeInCosmos = String.format("%02d:%02d:%02d", hours, minute, seconds)

    print(timeInCosmos)

}

const val secondsInMinute = 60
const val minuteInHours = 60