package org.example.lesson_6

fun main() {

    var counter = 1

    println("Введите колличество секунд в таймере")
    val timer = readln().toInt()

    Thread.sleep(1000)

   while (counter < timer) {
       println("Прошло ${counter++} секунд.")
       Thread.sleep(1000)
   }

    println("Прошло $timer секунд.")
}