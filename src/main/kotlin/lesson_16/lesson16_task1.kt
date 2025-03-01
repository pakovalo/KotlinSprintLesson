package org.example.lesson_16

class  Dice {
    private val roll = (1..6).random()
    fun printNumberOnDice() {
        println("Выпало число: $roll")
    }
}

fun main () {
    val dice = Dice()
    dice.printNumberOnDice()
}