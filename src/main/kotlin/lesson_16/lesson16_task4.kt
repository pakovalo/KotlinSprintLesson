package org.example.lesson_16

class Order(
    val orderID: Int,
    private var orderStatus: String = "Создан",
) {
    init {
        println("Ваш заказ с номером: $orderID принят. Статус заказаза: $orderStatus.")
    }

    fun changeStatus(status: String) {
        orderStatus = status
        println("Статус заказа $orderID изменен. Новый статус $orderStatus.")
    }
}

fun manager(order: Order, newStatus: String) {
    println("Заявка ${order.orderID} принята в работу менеджером.")
    order.changeStatus(newStatus)
}

fun main() {
    val order = Order(1)
    manager(order, "В работе")
}