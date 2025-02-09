package org.example.lesson_6

fun main() {

    val endTimer = 0

    println("Введите колличество секунд в таймере")
    var timer = readln().toInt()

    while (endTimer < timer) {
        println("Осталось ${timer--} секунд.")
        Thread.sleep(1000)
    }

    println("Время вышло")
}