package com.example.project.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project.Joke
import com.example.project.R

//Our JokeAdapter contains data to pick from: a list of string, here
class JokeAdapter(var jokeList: List<Joke>): RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    @SuppressLint("NotifyDataSetChanged")
    fun updateList(it: Joke) {
        jokeList = jokeList + it
        notifyDataSetChanged()
    }

    //Our view holder has a TextView as a member.
    inner class JokeViewHolder(item_view: View) : RecyclerView.ViewHolder(item_view){
        val textView:TextView = item_view.findViewById(R.id.joke_textview)
    }

    //Inflating joke_layout into a view, and returning a JokeViewHolder that will... hold the TextView associated to it.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.joke_layout, parent, false)
        return (JokeViewHolder(view))
    }

    //Nothing fancy here: we're binding our TextView to some data.
    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.textView.text = jokeList[position].value
    }

    override fun getItemCount(): Int = 10
}