package com.example.project.adapter

import android.annotation.SuppressLint
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.project.JokeList
import com.example.project.R
import org.w3c.dom.Text

//Our JokeAdapter contains data to pick from: a list of string, here
class JokeAdapter(val jokeList: List<String>): RecyclerView.Adapter<JokeAdapter.JokeViewHolder>() {

    class JokeViewHolder(item_view: View) : RecyclerView.ViewHolder(item_view){
        val text_view:TextView = item_view.findViewById(R.id.joke_textview)
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.joke_layout, parent, false)
        return (JokeViewHolder(view))
    }

    override fun onBindViewHolder(holder: JokeViewHolder, position: Int) {
        holder.text_view.text = jokeList[position]
    }

    override fun getItemCount(): Int = 10
}