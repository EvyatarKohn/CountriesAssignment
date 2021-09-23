package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CNY(
    @SerializedName("name")
    @Expose
    val name: String,

    @SerializedName("symbol")
    @Expose
    val symbol: String
)