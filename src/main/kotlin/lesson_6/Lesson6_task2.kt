package org.example.lesson_6

fun main() {

    var counter = 0

    println("Введите колличество секунд в таймере")
    val timer = readln().toInt()


    while (counter < timer) {
       counter++
       Thread.sleep(1000)
    }

    println("Прошло $timer секунд.")
}
