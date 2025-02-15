package org.example.lesson_10

fun main() {

    val numberTheDiceComp = throwTheDiceComp()
    val numberTheDiceMan = throwTheDiceMan()

    println("Бросок кубика машиной: $numberTheDiceComp")
    println("Бросок кубика человеком: $numberTheDiceMan")

    if (numberTheDiceMan > numberTheDiceComp)
        println("Победило человечество")
    else if (numberTheDiceMan < numberTheDiceComp)
        println("Победила машина")
    else println("Победила дружба")

}

fun throwTheDiceComp () : Int { return (1..6).random() }

fun throwTheDiceMan () : Int { return (1..6).random() }