package org.example.lesson_15

interface Search {
    fun search()
}

abstract class Product(
    val name: String,
    val stock: Int,
) {
    fun print() {
        println("Товар: $name, остаток на складе $stock.")
    }
}

class Instrument (
    name: String,
    stock: Int,
) : Product (name, stock), Search {
    override fun search() {
        println("Ищем комплектующие для пролукта $name")
    }
}
class Components (
    name: String,
    stock: Int,
): Product (name, stock)

fun main() {
    val piano = Instrument("Пианино", 10)
    val keys = Components("Клавиши", 100)

    piano.print()
    piano.search()
    keys.print()
}