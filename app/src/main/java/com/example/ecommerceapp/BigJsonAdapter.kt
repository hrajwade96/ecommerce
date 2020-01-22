package com.example.ecommerceapp

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView
<<<<<<< HEAD
import cesarferreira.faker.loadFromUrl
import cesarferreira.faker.loadRandomImage
import com.bumptech.glide.Glide
=======
>>>>>>> 4ccd9e1cce8d45693be16a558acf9b603513ecb3
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
<<<<<<< HEAD
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


=======
        var movObj = postList[position]
        holder.itemView.tv_movie_name.text = "${movObj.title}"


        Picasso.get()
            .load(movObj.backdrop_path)
            .into(holder.itemView.img_movie)

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
>>>>>>> 4ccd9e1cce8d45693be16a558acf9b603513ecb3

    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view)
}