package org.example.lesson_15

abstract class User(
    val userName: String,
    val email: String,
) {
    fun read() {
        println("$userName читает форум")
    }
    fun write (message: String) {
        println("$userName: $message")
    }
}
class RegularUser (userName: String, email: String): User(userName, email)

class Admin (userName: String, email: String): User(userName, email) {
    fun deleteMsg (id: Int) {
        println("Администратор $userName удалил сообщение номер $id")
    }
    fun deleteUser (user: User) {
        println("Администратор $userName удалил пользователя ${user.userName}")
    }
}

fun main(){
    val regularUser = RegularUser("Александр","123@examle.com")
    val admin = Admin("Admin", "456@examle.com")

    regularUser.read()
    regularUser.write("Всем привет")
    admin.read()
    admin.write("Что тут происходит?")
    admin.deleteMsg(159754)
    admin.deleteUser(regularUser)
}