package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Hrv(
    @SerializedName("common")
    @Expose
    val common: String,

    @SerializedName("official")
    @Expose
    val official: String
)