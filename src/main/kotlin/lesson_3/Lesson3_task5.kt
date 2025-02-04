package org.example.lesson_3

fun main() {

    val moveInChess = "D2-D4;0"
    val parsString = moveInChess.split("-", ";")
    val from = parsString.get(0)
    val to = parsString.get(1)
    val move = parsString.get(2)

    println("Откуда: $from")
    println("Куда: $to")
    print("Откуда: $move")

}