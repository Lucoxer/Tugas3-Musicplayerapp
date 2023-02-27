package edu.uksw.fti.pam.acitivityintent.ui

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.ui.graphics.vector.ImageVector

open class ButtonNavItem (
    val title: String,
    val icon : ImageVector,
    val screen_route: String
        ){
    object Home: ButtonNavItem("Home", Icons.Default.PlayArrow, screen_route = "Home")
    object Article: ButtonNavItem("Search", Icons.Default.Search, screen_route = "Search")
    object Favorite: ButtonNavItem("Favorite", Icons.Default.Favorite, screen_route = "Favorite")
    object Profile: ButtonNavItem("Profile", Icons.Default.Person, screen_route = "Profile")
}