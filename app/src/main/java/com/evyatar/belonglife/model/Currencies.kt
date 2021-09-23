package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Currencies(
    @SerializedName("BWP")
    @Expose
    val bWP: BWP,

    @SerializedName("CNY")
    @Expose
    val cNY: CNY,

    @SerializedName("EUR")
    @Expose
    val eUR: EUR,

    @SerializedName("GBP")
    @Expose
    val gBP: GBP,

    @SerializedName("INR")
    @Expose
    val iNR: INR,

    @SerializedName("JPY")
    @Expose
    val jPY: JPY,

    @SerializedName("USD")
    @Expose
    val uSD: USD,

    @SerializedName("ZAR")
    @Expose
    val zAR: ZAR,

    @SerializedName("ZWB")
    @Expose
    val zWB: ZWB
)