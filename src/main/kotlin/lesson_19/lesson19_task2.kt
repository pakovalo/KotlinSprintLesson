package org.example.lesson_19

enum class Category {
    CLOTH,
    STATIONERY,
    MISCELLANEOUS;

    fun displayName (): String {
        return when(this) {
            CLOTH -> "Одежда"
            STATIONERY -> "Канцелярские товары"
            MISCELLANEOUS -> "Разное"
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: Category,
) {
    fun printProduct() {
        println("Товар: $name, ID: $id, Категория: ${category.displayName()}")
    }
}

fun main() {
    val product1 = Product("Брюки", 1, Category.CLOTH)
    val product2 = Product("Карандаш", 2, Category.STATIONERY)
    val product3 = Product("Самокат", 3, Category.MISCELLANEOUS)

    product1.printProduct()
    product2.printProduct()
    product3.printProduct()
}