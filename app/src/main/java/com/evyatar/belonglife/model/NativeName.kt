package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class NativeName(
    @SerializedName("bwg")
    @Expose
    val bwg: Bwg,

    @SerializedName("eng")
    @Expose
    val eng: EngX,

    @SerializedName("kck")
    @Expose
    val kck: Kck,

    @SerializedName("khi")
    @Expose
    val khi: Khi,

    @SerializedName("ndc")
    @Expose
    val ndc: Ndc,

    @SerializedName("nde")
    @Expose
    val nde: Nde,

    @SerializedName("nya")
    @Expose
    val nya: Nya,

    @SerializedName("sna")
    @Expose
    val sna: Sna,

    @SerializedName("sot")
    @Expose
    val sot: Sot,

    @SerializedName("toi")
    @Expose
    val toi: Toi,

    @SerializedName("tsn")
    @Expose
    val tsn: Tsn,

    @SerializedName("tso")
    @Expose
    val tso: Tso,

    @SerializedName("ven")
    @Expose
    val ven: Ven,

    @SerializedName("xho")
    @Expose
    val xho: Xho,

    @SerializedName("zib")
    @Expose
    val zib: Zib
)