package org.example.lesson_17

class Folder(
    private val name: String,
    private val filesCount: Int,
    private val isSecret: Boolean,
) {
    val getName: String
        get() = if (isSecret) "скрытая папка" else name

    val getFileCount: Int
        get() = if (isSecret) 0 else filesCount
}

fun main() {
    val secretFolder = Folder("Штатное расписание", 3, true)

    println("Имя папки: ${secretFolder.getName}")
    println("Файлов в папке: ${secretFolder.getFileCount}")
    println()

    val folder = Folder("Мемчики", 567, false)
    println("Имя папки: ${folder.getName}")
    println("Файлов в папке: ${folder.getFileCount}")
}