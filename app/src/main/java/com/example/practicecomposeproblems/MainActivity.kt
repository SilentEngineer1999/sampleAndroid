package com.example.practicecomposeproblems

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicecomposeproblems.ui.theme.PracticeComposeProblemsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PracticeComposeProblemsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(getString(R.string.title),
                        getString(R.string.para1), getString(R.string.para2))
                }
            }
        }
    }
}

@Composable
fun Greeting(title: String, para1: String, para2: String, modifier: Modifier = Modifier) {
    val img = painterResource(R.drawable.bg_compose_background)
    Column(
        modifier = modifier
    ) {
        Image(painter = img, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
                .padding(16.dp)
        )
    Text(
        text = para1,
        modifier = Modifier
            .padding(16.dp,0.dp,16.dp,0.dp),
        textAlign = TextAlign.Justify
    )
    Text(
        text = para2,
        modifier = Modifier
            .padding(16.dp),
        textAlign = TextAlign.Justify
    )
    }
}
