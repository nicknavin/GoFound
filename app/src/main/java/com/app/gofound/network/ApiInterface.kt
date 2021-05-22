package com.app.gofound.network

import com.app.gofound.data.api.Config
import com.app.gofound.pojo.LostAllPost
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.*


interface ApiInterface
{
    @FormUrlEncoded
    @POST("user_login")
    fun callLogin(@Field("email") email: String, @Field("password") password: String)

    @Headers("Authorization:${Config.API_KEY}")
    @GET("get_lost_all_post")
    fun getAllLostPost(@Query("pageno")pageno:String):Call<LostAllPost>

}


