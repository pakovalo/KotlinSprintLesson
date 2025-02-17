package org.example.lesson1_10.lesson_1

fun main (){

    val year: Short = 1961
    var hour: String = "09"
    var minute: String = "05"

    println(year)
    println(hour)
    println(minute)

    hour = "10"
    minute = "55"

    val time = "$hour:$minute"

    print(time)

}
