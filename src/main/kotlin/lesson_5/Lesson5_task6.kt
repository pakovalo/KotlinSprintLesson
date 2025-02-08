package org.example.lesson_5

import kotlin.math.pow

fun main() {

    val centimetersInMeter  = 100
    val smallMass = 18.5
    val normalMass = 25
    val bigMass = 30
    val weightCategory: String

    println("Введите массу тела в киллограх:")
    val bodyWeight = readln().toDouble()

    println("Введите Ваш рост в сантиметрах:")
    val heightInmeter = (readln().toFloat() / centimetersInMeter)

    val bodyMassIndex = (bodyWeight / heightInmeter.pow(2))
    val roundedBodyMassIndex = String.format("%.2f", bodyMassIndex)

   if (bodyMassIndex < smallMass)
       weightCategory = "Недостаточная масса тела"
    else if (bodyMassIndex >= smallMass && bodyMassIndex < normalMass)
        weightCategory = "Нормальная масса тела"
    else if (bodyMassIndex >= normalMass && bodyMassIndex < bigMass)
        weightCategory = "Избыточная масса тела"
    else
        weightCategory = "Ожирение"

    println("Ваш ИМТ равен $roundedBodyMassIndex  - $weightCategory")
}