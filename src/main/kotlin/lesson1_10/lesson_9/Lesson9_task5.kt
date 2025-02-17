package org.example.lesson1_10.lesson_9


fun main() {

    var counter = 1

    println("Ведите название ${counter}го ингредиента")
    val yourIngredient = readln()

    val ingredientsMutableSet = mutableSetOf(yourIngredient.lowercase())
    counter++

    do {
        println("Ведите название ${counter}го ингредиента")
        val yourIngredient = readln().lowercase()
        ingredientsMutableSet.add(yourIngredient)
        counter++
    } while (MAX_INGREDIENT >= counter)

    var ingredients = ingredientsMutableSet.toMutableList()

    ingredients.sort()

    val formatedIngredients = ingredients.joinToString(", ").replaceFirstChar { char -> char.uppercase() }

    println(formatedIngredients)
}

const val MAX_INGREDIENT = 5