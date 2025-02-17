package org.example.lesson1_10.lesson_9

fun main() {

    println("Введите пять ингридиентов через запятую")
    val ingredients = readln()

    val listOfIngredients = ingredients.split(", ").sorted()

    println(listOfIngredients)

}