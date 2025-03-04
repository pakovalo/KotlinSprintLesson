package org.example.lesson_19

class Spaceship {

    fun shipTakeoff() {
        println("Космический корабль взлетает.")
    }

    fun shipLanding() {
        TODO("добавить логику преземления")
    }

    fun shipFiring() {
        // TODO требуется реализация метода
    }
}

fun main() {
    val ship = Spaceship()
    ship.shipTakeoff()
    ship.shipLanding()
}