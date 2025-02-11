package org.example.lesson_8

fun main () {

    val ingredients = arrayOf("Картофель", "Морковь", "Яйца", "Огурцы", "Колбаса", "Майонез", "Горошек")

    println("Введите искомый ингредиент")
    val product = readln()

    val result = ingredients.indexOf(element = product)

    if (result != -1)
        println("Ингредиент $product в рецепте есть")
    else
        println("Такого ингредиента в рецепте нет")
}