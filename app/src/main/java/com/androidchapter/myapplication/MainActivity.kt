package com.androidchapter.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.androidchapter.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                MyApp {
                    Text("Hello Again 2")
                }
            }
        }
    }
}

@Composable
fun MyApp(content: @Composable () -> Unit) {

    Surface(color = MaterialTheme.colors.background) {
        content()
    }
}

@Preview
@Composable
fun TopHeader() {
    Surface(
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
//            .clip(shape = RoundedCornerShape(corner = CornerSize(12.dp)))
            .clip(shape = CircleShape.copy(all = CornerSize(12.dp))),
//        color = Color.Black
        color = Color(0xFFE9D7F7)
    ) {
        Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            Text(text = "Total Per Person")
            Text(text = "$134")
        }

    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp {
        Text(text = "Hello There")
    }
}
