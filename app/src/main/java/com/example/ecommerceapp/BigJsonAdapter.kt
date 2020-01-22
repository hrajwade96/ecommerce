package com.example.ecommerceapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
import cesarferreira.faker.loadFromUrl
import cesarferreira.faker.loadRandomImage
import com.bumptech.glide.Glide
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_layout_bigjson.view.*
import retrofit2.http.Url
import java.util.*


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
       // holder.itemView.tv.text = "${postList.toString()}"
        var text = ""

//          text = text + postList[position].adult + "\n\n"
//        text = text + postList[position].backdrop_path + "\n\n"
        text = text + postList[position].title + "\n\n"
          text = text + postList[position].genre_ids + "\n\n"
          text = text + postList[position].id + "\n\n"

          text = text + postList[position].original_language + "\n\n"
//            text = text + postList[position].original_title + "\n\n"
//            text = text + postList[position].overview + "\n\n"
//            text = text + postList[position].popularity + "\n\n"
//            text = text + postList[position].poster_path + "\n\n"
//            text = text + postList[position].release_date + "\n\n"


        holder.itemView.iv.loadRandomImage()
        //holder.itemView.iv.loadFromUrl( "http://image.tmdb.org/t/p/w400/5BwqwxMEjeFtdknRV792Svo0K1v.jpg" )
        holder.itemView.tv.text=text
        var url=postList[position].backdrop_path.toString()
        holder.itemView.card.setOnClickListener{
            var intent = Intent(context, MovieDetailsActivity::class.java)
            intent.putExtra("title",  postList[position].title)
            intent.putExtra("desc", postList[position].overview)
            context.startActivity(intent)
        }

        holder.itemView.layout_id.setOnClickListener{
            var intent = Intent(context, MovieDetailsActivity::class.java)
            intent.putExtra("title",  postList[position].title)
            intent.putExtra("desc", postList[position].overview)
            context.startActivity(intent)
        }



    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}