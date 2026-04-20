package com.example.jetcompose.androidbasics

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetcompose.JetpackCompose.SnackBarExample
import com.example.jetcompose.JetpackCompose.ToastExample
import com.example.jetcompose.JetpackCompose.c13_navigation_bar.NavBarHomeScreen
import com.example.jetcompose.JetpackCompose.c13_navigation_bar.NavBarNavigation
import com.example.jetcompose.ui.theme.JetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate called!")
        enableEdgeToEdge()

        setContent {
            JetComposeTheme {

                SnackBarExample()



            }
        }
    }

    override fun onStart(){
        super.onStart()
        println("onStart() called!")
    }
    override fun onResume(){
        super.onResume()
        println("onResume() called!")

    }
    override fun onPause(){
        super.onPause()
        println("onPause() called!")
    }
    override fun onStop(){
        super.onStop()
        println("onStop() called!")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy() called!")
    }
}