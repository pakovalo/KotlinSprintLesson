package org.example.lesson_14

open class LinerTask2 (
    val name: String = "Лайнер",
    val speed: Int = 2000,
    val capacity: Int = 200,
    val loadingMethod: String = "выдвигает горизонтальный трап со шкафута",
) {
    open fun printShipTask2() {
        println()
        println("Тип корабля: $name")
        println("Скорость: $speed узлов")
        println("Вместимость: $capacity пассажиров")
        println("Способ погрузки: $loadingMethod пассажиров")
    }
}

class CargoShipTask2(
) : LinerTask2 (
    name = "Грузовой корабль",
    speed = 1000,
    loadingMethod = "активирует погрузочный кран",
)

class IcebreakerTask2 (
    val skill: String = "Может колоть лёд"
) : LinerTask2 (
    name = "Ледокол",
    speed = 800,
    capacity = 150,
    loadingMethod = "открывает ворота со стороны кормы",
) {
    override fun printShipTask2() {
        super.printShipTask2()
        println("Дополнительные возможности: $skill")
    }
}

fun main() {
    val linerTask2 = LinerTask2()
    val cargoShipTask2 = CargoShipTask2()
    val icebreakerTask2 = IcebreakerTask2()

    linerTask2.printShipTask2()
    cargoShipTask2.printShipTask2()
    icebreakerTask2.printShipTask2()
}