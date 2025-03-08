package org.example.lesson_21

class Character(
    val name: String,
    val maxHealth: Int,
    var health: Int,
)
fun Character.isHealthy(): Boolean {
    return health == maxHealth
}

fun main() {
    val character1 = Character("Char", 1000, 100)
    val character2 = Character("Char", 1000, 1000)

    println("Здоровье персонажа 1 максимально: ${character1.isHealthy()}")
    println("Здоровье персонажа 2 максимально: ${character2.isHealthy()}")

}