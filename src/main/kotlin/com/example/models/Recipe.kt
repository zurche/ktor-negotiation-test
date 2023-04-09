package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class Recipe(val id: Int, val type: String)

val recipeStorage = listOf(
    Recipe(1, RecipeType.BREAKFAST.name)
)
