package com.example.gymapputm

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
             NavHost()
    }

    }
    }
@Composable
fun NavHost() {
    val navController = rememberNavController()

    androidx.navigation.compose.NavHost(
        navController = navController,
        startDestination = "FullBody"
    ) {
        composable("FullBody") {
            FullBody(navController)// This is your home screen that contains the Day1BoxButtons
        }
        composable("mountainClimber") {
            MountainClimberScreen(navController)
        }
        // Add composable functions for other screens here
    }
}