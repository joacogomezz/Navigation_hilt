package com.alilopez.kt_demohilt.core.navigation

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alilopez.demo.features.jsonplaceholder.presentation.screens.PostsScreen
import com.alilopez.demo.features.rickandmorty.presentation.screens.CharactersScreen
import com.alilopez.kt_demohilt.features.home.presentation.screens.HomeScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.Home.route
    ) {
        composable(NavRoutes.Home.route) {
            HomeScreen(
                onNavigateToPosts = { navController.navigate(NavRoutes.Posts.route) },
                onNavigateToCharacters = { navController.navigate(NavRoutes.Characters.route) }
            )
        }

        composable(NavRoutes.Posts.route) {
            PostsScreen(
                onBackClick = { navController.popBackStack() }
            )
        }

        composable(NavRoutes.Characters.route) {
            CharactersScreen(
                viewModel = hiltViewModel(),
                onBackClick = { navController.popBackStack() }
            )
        }
    }
}
