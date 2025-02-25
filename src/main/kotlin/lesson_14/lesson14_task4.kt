package org.example.lesson_14

open class CelestialBody (
    val name: String,
    val hasAtmosphere: Boolean,
    val isLanding: Boolean,
) {
    open fun planetPrint () {
        println("Название: $name")
        println("Атмосфера: ${if (hasAtmosphere) "есть" else "нет"}")
        println("Пригодность для высадки: ${if (isLanding) "да" else "нет"}")
    }
}

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLanding: Boolean,
    val satellites: List<Satellites> = emptyList()
): CelestialBody (name, hasAtmosphere, isLanding){
    override fun planetPrint() {
        super.planetPrint()
        if (satellites.isNotEmpty()) {
            println("Спутники:")
            satellites.forEach { it.planetPrint() }
        } else println("Спутники отсутсвуют")
    }
}

class Satellites (
    name: String,
    hasAtmosphere: Boolean,
    isLanding: Boolean,
) : CelestialBody(name, hasAtmosphere,isLanding)

fun main() {
    val satellite1 = Satellites(
        "Луна",
        false,
        true,
    )
    val satellite2 = Satellites(
        "Деймос",
        false,
        false,
    )
    val planet = Planet(
        "Земля",
        false,
        false,
        satellites = listOf(satellite1, satellite2)
    )

    planet.planetPrint()
}