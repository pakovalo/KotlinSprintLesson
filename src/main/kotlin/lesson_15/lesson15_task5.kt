package org.example.lesson_15

interface Movement {
    fun move()
}
interface PassengerTransport {
    val name: String
    val maxPassenger: Int
    var currentPassenger: Int

    fun loadPassengers(passengers: Int) {
        if (currentPassenger + passengers <= maxPassenger) {
            currentPassenger += passengers
            println("$name: $passengers пассажиров. Всего на транспорте $currentPassenger пассажиров.")
        } else println("$name: Нет возможности посадить $passengers пассажиров. Превышена максимальная вместимость.")
    }

    fun unloadPassengers(passengers: Int) {
        if (currentPassenger - passengers >= 0) {
          currentPassenger -= passengers
          println("$name: Высажено $passengers пассажиров. Всего на транспорте $currentPassenger пассажиров.")
        } else println("$name: Нет возможности высадить $passengers пассажиров. И вас нет столько пасажиров:)")
    }
}

interface CargoTransport {
    val name: String
    val maxCargo: Double
    var currentCargo: Double

    fun loadCargo(cargo: Double) {
        if (currentCargo + cargo <= maxCargo) {
            currentCargo += cargo
            println("$name: Погружено $cargo тонн груза. Всего на транспорте $currentCargo тонн груза.")
        } else println("$name: Нет возможности погрузить $cargo тонн груза. Превышена максимальная грузоподъемность.")
    }

    fun unloadCargo(cargo: Double) {
        if (currentCargo - cargo >= 0) {
            currentCargo -= cargo
            println("$name: Выгружено $cargo тонн груза. Всего на транспорте $currentCargo тонн груза.")
        } else println("$name: Нет возможности выгрузить $cargo тонн груза. Недостаточно груза.")
    }
}

class Truck (override val name: String): Movement, PassengerTransport, CargoTransport {
    override val maxPassenger: Int = 1
    override var currentPassenger: Int = 0
    override val maxCargo: Double = 2.0
    override var currentCargo: Double = 0.0

    override fun move() {
        println("$name едет с $currentPassenger пасажирами на борту и $currentCargo тонн груза.")
    }
}

class Car (override val name: String): Movement, PassengerTransport {
    override val maxPassenger: Int = 3
    override var currentPassenger: Int = 0

    override fun move() {
        println("$name движется с $currentPassenger пассажирами.")
    }
}

fun main() {
    val car1 = Car("Легковой автомобиль №1")
    val car2 = Car("Легковой автомобиль №2")
    val truck = Truck("Грузовой автомобиль №1")

    car1.move()
    car2.move()
    truck.move()
    car1.loadPassengers(2)
    car1.move()
    car2.loadPassengers(1)
    car2.move()
    truck.loadPassengers(1)
    truck.loadCargo(0.5)
    truck.move()
    car1.loadPassengers(1)
    car1.move()
    car2.loadPassengers(1)
    car2.move()
    truck.loadCargo(1.5)
    truck.move()
    car1.unloadPassengers(3)
    car2.unloadPassengers(2)
    truck.unloadPassengers(1)
    truck.unloadCargo(2.0)
}