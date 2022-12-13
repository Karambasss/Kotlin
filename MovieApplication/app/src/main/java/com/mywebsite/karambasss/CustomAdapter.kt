package com.mywebsite.karambasss

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_registration.*

class CustomAdapter(private val mList: List<Item>?, val mItemClickListener : ItemClickListener) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
    // Создаем функциональный интерфейс для обработки нажатия на элемент адаптера
    interface ItemClickListener{
        fun onItemClick(id: Int)
    }

    // create new views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // inflates the card_view_design view
        // that is used to hold list item
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.card_view_design, parent, false)

        return ViewHolder(view)
    }

    // binds the list items to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val ItemsViewModel = mList?.get(position)

        // sets the image to the imageview from our itemHolder class
        Picasso.get().load(ItemsViewModel?.posterUrl).resize(700,850).into(holder.imageView)
    }

    // return the number of the items in the list
    override fun getItemCount(): Int {
        return mList!!.size
    }

    // Holds the views for adding it to image and text
    inner class ViewHolder(ItemView: View) : RecyclerView.ViewHolder(ItemView) {
        val imageView: ImageView = itemView.findViewById(R.id.imageview)
        init {
            ItemView.setOnClickListener {
                mList?.get(bindingAdapterPosition)?.kinopoiskId?.let { mItemClickListener.onItemClick(it)  } // получение id после нажатия на эл-т recyclerView
            }
        }
    }
}