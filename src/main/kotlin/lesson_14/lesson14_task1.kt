package org.example.lesson_14

open class Liner (
    val name: String = "Лайнер",
    val speed: Int = 2000,
    val capacity: Int = 200,
    ) {

    open fun printShip() {
        println()
        println("Тип корабля: $name")
        println("Скорость: $speed узлов")
        println("Вместимость: $capacity пассажиров")
    }
}

class CargoShip(
) : Liner (
    name = "Грузовой корабль",
    speed = 1000,
    )

class Icebreaker (
    val skill: String = "Может колоть лёд"
) : Liner (
    name = "Ледокол",
    speed = 800,
    capacity = 150
) {
    override fun printShip() {
        super.printShip()
        println("Дополнительные возможности: $skill")
    }
}

fun main() {
    val liner = Liner()
    val cargoShip = CargoShip()
    val icebreaker = Icebreaker()

    liner.printShip()
    cargoShip.printShip()
    icebreaker.printShip()
}