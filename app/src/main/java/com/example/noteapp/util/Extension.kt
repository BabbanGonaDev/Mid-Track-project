package com.example.noteapp.util

import androidx.navigation.NavController
import androidx.navigation.NavDirections

fun NavController.safeNavigate(direction: NavDirections) {
    currentDestination?.getAction(direction.actionId)?.run {
        navigate(direction) }
}


fun NavController.safeNavigateUp() {
    currentDestination?.run { navigateUp() }
}