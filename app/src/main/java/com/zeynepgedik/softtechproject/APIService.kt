package com.zeynepgedik.softtechproject


import com.zeynepgedik.softtechproject.data.CustomViewModel
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object APIService {
    val interceptor: HttpLoggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    val client: OkHttpClient = OkHttpClient.Builder().apply {
        addInterceptor(interceptor)
    }.build()

    private val api = Retrofit.Builder()
        .baseUrl("https://github.com/zeygdk/CustomView/blob/main/data.json")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build()
        .create(API::class.java)

    suspend fun getCustomView(): Response<CustomViewModel> {
        return api.getCustomView()
    }
}