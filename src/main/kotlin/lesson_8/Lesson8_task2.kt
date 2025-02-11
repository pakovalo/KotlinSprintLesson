package org.example.lesson_8

fun main () {

    val ingredients = arrayOf("Картофель", "Морковь", "Яйца", "Огурцы", "Колбаса", "Майонез", "Горошек")

    println("Введите искомый ингредиент")
    val product = readln()

    for (i in 0..ingredients.size - 1)
        if (ingredients[i] == product) {
            println("Ингредиент $product в рецепте есть")
            return
        }

    println("Такого ингредиента в рецепте нет")
}