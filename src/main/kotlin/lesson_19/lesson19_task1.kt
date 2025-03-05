package org.example.lesson_19

enum class Fish (val nameFish: String) {
    GUPPY ("Гуппи"),
    ANGELFISH("Скалярия"),
    GOLDFISH("Золотая рыбка"),
    SIAMESE_FIGHTING_FISH("Петушок"),
}

fun main() {
    println("Вы можете добавить в аквариум следующих рыб:")
    Fish.entries.forEach { println("${it.nameFish}") }
}