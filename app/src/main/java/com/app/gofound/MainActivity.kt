package com.app.gofound

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.gofound.adapter.LostFoundPostAdapter
import com.app.gofound.databinding.ActivityMainBinding
import com.app.gofound.network.ApiClients
import com.app.gofound.network.ApiInterface
import com.app.gofound.pojo.Data
import com.app.gofound.pojo.LostAllPost
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*

class MainActivity : AppCompatActivity()
{
    lateinit var list : LinkedList<Data>
//    private lateinit var recyclerView :RecyclerView
//    private lateinit var viewlayoutManager: LinearLayoutManager
//    private lateinit var lostFoundPostAdapter: LostFoundPostAdapter
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)
        getLostALLpost()
    }

//  private fun initView()
//    {
//        viewlayoutManager= LinearLayoutManager(this)
//        recyclerView=findViewById<RecyclerView>(R.id.recyclerView).apply {
//            this.layoutManager=viewlayoutManager
//
//        }
//
//    }


   private fun getLostALLpost()
    {
        val call=ApiClients.apiInterface.getAllLostPost("1")
        call.enqueue(object :Callback<LostAllPost>{
            override fun onResponse(call: Call<LostAllPost>, response: Response<LostAllPost>)
            {
                if(response.isSuccessful)
                {
                    var values: LostAllPost? =response.body()
                    values?.let {
                        list=it.data
                        println(list.toString())
                        binding.datalist=list
                    }
//                    lostFoundPostAdapter= LostFoundPostAdapter(this@MainActivity,list)
//                    recyclerView.adapter=lostFoundPostAdapter
//                    list=values?.data
//
//                    list?.let {
//                        println(list)
//                    }


                }
//                TODO("Not yet implemented")

            }

            override fun onFailure(call: Call<LostAllPost>, t: Throwable) {
//                TODO("Not yet implemented")
            }
        })


    }


}