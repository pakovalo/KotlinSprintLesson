package org.example.lesson_11

class Member(
    val username: String,
    val avatar: String,
)

class Room(
    val cover: String,
    val roomName: String,
) {
    val members: MutableMap <Member, String> = mutableMapOf()

    fun addMembers(member: Member, status: String = "микрофон выключен") {
        members[member] = status
        println("Участник ${member.username} добавлен в комнату.")
    }

    fun changeStatus(username: String, newStatus: String) {
        val member = members.keys.find { it.username == username }
        if (member != null) {
            members[member] = newStatus
            println("Статус участника $username обновлен на: $newStatus")
        }
    }

    fun printRoom() {
        println("Комната: $roomName")
        println("Обложка: $cover")
        println("Участники:")
        members.forEach { (participant, status) ->
            println("- ${participant.username} (аватар: ${participant.avatar}), статус: $status")
        }
    }
}

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