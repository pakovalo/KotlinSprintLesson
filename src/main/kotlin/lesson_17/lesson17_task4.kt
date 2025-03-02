package org.example.lesson_17

class  Package(
    val number: Int,
    location: String,
) {
    private var moveCounter: Int = 0

    var newLocation: String = location
        set(value) {
            field = value
            moveCounter++
        }

    fun printPackage() {
        println("Посылка с №$number: Текущее местоположение $newLocation. Колличество перемещений : $moveCounter.")
    }
}

fun main() {
    val departure = Package(123, "Москва")
    departure.printPackage()

    departure.newLocation = "Краснодар"
    departure.printPackage()

    departure.newLocation = "Лондон"
    departure.printPackage()
}
