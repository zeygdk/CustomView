package com.zeynepgedik.softtechproject

import com.zeynepgedik.softtechproject.data.CustomViewModel
import retrofit2.http.GET
import retrofit2.Response


interface API {
    @GET("zeygdk/CustomView/blob/main/data.json")
    suspend fun getCustomView(
    ): Response<CustomViewModel>
}