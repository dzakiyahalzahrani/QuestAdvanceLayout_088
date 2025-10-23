package com.example.questadvancelayout_088

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
import com.example.questadvancelayout_088.ui.theme.QuestAdvanceLayout_088Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            QuestAdvanceLayout_088Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ActivitesPertama(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

