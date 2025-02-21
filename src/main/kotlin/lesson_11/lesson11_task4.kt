package org.example.lesson_11

class Category(
    val id: Int,
    val name: String,
    val imageUrl: String,
    val briefDescription: String,
    val Recipe: List<Recipe>
)

class Ingredient(
    val id: Int,
    val name: String,
    val quantity: Int,
    val unitMeasurement: String,
)

class Recipe(
    val id: Int,
    val title: String,
    val imageUrl: String,
    val categoryId: Int,
    val ingredients: List<Ingredient>,
    val steps: List<String>,
)