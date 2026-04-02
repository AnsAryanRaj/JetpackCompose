package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetcompose.JetpackCompose.CardExample2
import com.example.jetcompose.JetpackCompose.RememberSaveableExample
import com.example.jetcompose.JetpackCompose.StateManagementExample
import com.example.jetcompose.JetpackCompose.c10_navigation.LoginScreenUI
import com.example.jetcompose.ui.theme.JetComposeTheme
import com.example.jetpackcomposemissionandroid.jetpackcompose.AlertDialogExample

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JetComposeTheme {

                LoginScreenUI()


            }
        }
    }
}