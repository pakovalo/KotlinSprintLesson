package org.example.lesson_12

import kotlin.random.Random

class WeatherDay(
    daytimeTemperatureKelvin: Int,
    nightTemperatureKelvin: Int,
    downfall: Boolean,
    ) {
    val daytimeTemperature: Int = daytimeTemperatureKelvin - KELVIN_TO_CELSIUS
    val nightTemperature: Int = nightTemperatureKelvin - KELVIN_TO_CELSIUS
    val downfall: Boolean = downfall
}

fun main() {

    val weatherList = mutableListOf<WeatherDay>()

    repeat(DAY_IN_MONTH) {
        val daytimeTemperatureKelvin = (265..305).random()
        val nightTemperatureKelvin = (255..295).random()
        val downfall = Random.nextBoolean()
        weatherList.add(WeatherDay(daytimeTemperatureKelvin, nightTemperatureKelvin, downfall))
        }
    val averageDaytimeTemperature = weatherList.map { it.daytimeTemperature }.average()
    val averageNightTemperature = weatherList.map { it.nightTemperature }.average()
    val daysDownfall = weatherList.count { it.downfall }

    println("Средняя дневная температура: ${"%.2f".format(averageDaytimeTemperature)}°C")
    println("Средняя ночная температура: ${"%.2f".format(averageNightTemperature)}°C")
    println("Количество дней с осадками: $daysDownfall")
}

private const val DAY_IN_MONTH = 30
private const val KELVIN_TO_CELSIUS = 275