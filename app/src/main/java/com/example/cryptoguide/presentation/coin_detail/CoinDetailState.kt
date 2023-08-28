package com.example.cryptoguide.presentation.coin_detail

import com.example.cryptoguide.domain.model.Coin
import com.example.cryptoguide.domain.model.CoinDetail

data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)
