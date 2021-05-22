package com.app.gofound.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val BASE_URL = "http://gofound.in/api/"
const val BASE_URL_IMAGE = "http://gofound.in/admin/uploads/post/"
object ApiClients
{
    val  apiInterface : ApiInterface
    init {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        apiInterface=retrofit.create(ApiInterface::class.java)
    }
}
