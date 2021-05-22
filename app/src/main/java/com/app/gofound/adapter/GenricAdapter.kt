package com.app.gofound.adapter

import android.content.Context
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

private class GenricAdapter (context: Context,list: MutableList<String>): RecyclerView.Adapter<GenricAdapter.MyViewHoler>()
{
    class MyViewHoler(itemView: View): RecyclerView.ViewHolder(itemView)
    {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHoler {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: MyViewHoler, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}