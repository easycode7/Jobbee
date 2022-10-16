package com.example.findjobwithjobbee

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun AnimatedSplashScreen() {
    Splash()
}

@Composable
fun Splash() {
    Box(modifier = Modifier
        .background(if (isSystemInDarkTheme()) Color.Black else Color(205, 159, 40))
        .fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
    Image(painter = painterResource(id = R.drawable.im_jobbeelogo), contentDescription = null,
    modifier = Modifier.size(160.dp))
    }
}