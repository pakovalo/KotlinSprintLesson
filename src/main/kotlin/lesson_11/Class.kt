package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printUser() {
        println("id Пользователя: $id")
        println("Логин пользователя: $login")
        println("Пароль пользователя: $password")
        println("Email Пользователя: $email")
        println("Информация о пользователе: ${bio ?: "Не указано"}")

    }

    fun enterBiography() {
        println("Напишите о себе:")
        bio = readln()
        println("Информация обновлена.")

    }

    fun updatePassword() {
        println("Если вы хотете поменять пароль введите текущий:")
        val currentPassword = readln()
        if (currentPassword == password) {
            println("Введите новый пароль:")
            val newPassword = readln()
            password = newPassword
            println("Пароль успешно изменен!")
        } else println("Не верный пароль.")
    }
}

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
