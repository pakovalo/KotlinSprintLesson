package org.example.lesson_11

class Category(
    val id: Int,                    // идентификатор
    val name: String,               // название категории
    val imageUrl: String,           // картинка категории
    val briefDescription: String,   // краткое описание категории
)

class Ingredient(
    val id: Int,                    // идентификатор
    val name: String,               // название ингредиента
    val quantity: Int,              // количество
    val unitMeasurement: String,    // единица измерения
)

class Recipe(
    val id: Int,                        // идентификатор
    val title: String,                  // название рецепта
    val imageUrl: String,               // Ссылка на изображение рецепта
    val categoryId: Int,                // Идентификатор категории, к которой относится рецепт
    val ingredients: List<Ingredient>,  // Список ингредиентов
    val steps: List<String>,            // Шаги приготовления
)