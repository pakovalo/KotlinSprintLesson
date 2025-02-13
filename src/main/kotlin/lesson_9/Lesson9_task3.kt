package org.example.lesson_9

fun main () {

    val needEggs = 2
    val needMilk = 50
    val needButter = 15

    val oneServing = mutableListOf(needEggs, needMilk, needButter)

    println ("Сколько нужно порций?")
    val serving = readln().toInt()

    val severalServing = oneServing.map { it * serving }

    println("На $serving порций Вам понадобится: Яиц - ${severalServing.get(0)}, молока - ${severalServing.get(1)}, " +
            "сдивочного масла - ${severalServing.get(2)}")

}