package com.evyatar.belonglife.network

import com.evyatar.belonglife.model.CountriesModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MainApi {
    @GET("all")
    suspend fun getAllCountries(): Response<CountriesModel>
}