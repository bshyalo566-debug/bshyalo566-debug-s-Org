package com.engineeromar.aiagent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.engineeromar.aiagent.ui.MainApp
import com.engineeromar.aiagent.ui.theme.EngineerOmarTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EngineerOmarTheme {
                MainApp()
            }
        }
    }
}
