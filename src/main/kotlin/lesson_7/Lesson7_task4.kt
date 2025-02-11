package org.example.lesson_7

fun main() {

    var counter = 1
    println("Введите время таймера")
    val timer = readln().toInt()

    for (i in 1..timer)
        if (timer > counter) {
            Thread.sleep(1000)
            println("До конца осталось ${timer - counter}")
            counter++
        } else break

    Thread.sleep(1000)
    println("Время вышло")

}