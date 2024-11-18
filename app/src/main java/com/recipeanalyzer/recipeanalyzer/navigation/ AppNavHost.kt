package com.yourappname.recipeanalyzer.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yourappname.recipeanalyzer.ui.LandingScreen

@Composable
fun AppNavHost() {
    val navController: NavHostController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "landing"
    ) {
        composable("landing") {
            LandingScreen(
                onAddRecipeClicked = { navController.navigate("addRecipe") },
                onScanBarcodeClicked = { navController.navigate("scanBarcode") }
            )
        }
        composable("addRecipe") {
            // Placeholder for Add Recipe Screen
        }
        composable("scanBarcode") {
            // Placeholder for Scan Barcode Screen
        }
    }
}
