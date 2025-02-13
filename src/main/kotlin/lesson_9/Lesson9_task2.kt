package org.example.lesson_9

fun main() {

    val ingredients = mutableListOf("Картофель", "Морковь", "Яйца")

    println("В рецепте есть базовые ингредиенты: \n$ingredients")

    println("Желаете добавить еще?")
    val needToAdd = readln().toString()

    if (POSITIVE_ANSWER.equals(needToAdd, ignoreCase = true)) {

        println("Какой ингридиент вы хотите добавить?")
        val addIngredient = readln()
        ingredients.add(addIngredient)

        println("Теперь в рецепте есть следующие ингредиенты: \n$ingredients")

    }
}

const val POSITIVE_ANSWER = "Да"