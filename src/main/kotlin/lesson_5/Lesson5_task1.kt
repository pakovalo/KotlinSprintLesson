package org.example.lesson_5

import kotlin.random.Random

fun main () {

    val randomNumber1 = (1..10).random()
    val randomNumber2 = (1..10).random()
    val result = randomNumber1 + randomNumber2

    println("Ведите результат сложения чисел $randomNumber1 и $randomNumber2 и нажмите Enter")

    val yourResult = readln().toInt()

    if (result == yourResult)
        println("Добро пожаловать!")
    else
        println("Результат не верен!")
}