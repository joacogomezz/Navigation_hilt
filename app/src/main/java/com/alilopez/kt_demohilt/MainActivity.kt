package com.alilopez.kt_demohilt

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.alilopez.demo.features.jsonplaceholder.presentation.screens.PostsScreen
import com.alilopez.demo.features.rickandmorty.presentation.screens.CharactersScreen
import com.alilopez.kt_demohilt.core.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppTheme {
                //PostsScreen()
                CharactersScreen()
            }
        }
    }
}

