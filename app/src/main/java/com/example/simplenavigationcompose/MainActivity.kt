package com.example.simplenavigationcompose // Ini adalah proyek yang menggunakan Jetpack Compose untuk mengelola navigasi sederhana.

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.simplenavigationcompose.ui.navigation.NavGraph
import com.example.simplenavigationcompose.ui.theme.SimpleNavComposeAppTheme

// Kelas utama aplikasi yang mewarisi dari ComponentActivity.
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}
// Fungsi komposabel yang menentukan tata letak utama aplikasi.
@Composable
private fun MainScreen() {
    SimpleNavComposeAppTheme { // Menerapkan tema desain aplikasi menggunakan SimpleNavComposeAppTheme.
        val navController = rememberNavController() // Membuat NavController untuk mengelola navigasi antar layar.
        NavGraph(navController)  // Menjalankan grafik navigasi dengan menyediakan NavController ke NavGraph.
    }
}
