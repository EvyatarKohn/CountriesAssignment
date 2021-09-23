package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Demonyms(
    @SerializedName("eng")
    @Expose
    val eng: Eng,

    @SerializedName("fra")
    @Expose
    val fra: Fra
)