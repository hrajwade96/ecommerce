package com.example.ecommerceapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout_bigjson.view.*

class BigJsonAdapter(val postList: List<AllMovy>, val context: Context) :
    RecyclerView.Adapter<BigJsonAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_layout_bigjson,
                parent, false))
    }

    override fun getItemCount(): Int {
        return postList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.tv.text = "${postList[position].backdrop_path}"


//        holder.itemView.tv.text = ""+postList[position].allMovies[0]
//        holder.itemView.tv1.text = ""+postList[position].allMovies[1]
//      //  holder.itemView.tv2.text = ""+postList[position].allMovies[2]
//        holder.itemView.tv3.text = ""+postList[position].allMovies[3]
//        holder.itemView.tv4.text = ""+postList[position].allMovies[4]
//        holder.itemView.tv5.text = ""+postList[position].allMovies[5]
//        holder.itemView.tv6.text = ""+postList[position].allMovies[6]
//        holder.itemView.tv7.text = ""+postList[position].allMovies[7]
//        holder.itemView.tv8.text = ""+postList[position].allMovies[8]
//        holder.itemView.tv9.text =""+ postList[position].allMovies[9]
//        holder.itemView.tv10.text =""+ postList[position].allMovies[10]
//        holder.itemView.tv11.text = ""+postList[position].allMovies[11]
//        holder.itemView.tv12.text =""+ postList[position].allMovies[12]

    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}