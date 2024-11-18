package dev.geekpastor.events_report.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.auth.FirebaseAuth
import dev.geekpastor.events_report.ui.screens.createPost.CreatePostScreenRoute
import dev.geekpastor.events_report.ui.screens.home.HomeScreenRoute
import dev.geekpastor.events_report.ui.screens.login.LoginScreenRoute
import dev.geekpastor.events_report.ui.screens.postDetails.PostDetailsScreenRoute
import dev.geekpastor.events_report.ui.screens.profile.ProfileScreenRoute

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
) {
    val auth = remember {
        FirebaseAuth.getInstance().currentUser
    }

    val isLoggedIn = auth != null

    fun getStartDestination(): String{
        return if (isLoggedIn) {
            Destination.HomeScreen.route.name
        } else {
            Destination.LoginScreen.route.name
        }
    }

    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = getStartDestination()
    ) {

        composable(route = Destination.LoginScreen.route.name){
            LoginScreenRoute(
                navigateToHome = {
                    navController.navigate(Destination.HomeScreen.route.name){
                        popUpTo(Destination.LoginScreen.route.name){
                            inclusive = true
                        }
                    }
                }
            )

        }

        composable(route = Destination.HomeScreen.route.name){
            HomeScreenRoute(
                navigateToDetails = {
                    navController.navigate(Destination.PostDetailsScreen.route.name)
                }
            )
        }

        composable(route = Destination.PostDetailsScreen.route.name){
            PostDetailsScreenRoute()
        }

        composable(route = Destination.CreatePostScreen.route.name){
            CreatePostScreenRoute()
        }

        composable(route = Destination.ProfileScreen.route.name){
            ProfileScreenRoute()
        }
    }

}