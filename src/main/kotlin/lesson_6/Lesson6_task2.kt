package org.example.lesson_6

fun main() {

    println("Введите колличество секунд в таймере")
    val timer = readln().toLong()
    val sleepTime = timer * MILLISECONDS_IN_SECOND

    Thread.sleep(sleepTime)

    println("Прошло $timer секунд.")
}

const val MILLISECONDS_IN_SECOND = 1000