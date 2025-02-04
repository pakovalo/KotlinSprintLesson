package org.example.lesson_4

fun main () {

    val maxCrew = 70
    val minCrew = 55
    val minBoxOfProvisions = 50

    println("Поврежден ли корабль? true или false")

    val shipDamage = readln().toBoolean()

    println("Какова численность экипажа? от 55 до 70")

    val crewSize = readln().toInt()

    println("Сколько ящиков провизии на борту?")

    val boxesOfProvisions = readln().toInt()

    println("Благоприятные ли условия? true или false")

    val weather = readln().toBoolean()

    val shipReadiness: Boolean = (shipDamage == false
            && (maxCrew >= crewSize && crewSize >= minCrew) && boxesOfProvisions > minBoxOfProvisions
            && (weather == false || weather == true)) || (maxCrew == crewSize && weather == true
            && boxesOfProvisions >= minBoxOfProvisions)

    if (shipReadiness == true) {
        println("Корабль может приступить к долгосрочному плаванию!")
    } else {
        println("Корабль НЕ может приступить к долгосрочному плаванию!")
    }

}