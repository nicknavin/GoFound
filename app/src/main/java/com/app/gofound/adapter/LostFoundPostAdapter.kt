package com.app.gofound.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.app.gofound.R
import com.app.gofound.databinding.AllLostPostItemsBinding
import com.app.gofound.pojo.Data
import java.util.*

class LostFoundPostAdapter(val context: Context,val list : LinkedList<Data>) : RecyclerView.Adapter<LostFoundPostAdapter.BindingViewHolder>()
{


    class BindingViewHolder (val itemsBinding : AllLostPostItemsBinding): RecyclerView.ViewHolder(itemsBinding.root)


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BindingViewHolder {
//           val view  =LayoutInflater.from(context).inflate(R.layout.all_lost_post_items,parent,false)
       val binding=AllLostPostItemsBinding.inflate(LayoutInflater.from(context),parent,false);
           return BindingViewHolder(binding)
    }

    override fun onBindViewHolder(holder: BindingViewHolder, position: Int)
    {
        val data =list[position]
        holder.itemsBinding.lostdata=data
        holder.itemsBinding.executePendingBindings()
    }

    override fun getItemCount(): Int {
       return list.size
    }

}