package com.example.jetcompose.JetpackCompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetcompose.R


@Composable
fun ImageExample(){

    //There are two types of images Raster(pixel based) and another is Vector(line based)

    //Name of the image should be always in lowercase
    //always choose that drawable with the package name
    Image(

        painter = painterResource(R.drawable.datetrees),
        contentDescription = "Image go DateTrees",
        modifier = Modifier
            .padding(16.dp)
            .size(300.dp)
            .clip(shape= RoundedCornerShape(16.dp)),
        contentScale = ContentScale.FillBounds

    )

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun IconExample(){

    Column(Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {

        Icon(
            imageVector = Icons.Default.Person,
            contentDescription = "Profile Icon",
            modifier = Modifier.size(100.dp),
            tint = Color.Blue
        )
    }

    //we can use inbuilt icons in the android studion using default


}