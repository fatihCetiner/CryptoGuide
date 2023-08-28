package com.example.cryptoguide.presentation.coin_list

import com.example.cryptoguide.domain.model.Coin

data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<Coin> = emptyList(),
    val error: String = ""
)
