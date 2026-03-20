package com.alilopez.kt_demohilt.core.navigation

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Posts : NavRoutes("posts")
    object Characters : NavRoutes("characters")
}
