package org.example.lesson_18

class Packages (id: Int) {
    val packagesId: Int = id

    fun printPackages (product: String) {
        println("Заказ номер: $packagesId. Заказан товар: $product.")
    }

    fun printPackages (product: List<String>) {
        println("Заказ номер: $packagesId. Заказаны следующие товары: $product.")
    }
}

fun main() {
    val order1 = Packages(123)
    val order2 = Packages(456)

    order1.printPackages("Подушка")
    order2.printPackages(listOf("Мышка", "Клавиатура", "Диск", "Самокат"))
}