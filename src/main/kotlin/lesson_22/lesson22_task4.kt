package org.example.lesson_22

class MainScreenViewModel {

    data class MainScreenState(
        val data: String,
        val isLoading: Boolean = false,
    )

    companion object {
        var mainScreenState = MainScreenState("Данных нет")

        fun loadData() {
            println(mainScreenState)
            Thread.sleep(1000)
            mainScreenState = mainScreenState.copy(isLoading = true)
            println(mainScreenState)
            Thread.sleep(2000)
            mainScreenState = mainScreenState.copy(data = "Данные загружены", isLoading = false)
            println(mainScreenState)
        }
    }
 }

fun main() {
    MainScreenViewModel.loadData()
}