package com.evyatar.belonglife.repository

import android.content.Context
import com.evyatar.belonglife.db.Country
import com.evyatar.belonglife.db.CountryDataBase
import com.evyatar.belonglife.network.MainApi
import javax.inject.Inject

class CountriesRepository @Inject constructor(private val mainApi: MainApi) {

    suspend fun getAllCountries() = mainApi.getAllCountries()


}