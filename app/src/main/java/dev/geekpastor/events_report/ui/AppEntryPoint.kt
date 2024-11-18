package dev.geekpastor.events_report.ui

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Logout
import androidx.compose.material.icons.filled.Person4
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FabPosition
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.google.firebase.Firebase
import com.google.firebase.auth.auth
import dev.geekpastor.events_report.ui.navigation.AppNavHost
import dev.geekpastor.events_report.ui.navigation.Destination
import dev.geekpastor.events_report.ui.navigation.isCurrentDestination
import dev.geekpastor.events_report.ui.navigation.navigate
import dev.geekpastor.events_report.ui.theme.EventsreportTheme


@OptIn(ExperimentalMaterial3Api::class)
fun ComponentActivity.installUI(){
    enableEdgeToEdge()
    setContent{
        EventsreportTheme {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {
                val navController = rememberNavController()
                val destination = navController.currentBackStackEntryAsState().value?.destination
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        AnimatedVisibility(
                            visible = showTopBar(destination),
                            enter = fadeIn(),
                            exit = fadeOut()
                        ) {
                            TopAppBar(
                                title ={
                                    Text(
                                        text = appBarTitle(destination)
                                    )
                                },
                                actions = {
                                    if (destination.isCurrentDestination(Destination.HomeScreen)){
                                        IconButton(
                                            onClick = {
                                                navController.navigate(Destination.ProfileScreen.route.name)
                                            }
                                        ) {
                                            Icon(
                                                imageVector = Icons.Default.Person4,
                                                contentDescription = "Navigate to profile",
                                                modifier = Modifier
                                                    .size(50.dp)
                                            )
                                        }
                                    } else  if (destination.isCurrentDestination(Destination.ProfileScreen)){
                                        IconButton(
                                            onClick = {
                                                Firebase.auth.signOut()
                                                navController.navigate(Destination.LoginScreen.route.name)
                                            }
                                        ) {
                                            Icon(
                                                imageVector = Icons.Default.Logout,
                                                contentDescription = "Logout",
                                                modifier = Modifier
                                                    .size(50.dp)
                                            )
                                        }
                                    }
                                },
                                navigationIcon ={
                                    if (!destination.isCurrentDestination(Destination.HomeScreen)){
                                        IconButton(
                                            onClick = {
                                                navController.popBackStack()
                                            }
                                        ) {
                                            Icon(
                                                imageVector = Icons.Default.ArrowBack,
                                                contentDescription = "Back",
                                                modifier = Modifier
                                                    .size(50.dp)
                                            )
                                        }
                                    }
                                }
                            )
                        }
                    },
                    floatingActionButton = {
                        if (destination.isCurrentDestination(Destination.ProfileScreen)){
                            FloatingActionButton(
                                onClick = {
                                    navController.navigate(Destination.CreatePostScreen.route.name)
                                }
                            ){
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Navigate to profile"
                                )
                            }
                        }
                    },
                    floatingActionButtonPosition = FabPosition.Center
                ) {
                    Column(
                        modifier = Modifier
                    ) {
                        AppNavHost(modifier = Modifier.padding(it), navController = navController)
                    }
                }
            }
        }
    }
}

fun appBarTitle(destination: NavDestination?): String{
    return if (destination.isCurrentDestination(Destination.ProfileScreen)){
        "Profile"
    } else if (destination.isCurrentDestination(Destination.CreatePostScreen)){
        "Creer un Post"
    } else if (destination.isCurrentDestination(Destination.PostDetailsScreen)){
        "Details"
    } else{
        "Event Report"
    }
}

fun showTopBar(destination: NavDestination?): Boolean{
    return !(destination.isCurrentDestination(Destination.LoginScreen))
}