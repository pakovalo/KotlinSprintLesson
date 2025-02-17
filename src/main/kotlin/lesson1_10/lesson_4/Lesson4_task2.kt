package org.example.lesson1_10.lesson_4

fun main () {

    val averageWeightFrom = 35
    val averageWeightTo = 100
    val averageVolumeTo = 100
    val weightOfCargo1 = 20
    val volumeOfCargo1 = 80
    val weightOfCargo2 = 50
    val volumeOfCargo2 = 100

    println ("Груз весом $weightOfCargo1 кг и объемом $volumeOfCargo1 л соответствует категории 'Average': " +
            "${(weightOfCargo1 > averageWeightFrom) && (volumeOfCargo1 <= averageWeightTo) && (volumeOfCargo1 < averageVolumeTo)}\n" +
            "Груз весом $weightOfCargo2 кг и объемом $volumeOfCargo2 л соответствует категории 'Average': " +
            "${(weightOfCargo2 > averageWeightFrom) && (volumeOfCargo2 <= averageWeightTo) && (volumeOfCargo2 < averageVolumeTo)}"
    )

}