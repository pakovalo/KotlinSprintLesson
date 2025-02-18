package org.example.lesson_11


fun main(){
    val room = Room(
        cover = "https://kotlin.com/cover.jpg",
        roomName = "Kotlin Sprint",
    )

    val member1 = Member(username = "Михаил", avatar = "https://kotlin.com/cover1.jpg")
    val member2 = Member(username = "Иван", avatar = "https://kotlin.com/cover2.jpg")
    val member3 = Member(username = "Вера", avatar = "https://kotlin.com/cover3.jpg")

    room.addMembers(member1)
    room.addMembers(member2, "пользователь заглушен")
    room.addMembers(member3, "разговаривает")

    room.printRoom()

    room.changeStatus("Вера", "разговаривает")

    room.printRoom()
}