package org.example.lesson_19

enum class Fish {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")
    for (fish in Fish.entries)
        when (fish) {
            Fish.GUPPY -> println("Гуппи")
            Fish.ANGELFISH -> println("Скалярия")
            Fish.GOLDFISH -> println("Золотая рыбка")
            Fish.SIAMESE_FIGHTING_FISH -> println("Петушок")
        }
}