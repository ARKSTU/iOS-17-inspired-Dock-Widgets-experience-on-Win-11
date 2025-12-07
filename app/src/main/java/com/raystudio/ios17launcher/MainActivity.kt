package com.raystudio.ios17launcher

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint

/**
 * Main launcher activity
 * Entry point for the iOS 17 inspired launcher experience
 */
@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            iOS17LauncherTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LauncherScreen()
                }
            }
        }
    }
}

@Composable
fun iOS17LauncherTheme(content: @Composable () -> Unit) {
    MaterialTheme {
        content()
    }
}

@Composable
fun LauncherScreen() {
    Text("iOS 17 Inspired Launcher - Ray Studio Edition")
}

@Preview(showBackground = true)
@Composable
fun LauncherScreenPreview() {
    iOS17LauncherTheme {
        LauncherScreen()
    }
}
