package com.app.gofound.data.api

import com.app.gofound.pojo.LostAllPost
import com.app.gofound.pojo.Persons
import io.reactivex.Single
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query


interface ApiService
{

    @Headers("Authorization:${Config.API_KEY}")
    @GET("get_lost_all_post")
    fun getAllLostPost(@Query("pageno")pageno:String): Single<LostAllPost>

    fun getUserDetail():Single<Persons>

}