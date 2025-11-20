package com.example.loulou

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.loulou.ui.theme.LoulouTheme
import android.view.View

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        findViewById<View>(R.id.Question).setOnClickListener {
            findViewById<View>(R.id.Question).visibility=View.INVISIBLE
        findViewById<View>(R.id.réponse ).visibility = View.VISIBLE
        }
        findViewById<View>(R.id.réponse).setOnClickListener { findViewById<View>(R.id.Question).visibility = View.VISIBLE
        findViewById<View>(R.id.réponse).visibility = View.INVISIBLE}
    } }


@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LoulouTheme {
        Greeting("Android")
    }
}