package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Languages(
    @SerializedName("bwg")
    @Expose
    val bwg: String,

    @SerializedName("eng")
    @Expose
    val eng: String,

    @SerializedName("kck")
    @Expose
    val kck: String,

    @SerializedName("khi")
    @Expose
    val khi: String,

    @SerializedName("ndc")
    @Expose
    val ndc: String,

    @SerializedName("nde")
    @Expose
    val nde: String,

    @SerializedName("nya")
    @Expose
    val nya: String,

    @SerializedName("sna")
    @Expose
    val sna: String,

    @SerializedName("sot")
    @Expose
    val sot: String,

    @SerializedName("toi")
    @Expose
    val toi: String,

    @SerializedName("tsn")
    @Expose
    val tsn: String,

    @SerializedName("tso")
    @Expose
    val tso: String,

    @SerializedName("ven")
    @Expose
    val ven: String,

    @SerializedName("xho")
    @Expose
    val xho: String,

    @SerializedName("zib")
    @Expose
    val zib: String
)