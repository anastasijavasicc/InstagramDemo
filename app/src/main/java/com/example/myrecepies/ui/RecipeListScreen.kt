package com.example.myrecepies.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.myrecepies.model.Recipe


@Composable
fun RecipeListScreen(navController: NavController) {
    val recipes = listOf(
        Recipe("Pasta", "A delicious pasta recipe."),
        Recipe("Pizza", "A classic margherita pizza.")
    )

    LazyColumn {
        items(recipes.size) { index ->
            val recipe = recipes[index]
            Text(
                text = recipe.name,
                modifier = Modifier
                    .padding(16.dp)
                    .clickable { navController.navigate("recipe_detail") }
            )
        }
    }
}
