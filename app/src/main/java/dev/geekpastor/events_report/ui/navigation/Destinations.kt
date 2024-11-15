package dev.geekpastor.events_report.ui.navigation

sealed class Destination (val route: Routes){
    data object LoginScreen: Destination(Routes.LoginScreen)
    data object HomeScreen: Destination(Routes.HomeScreen)
}