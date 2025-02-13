package org.example.lesson_9

fun main() {

    val ingredients = listOf("Картофель", "Морковь", "Яйца", "Огурцы", "Колбаса", "Майонез", "Горошек")

    println("В рецепте есть следующие ингридиенты:")
    ingredients.forEach { println(it) }

}

