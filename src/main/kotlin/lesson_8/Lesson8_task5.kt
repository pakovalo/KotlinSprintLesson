package org.example.lesson_8

import java.util.Arrays

fun main () {
    var ingredients: Array<String> = arrayOf()
    println("Сколько будет элементов?")
    val arraySize = readln().toInt()

    for (i in 1..arraySize) {
        println("Какой будет ${i}ый ингредиент?")
        val product = readln()
        ingredients += product
    }
    println(Arrays.toString(ingredients))
}