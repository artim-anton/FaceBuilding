package com.artim.anton.facebuilding.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.artim.anton.facebuilding.R
import com.artim.anton.facebuilding.models.FreindsModel

/**
 * Created by YourName on 16.01.2019.
 */
class FriendsAdapter: RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    val mFrendsList: ArrayList<FreindsModel> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        val layoutInflater = LayoutInflater.from(p0.context)
        val itemView = layoutInflater.inflate(R.layout.cell_freind, p0,false)
        return FrendsViewHolder(itemView = itemView)

    }

    override fun getItemCount(): Int {
       return  mFrendsList.count()
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {

    }

    class FrendsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
}