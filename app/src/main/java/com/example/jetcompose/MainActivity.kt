package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetcompose.ui.theme.JetComposeTheme
import com.example.jetpackcomposemissionandroid.jetpackcompose.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JetComposeTheme {
                LoginScreen()
            }
        }
    }
}