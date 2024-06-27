package com.example.tabuzo_act1_3


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            act1()
            act2()
            act3()
        }
    }
}


@Composable
fun act1(){
    val image = painterResource(id = R.drawable.jetpack_header)
    Column {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth(),
            contentScale = ContentScale.FillWidth
        )
        Text(
            text = "Jetpack Compose tutorial",
            fontSize = 30.sp,
            modifier = Modifier
                .padding(15.dp)
        )
        Text(
            text = "Jetpack Compose is a modern toolkit for building native Android UI. " +
                    "Compose simplifies and accelerates UI development on Android with less code"+
                    "powerful tools, and intuitive Kotlin APIs.",
            fontSize = 15.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(start = 15.dp,end=15.dp),
        )
        Text(
            text = "In this tutorial, you build a simple UI component with declarative functions. " +
                    "You call Compose functions to say what elements you want and the Compose compiler does the rest."+
                    "Compose is built around Composable functions. These functions let you define your app\\'s UI programmatically because they let you describe how it should look and provide data dependencies, rather than focus on the process of the UI\\'s construction, such as initializing an element and then attaching it to a parent. To create a Composable function, you add the @Composable annotation to the function name.",
            fontSize = 15.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(top = 15.dp,start = 15.dp,end=15.dp),
        )
    }
}
@Composable
fun act2()
{
    Column (
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Image(
            painter = painterResource(id = R.drawable.checkicon),
            contentDescription = null,
            modifier = Modifier
                .width(280.dp)
                .height(280.dp)
        )
        Text(
            text ="All tasks Completed",
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(top = 30.dp, bottom = 8.dp)
        )
        Text(
            text = "Nice work!",
            fontSize = 20.sp
        )
    }

}

@Composable
fun act3() {
    Box (
        modifier = Modifier
            .fillMaxSize()
    ){
        Card(
            colors = CardDefaults.cardColors(
               containerColor = Color(0xFFEADDFF)


                ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f),


            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Text Composable",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "Display text and follows the recommended Material Design guidelines.",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFD0BCFF)


                ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .align(Alignment.TopEnd),



            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Image Composable",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "Creates a composable that lays out and draws a given Painter class Object.",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }

        Card(
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFB69DF8)


                ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .align(Alignment.BottomStart),



            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Row Composable",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }

        Card(
            colors = CardDefaults.cardColors(
                Color(0xFFF6EDFF)
            ),
            shape = RectangleShape,
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(0.5f)
                .align(Alignment.BottomEnd),

            ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

                Text(
                    text = "Column Composable",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 16.dp),

                    )

                Text(
                    text = "A layout composable that places its children in a vertical sequence",
                    lineHeight = 20.sp,
                    textAlign = TextAlign.Justify,

                    )
            }

        }


    }

}
//Change 1
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    act1()
}

