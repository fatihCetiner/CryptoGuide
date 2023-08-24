package com.example.cryptoguide.presentation.graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.cryptoguide.presentation.coin_detail.CoinDetailScreen
import com.example.cryptoguide.presentation.coin_favorite.CoinFavoriteScreen
import com.example.cryptoguide.presentation.coin_list.CoinListScreen

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.CoinListScreen.route
    ) {
        composable(route = Screen.CoinListScreen.route){
            CoinListScreen()
        }
        composable(route = Screen.CoinDetailScreen.route){
            CoinDetailScreen()
        }
        composable(route = Screen.CoinFavoriteScreen.route){
            CoinFavoriteScreen()
        }
    }
}