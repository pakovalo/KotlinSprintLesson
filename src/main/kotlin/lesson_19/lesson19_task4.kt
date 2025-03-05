package org.example.lesson_19

enum class Ammo(val damage: Int) {
    BLUE(5),
    GREEN(10),
    RED(20),
}
class Tank {
    var currentAmmo: Ammo? = null

    fun reload (ammo: Ammo) {
        currentAmmo = ammo
        println("Танк заряжен ${ammo.name}. Урон: ${ammo.damage} ")
    }

    fun shoot () {
        println("Танк выстрелил. Нанесен урон: ${currentAmmo?.damage}")
    }
}

fun main() {
    val tank = Tank()
    tank.reload(Ammo.BLUE)
    tank.shoot()
    tank.reload(Ammo.GREEN)
    tank.shoot()
    tank.reload(Ammo.RED)
    tank.shoot()
}