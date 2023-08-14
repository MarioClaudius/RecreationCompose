package com.example.recreationcompose.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object About : Screen("about")
    object DetailRecreation : Screen("home/{recreationId}") {
        fun createRoute(recreationId: Long) = "home/$recreationId"
    }
}