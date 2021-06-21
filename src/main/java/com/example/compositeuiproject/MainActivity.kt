package com.example.compositeuiproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.*
import androidx.core.graphics.createBitmap
import com.example.compositeuiproject.ui.theme.CompositeUIProjectTheme

class MainActivity : ComponentActivity() {
    @ExperimentalUnitApi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            ComposablePreview()
            }


    }

    @ExperimentalUnitApi
    @Preview
    @Composable
    fun ComposablePreview() {
        Column (modifier = Modifier
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())){
            Image(
                painter = painterResource(R.drawable.happy_meal_small),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .height(300.dp)
                    .fillMaxWidth()

            )

            Column (
                modifier = Modifier
                    .padding(16.dp)
                    .background(Color.White)
                    .fillMaxWidth()
            ){

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Text(
                        text = "Happy Meal",
                        style = TextStyle(
                            color = Color.Blue,
                            fontSize = TextUnit(26.0F,type = TextUnitType.Sp)
                        )
                    )

                    Text(
                        text = "$5.99",
                        style = TextStyle(
                            fontSize = TextUnit(16.0F,type = TextUnitType.Sp)
                        ),
                        modifier = Modifier.align(Alignment.CenterVertically)
                    )
                }


                Spacer(modifier = Modifier.padding(top = 10.dp))
                Text(
                    text = "800 Calories" ,
                    style = TextStyle(
                        fontSize = TextUnit(16.0F,type = TextUnitType.Sp)
                    )
                )
                Spacer(modifier = Modifier.padding(top = 10.dp))
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                ) {
                    Text (text = "Order now")
                }


            }

        }
    }
}
