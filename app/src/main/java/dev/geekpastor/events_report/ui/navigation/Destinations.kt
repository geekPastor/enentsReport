package dev.geekpastor.events_report.ui.navigation

import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavOptionsBuilder

sealed class Destination (val route: Routes){
    data object LoginScreen: Destination(Routes.LoginScreen)
    data object HomeScreen: Destination(Routes.HomeScreen)
    data object PostDetailsScreen: Destination(Routes.PostDetailsScreen)
}

fun NavDestination?.isCurrentDestination(destination: Destination): Boolean{
    return this?.hierarchy?.any{
        it.route == destination.route.name
    } == true
}

fun NavController.navigate(
    destination: Destination,
    builder: (NavOptionsBuilder.() -> Unit)? = null
){
    if (builder != null){
        try {
            navigate(destination.route.name, builder)
        }catch (e: Exception){
            navigate(destination.route.name)
        }
    }else{
        navigate(destination.route.name)
    }
}