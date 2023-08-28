package com.example.cryptoguide.data.repository

import com.example.cryptoguide.data.remote.CoinPaprikaApi
import com.example.cryptoguide.data.remote.dto.CoinDetailDto
import com.example.cryptoguide.data.remote.dto.CoinDto
import com.example.cryptoguide.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImpl @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}