package com.app.gofound.custombinder

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.app.gofound.adapter.LostFoundPostAdapter
import com.app.gofound.pojo.Data
import java.util.*


@BindingAdapter("bindList")
fun bindRecyclerViewList(view: RecyclerView,datalist: LinkedList<Data>?)
{
    //this empty check is not good practise

//    if(datalist.isEmpty())
//    {
//        return
//    }

    var layoutManager=view.layoutManager
        if(layoutManager==null)
        {
            view.layoutManager=LinearLayoutManager(view.context)
        }
    var adapter=view.adapter
    if(adapter==null)
    {
        datalist?.let {
            adapter=LostFoundPostAdapter(view.context,datalist)
            view.adapter=adapter
        }

    }

}