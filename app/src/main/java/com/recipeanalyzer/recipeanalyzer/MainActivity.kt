package com.recipeanalyzer.recipeanalyzer

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.yourappname.recipeanalyzer.navigation.AppNavHost
import com.yourappname.recipeanalyzer.ui.theme.RecipeAnalyzerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecipeAnalyzerTheme {
                AppNavHost()
            }
        }
    }
}
