package dev.geekpastor.events_report.ui



import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import dev.geekpastor.events_report.ui.navigation.AppNavHost
import dev.geekpastor.events_report.ui.theme.EventsreportTheme


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
                    }
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