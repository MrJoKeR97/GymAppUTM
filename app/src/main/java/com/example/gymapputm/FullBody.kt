package com.example.gymapputm

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun FullBody(navController: NavController) {

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
                Workout_type(
                    imageId = R.drawable.fullbody,
                    title = "FULL BODY\r\nWORKOUT",
                    colors = listOf(Color(0xFFA39EC2), Color(0xFF3313FC)),
                    ContDesc = "image1"
                )


                 Day1BoxButton(
                     frontText = "Mountain Climber",
                     timeText = "30 s",
                     imageId = R.drawable.fullbody,
                     onClick = { navController.navigate("mountainClimber") }
                 )

                 Day1BoxButton(
                     frontText = "Squats",
                     timeText = "30 s",
                     imageId = R.drawable.fullbody,
                     onClick = { navController.navigate("squats") }
                 )

                 Day1BoxButton(
                     frontText = "High Stepping",
                     timeText = "30 s",
                     imageId = R.drawable.fullbody,
                     onClick = { navController.navigate("highStepping") }
                 )

                 Day1BoxButton(
                     frontText = "Push-Ups",
                     timeText = "30 s",
                     imageId = R.drawable.fullbody,
                     onClick = { navController.navigate("pushUps") }
                 )

                 Day1BoxButton(
                     frontText = "Reverse Crunches",
                     timeText = "30 s",
                     imageId = R.drawable.fullbody,
                     onClick = { navController.navigate("reverseCrunches") }
                 )

                 Day1BoxButton(
                     frontText = "Burpee",
                     timeText = "30 s",
                     imageId = R.drawable.fullbody,
                     onClick = { navController.navigate("burpee") }
                 )

                }
        }

}
@Composable
fun Workout_type(imageId: Int, title: String, colors: List<Color>, ContDesc: String) {
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
fun Day1BoxButton(
    frontText: String,
    timeText: String,
    imageId: Int,
    onClick: () -> Unit
) {
    Button(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(145.dp)
            .padding()
    ) {
        DayBox(frontText, timeText, imageId)
    }
}

@Composable
fun DayBox(
    frontText: String,
    timeText: String,
    imageId: Int
) {
    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = null,
            modifier = Modifier
                .padding(end = 16.dp)
                .size(130.dp, 86.dp),
            contentScale = ContentScale.Crop
        )
        Column(verticalArrangement = Arrangement.spacedBy(1.dp)) {
            Text(
                text = frontText, modifier = Modifier
                    .padding(start = 24.dp), fontSize = 40.sp
            )
            Text(
                text = timeText, modifier = Modifier
                    .padding(start = 24.dp), fontSize = 20.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
               }