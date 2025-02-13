package org.example.lesson_9


fun main() {

    var counter = 1

    println("Ведите название ${counter}го ингредиента")
    val yourIngredient = readln()
    val ingredients = mutableListOf(yourIngredient.lowercase())
    counter++

    do {
        println("Ведите название ${counter}го ингредиента")
        val yourIngredient = readln()
        val searchElementLower = yourIngredient.lowercase()
        val found = ingredients.any { it.lowercase() == searchElementLower }

        if (found) {
            println("Такой игредиент уже есть!")
            continue
        } else {
        ingredients.add(yourIngredient.lowercase())
        }
        counter++
    } while (MAX_INGREDIENT >= counter)

    ingredients.sort()
    ingredients[0] = ingredients[0].replaceFirstChar { char -> char.uppercase() }
    println(ingredients)
}
const val MAX_INGREDIENT = 5