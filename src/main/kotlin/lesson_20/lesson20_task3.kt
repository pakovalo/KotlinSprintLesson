package org.example.lesson_20

class Player(
   val name: String,
    val hasKey: Boolean,
)

fun main() {
    val player = Player("JohnDou", true)

    val openDoor: (Player) -> Unit = {
        if (player.hasKey)
            println("Игрок ${player.name} открыл дверь.")

    else
        println("Дверь заверта.")
    }
    openDoor(player)
}