package com.example.lovecalculatormvp.model

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface LoveApi {

    @GET("getPercentage")
    fun calculateMatching(
        @Query("fname") fname: String,
        @Query("sname") sname: String,
        @Header("X-RapidAPI-Key") key: String = "9bfa3b3a8amshebaec365e5595e0p1d131ajsn5b77180c6316",
        @Header("X-RapidAPI-Host") host: String = "love-calculator.p.rapidapi.com"
    ): Call<LoveModel>
}
