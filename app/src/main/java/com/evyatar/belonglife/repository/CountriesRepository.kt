package com.evyatar.belonglife.repository

import com.evyatar.belonglife.network.MainApi
import javax.inject.Inject

class CountriesRepository @Inject constructor(private val mainApi: MainApi) {

    suspend fun getAllCountries() = mainApi.getAllCountries(
        "2cf055c07634dca089e30e05deb799a8"
    )
}