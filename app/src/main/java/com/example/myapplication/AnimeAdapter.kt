package com.example.myapplication

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_anime.view.tv_anime
import kotlinx.android.synthetic.main.item_anime.view.tv_name

class AnimeAdapter : RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder>() {

    private var userList= emptyList<AnimeModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AnimeViewHolder {
        var view=LayoutInflater.from(parent.context).inflate(R.layout.item_anime,parent,false)
        return AnimeViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    override fun onBindViewHolder(holder: AnimeViewHolder, position: Int) {
        holder.itemView.tv_anime.text=userList[position].anime
        holder.itemView.tv_name.text=userList[position].animeName
    }


    class AnimeViewHolder(view: View) : RecyclerView.ViewHolder(view)

    @SuppressLint("NotifyDataSetChanged")
    fun setList(list: List<AnimeModel>){
        userList=list
        notifyDataSetChanged()
    }

}

