package org.example.lesson_7

fun main () {

    println("Ведите конечное число")
    val finiteNumber = readln().toInt()

    val numberRange = 0..finiteNumber

    for (i in numberRange step STEP_FOR_EVEN) {
        println(i)
    }
}

const val STEP_FOR_EVEN = 2