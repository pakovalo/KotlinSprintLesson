package org.example.lesson_1

fun main () {

    val secondsAll = 6480
    val seconds = secondsAll % 60
    val minuteAll = secondsAll / 60
    val minute = minuteAll % 60
    val hours = minuteAll  / 60

    if (hours < 10) {
        print("0"+ hours)
    } else {
        print(hours)
    }
    print(":")

    if (minute < 10) {
        print("0" + minute)
    } else {
        print(minute)
    }
    print(":")

    if (seconds < 10) {
         print("0" + seconds)
    } else {
         print(seconds)
    }

}