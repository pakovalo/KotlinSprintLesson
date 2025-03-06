package org.example.lesson_20

class Character(
    val name: String,
    val maxHealth: Int,
    var health: Int,
) {
    fun printCharacter (){
        println("Имя игрока: $name. Максимальное здоровье: $maxHealth. Текущее здоровье: $health")
    }
}

fun main() {
    val character = Character("Char", 1000, 100)
    character.printCharacter()
    val healPotion: (Character) -> Unit = {
        char -> char.health = char.maxHealth
        println("${char.name} пьет лечебное зелье. Его здоровье полностью восстановлено.")
    }
    healPotion(character)
    character.printCharacter()
}