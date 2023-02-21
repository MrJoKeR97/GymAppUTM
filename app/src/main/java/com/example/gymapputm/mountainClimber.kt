package com.example.gymapputm

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun MountainClimberScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFE7E7E7))
    )
    {
        Column(
            verticalArrangement = Arrangement.spacedBy(12.dp),
            modifier = Modifier.verticalScroll(
                rememberScrollState()
            )
        ) {
            Workout_type1(
                imageId = R.drawable.fullbody,
                title = "FULL BODY\r\nWORKOUT",
                colors = listOf(Color(0xFFA39EC2), Color(0xFF3313FC)),
                ContDesc = "image1"
            )
            DayBox1(
                frontText = "Mountain Climber",
                timeText = "30 s",
                imageId = R.drawable.fullbody,
            )


        }
    }
}


@Composable
fun Workout_type1(imageId: Int, title: String, colors: List<Color>, ContDesc: String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(),
    )
    {
        Box(
            modifier = Modifier
                .size(200.dp)
                .background(
                    brush = Brush.verticalGradient(
                        colors = colors
                    )
                )
        ) {
            Image(
                painter = painterResource(id = imageId),
                contentDescription = ContDesc,
                modifier = Modifier.fillMaxSize() ,
                contentScale = ContentScale.Crop
            )
            Box(modifier = Modifier
                .fillMaxSize()
                .padding(),
                contentAlignment = Alignment.TopStart){
                Text(
                    text = title,
                    fontSize = 25.sp
                )
            }
        }
    }
}

@Composable
fun DayBox1(
    frontText: String,
    timeText: String,
    imageId: Int
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(1.dp)
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .size(170.dp, 120.dp)
                .padding(bottom = 16.dp),
            contentScale = ContentScale.Crop
        )
        Text(
            text = frontText,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 40.sp
        )
        Text(
            text = timeText,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 20.sp
        )
    }
}


