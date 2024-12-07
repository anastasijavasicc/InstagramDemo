package com.example.myrecepies.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myrecepies.ui.ProfileScreen
import com.example.myrecepies.ui.RecipeListScreen

@Composable
fun AppNavigation() {
    val navController: NavHostController = rememberNavController()
    NavHost(navController = navController, startDestination = "home") {
     //   composable("home") { HomeScreen(navController) }
        composable("recipe_list") { RecipeListScreen(navController) }
       // composable("recipe_detail") { RecipeDetailScreen(navController) }
        //composable("favorites") { FavoritesScreen() }
        composable("profile") { ProfileScreen() }
    }
}