package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class Translations(
    @SerializedName("ces")
    @Expose
    val ces: Ces,

    @SerializedName("deu")
    @Expose
    val deu: Deu,

    @SerializedName("est")
    @Expose
    val est: Est,

    @SerializedName("fin")
    @Expose
    val fin: Fin,

    @SerializedName("fra")
    @Expose
    val fra: FraX,

    @SerializedName("hrv")
    @Expose
    val hrv: Hrv,

    @SerializedName("hun")
    @Expose
    val hun: Hun,

    @SerializedName("ita")
    @Expose
    val ita: Ita,

    @SerializedName("jpn")
    @Expose
    val jpn: Jpn,

    @SerializedName("kor")
    @Expose
    val kor: Kor,

    @SerializedName("nld")
    @Expose
    val nld: Nld,

    @SerializedName("per")
    @Expose
    val per: Per,

    @SerializedName("pol")
    @Expose
    val pol: Pol,

    @SerializedName("por")
    @Expose
    val por: Por,

    @SerializedName("rus")
    @Expose
    val rus: Rus,

    @SerializedName("slk")
    @Expose
    val slk: Slk,

    @SerializedName("spa")
    @Expose
    val spa: Spa,

    @SerializedName("swe")
    @Expose
    val swe: Swe,

    @SerializedName("urd")
    @Expose
    val urd: Urd,

    @SerializedName("zho")
    @Expose
    val zho: Zho
)