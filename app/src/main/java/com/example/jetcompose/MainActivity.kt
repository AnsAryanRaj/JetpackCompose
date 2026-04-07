package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetcompose.JetpackCompose.c13_navigation_bar.NavBarHomeScreen
import com.example.jetcompose.JetpackCompose.c13_navigation_bar.NavBarNavigation
import com.example.jetcompose.ui.theme.JetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JetComposeTheme {

                NavBarNavigation()










            }
        }
    }
}