package com.example.jetcompose.JetpackCompose

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun CardExample() {

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Card(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 16.dp),
            shape = CircleShape,
            colors = CardDefaults.cardColors(
//                containerColor = Color(0xFFE3F2FD)
//                 containerColor = Color.Blue.copy(alpha = 0.4f),
                containerColor = Color.Blue,
                contentColor = Color.White
            ),
            elevation= CardDefaults.cardElevation(
                defaultElevation = 50.dp
            ),
            border = BorderStroke(width = 2.dp, color=Color.Green)

        ){

            Text(
                text="This is a card!",
                fontSize = 20.sp,
                modifier = Modifier.padding(16.dp)
            )

        }

    }

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CardExample2(){

    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Card(modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White
            ),
            elevation = CardDefaults.cardElevation())
        {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically
            ){

                Box(
                    modifier = Modifier
                        .size(100.dp)
                        .background(
                            color=Color.LightGray,
                            shape = CircleShape
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    Icon(imageVector = Icons.Default.Person,
                        contentDescription = "Profile Pictue",
                        modifier = Modifier.size(50.dp),
                        tint=Color.Gray
                    )
                }
                Spacer(modifier = Modifier.width(12.dp))

                Column() {
                    Text(text="Neat Roots",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold)

                    Spacer(modifier = Modifier.height(6.dp))

                    Text(text="The most subscribed youtube channel for App Development!",
                        fontSize = 12.sp,

                        color=Color.DarkGray)
                }

            }

        }
    }

}