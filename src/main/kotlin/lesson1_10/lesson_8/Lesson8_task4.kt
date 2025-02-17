package org.example.lesson1_10.lesson_8

import java.util.Arrays

fun main () {

    val ingredients: Array<String> = arrayOf("Картофель", "Морковь", "Яйца", "Огурцы", "Колбаса", "Майонез", "Горошек")

    println(Arrays.toString(ingredients))

    println("Какой ингредиент вы хотите заменить?")
    val product = readln()

    val result = ingredients.indexOf(element = product)

    if (result != -1) {

        println("Какой ингредиент вы хотите добавить?")
        val newProduct = readln()

        ingredients[result] = newProduct
        println(Arrays.toString(ingredients))
    } else
        println("Такого ингредиента в рецепте нет")
}