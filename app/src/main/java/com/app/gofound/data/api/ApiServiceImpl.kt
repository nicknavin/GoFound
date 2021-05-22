package com.app.gofound.data.api

import com.app.gofound.pojo.LostAllPost
import com.app.gofound.pojo.Persons
import io.reactivex.Single

class ApiServiceImpl : ApiService
{
    override fun getAllLostPost(pageno: String): Single<LostAllPost>
    {
        TODO("Not yet implemented")
      //  return
    }

    override fun getUserDetail(): Single<Persons> {
        TODO("Not yet implemented")
    }
}