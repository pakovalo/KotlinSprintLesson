package org.example.lesson_17

class Ship(
    name: String,
    var averageSpeed: Int,
    var homePort: String,
) {
    var name: String = name
        set(value) {
            println("Имя корабля менять нельзя!\n")
        }

    fun printShip() {
        println("Корабль: $name\nСредняя скорость: $averageSpeed узлов\nПорт приписки: $homePort\n")
    }
}

fun main() {
    val ship = Ship("Пытливый", 32, "Севастополь")
    ship.printShip()

    ship.name = "Адмирал Макаров"

    ship.averageSpeed = 22
    ship.homePort = "Новороссийск"

    ship.printShip()
}