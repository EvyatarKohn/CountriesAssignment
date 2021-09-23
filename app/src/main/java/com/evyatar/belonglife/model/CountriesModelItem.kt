package com.evyatar.belonglife.model


import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CountriesModelItem(
    @SerializedName("altSpellings")
    @Expose
    val altSpellings: List<String>,

    @SerializedName("area")
    @Expose
    val area: Double,

    @SerializedName("borders")
    @Expose
    val borders: List<String>,

    @SerializedName("capital")
    @Expose
    val capital: List<String>,

    @SerializedName("cca2")
    @Expose
    val cca2: String,

    @SerializedName("cca3")
    @Expose
    val cca3: String,

    @SerializedName("ccn3")
    @Expose
    val ccn3: String,

    @SerializedName("cioc")
    @Expose
    val cioc: String,

    @SerializedName("currencies")
    @Expose
    val currencies: Currencies,

    @SerializedName("demonyms")
    @Expose
    val demonyms: Demonyms,

    @SerializedName("flag")
    @Expose
    val flag: String,

    @SerializedName("flags")
    @Expose
    val flags: List<String>,

    @SerializedName("idd")
    @Expose
    val idd: Idd,

    @SerializedName("independent")
    @Expose
    val independent: Boolean,

    @SerializedName("landlocked")
    @Expose
    val landlocked: Boolean,

    @SerializedName("languages")
    @Expose
    val languages: Languages,

    @SerializedName("latlng")
    @Expose
    val latlng: List<Double>,

    @SerializedName("name")
    @Expose
    val name: Name,

    @SerializedName("region")
    @Expose
    val region: String,

    @SerializedName("status")
    @Expose
    val status: String,

    @SerializedName("subregion")
    @Expose
    val subregion: String,

    @SerializedName("tld")
    @Expose
    val tld: List<String>,

    @SerializedName("translations")
    @Expose
    val translations: Translations,

    @SerializedName("unMember")
    @Expose
    val unMember: Boolean
)