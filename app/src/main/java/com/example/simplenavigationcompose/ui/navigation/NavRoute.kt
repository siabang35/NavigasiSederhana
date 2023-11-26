package com.example.simplenavigationcompose.ui.navigation

sealed class NavRoute(val path: String) { // Ini adalah kelas segel untuk menentukan rute navigasi dalam aplikasi.

    object Login: NavRoute("login")

    object Home: NavRoute("home")

    object Profile: NavRoute("profile") {
        val id = "id"
        val showDetails = "showDetails"
    }

    object Search: NavRoute("search") {
        val query = "query"
    }

    // Fungsi untuk membangun path navigasi (untuk navigasi antar layar).
    fun withArgs(vararg args: String): String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/$arg")
            }
        }
    }

    // build and setup route format (in navigation graph)
    fun withArgsFormat(vararg args: String) : String {
        return buildString {
            append(path)
            args.forEach{ arg ->
                append("/{$arg}")
            }
        }
    }
}


