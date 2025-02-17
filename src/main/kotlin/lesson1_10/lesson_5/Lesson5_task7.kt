package org.example.lesson1_10.lesson_5

fun main() {

    val fuelFlowDivider = 100

    println("Введите расстояние поездки в киллометрах:")
    val distance = readln().toDouble()

    println("Введите расход топлива на 100км (в литрах):")
    val fuelConsumption = readln().toFloat()

    println("Введите цену за литр топлива:")
    val fuelPrice = readln().toFloat()

    val fuelSpent = distance * fuelConsumption / fuelFlowDivider
    val roundedFuelSpent = String.format("%.2f", fuelSpent)
    val costOfFuel = fuelSpent * fuelPrice
    val roundedCostOfFuel = String.format("%.2f", costOfFuel)

    println("Необходимо топлива: $roundedFuelSpent \nСтоимость поездки: $roundedCostOfFuel")

}