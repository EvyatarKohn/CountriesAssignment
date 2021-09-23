package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Eng(
    @SerializedName("f")
    @Expose
    val f: String,

    @SerializedName("m")
    @Expose
    val m: String
)