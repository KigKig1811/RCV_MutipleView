package com.kigkig.rcv_mutipleview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.kigkig.rcv_mutipleview.databinding.ItemShortNewsBinding
import com.kigkig.rcv_mutipleview.model.ShortNews

class ShortNewsViewHolder(private val binding: ItemShortNewsBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(shortNews: ShortNews){
        binding.shortNews = shortNews
    }
}