package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Idd(
    @SerializedName("root")
    @Expose
    val root: String,

    @SerializedName("suffixes")
    @Expose
    val suffixes: List<String>
)