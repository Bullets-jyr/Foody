package com.example.foody

import com.example.foody.models.FoodRecipe
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface FoodRecipesApi {

    // https://api.spoonacular.com/recipes/complexSearch?number=1&apiKey=&type=finger food&diet=vegan&addRecipeInformation=true&fillIngredients=true
    @GET("/recipes/complexSearch")
    suspend fun getRecipes(
        @QueryMap queries: Map<String, String>
    ): Response<FoodRecipe>
}