package com.example.jetcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetcompose.JetpackCompose.LazyColumnExample
import com.example.jetcompose.JetpackCompose.NestedLazyExample
import com.example.jetcompose.JetpackCompose.TypesOfItem
import com.example.jetcompose.JetpackCompose.c10_navigation.LoginScreenUI
import com.example.jetcompose.ui.theme.JetComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            JetComposeTheme {

                TypesOfItem()



            }
        }
    }
}