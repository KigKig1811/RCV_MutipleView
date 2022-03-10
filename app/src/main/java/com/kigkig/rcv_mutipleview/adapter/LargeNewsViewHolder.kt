package com.kigkig.rcv_mutipleview.adapter

import androidx.recyclerview.widget.RecyclerView
import com.kigkig.rcv_mutipleview.databinding.ItemLargeNewsBinding
import com.kigkig.rcv_mutipleview.model.LargeNews

class LargeNewsViewHolder(private val binding: ItemLargeNewsBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(largeNews: LargeNews){
            binding.largeNews = largeNews
    }
}