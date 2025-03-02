package org.example.lesson_16

class Character(
    val name: String,
    private val maxHealth: Int,
    private var hitPower: Int,
    private var health: Int = maxHealth,
) {
    init {
        println("Персонаж $name с здоровьем $health и силой удара $hitPower вступает в бой.")
    }
    private fun characterDeath () {
        println("Ваш персонаж погиб")
        health = 0
        hitPower = 0
        health = 0
    }

    fun takingDamage (damage: Int) {
        if (health - damage > 0 ) {
            health -= damage
            println("Персонаж $name получает $damage едениц урона. Оставшееся здоровье: $health.")
        } else {
            println("Персонаж $name получает $damage едениц урона.")
            characterDeath()
        }
    }

    fun characterHealing (healing: Int) {
        when {
            health + healing <= maxHealth && health > 0 -> {
                health += healing
                println("Персонаж $name получает $healing едениц исцеления. Текущее здоровье: $health.")
            }
            health == 0 -> characterDeath()
            health + healing > maxHealth -> {
                health = maxHealth
                println("Персонаж $name получает $healing едениц исцеления. Текущее здоровье: $health.")
            }
        }
    }
}

fun main() {
    val player = Character("JohnDou", 1000, 100)

    player.takingDamage(300)
    player.takingDamage(350)
    player.characterHealing(100)
    player.takingDamage(400)
    player.characterHealing(250)
    player.takingDamage(350)
}