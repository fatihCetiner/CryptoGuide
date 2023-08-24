package com.example.cryptoguide.presentation.graph

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Star
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val route: String,
    val title: String,
    val icon: ImageVector
){
    object CoinListScreen: Screen(
        route = "coin_list",
        title = "Coin List",
        icon = Icons.Default.Home
    )
    object CoinDetailScreen: Screen(
        route = "coin_detail",
        title = "Coin Detail",
        icon = Icons.Default.Star
    )
    object CoinFavoriteScreen: Screen(
        route = "coin_favorite",
        title = "Coin Favorite",
        icon = Icons.Default.Favorite
    )
}
