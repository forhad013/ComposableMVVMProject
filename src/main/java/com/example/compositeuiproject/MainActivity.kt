package com.example.compositeuiproject

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compositeuiproject.ui.theme.CompositeUIProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "Hey look idhaar")
                Spacer(modifier = Modifier.padding(16.dp))
                Button(onClick = { Log.e("batman says: " , "AGHHHhhhhh") }) {
                    Text(text = "Bat button")
                }
            }
            }
        }
    }


