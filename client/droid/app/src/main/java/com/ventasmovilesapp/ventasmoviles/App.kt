package com.ventasmovilesapp.ventasmoviles

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import java.time.LocalTime

class MainAppActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val date = LocalTime.now();

        setup_server()

        setContent {

                Surface(

                    modifier = Modifier.fillMaxSize()
                ) {

                }

        }
    }
}
