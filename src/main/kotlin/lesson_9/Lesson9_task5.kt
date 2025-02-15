package org.example.lesson_9


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

    val ingredients = ingredientsMutableSet.toMutableList()

    ingredients.sort()
    ingredients[0] = ingredients[0].replaceFirstChar { char -> char.uppercase() }
    println(ingredients)
}
const val MAX_INGREDIENT = 5