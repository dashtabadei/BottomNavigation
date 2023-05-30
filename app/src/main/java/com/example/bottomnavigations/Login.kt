package com.example.bottomnavigations

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.input.pointer.PointerIconDefaults.Text
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.navigation.NavHostController
import androidx.compose.ui.text.style.TextAlign

@Composable
fun login(navController: NavHostController) {
    Column() {
        Text(text = "login")
        Button(onClick = { navController.navigate(Welcome.Route) }) {
            Text(text = "Login")
        }
    }
}
