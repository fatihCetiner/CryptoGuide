package com.example.cryptoguide.domain.repository

import com.example.cryptoguide.data.remote.dto.CoinDetailDto
import com.example.cryptoguide.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}