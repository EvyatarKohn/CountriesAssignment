package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Name(
    @SerializedName("common")
    @Expose
    val common: String,

    @SerializedName("nativeName")
    @Expose
    val nativeName: NativeName,

    @SerializedName("official")
    @Expose
    val official: String
)