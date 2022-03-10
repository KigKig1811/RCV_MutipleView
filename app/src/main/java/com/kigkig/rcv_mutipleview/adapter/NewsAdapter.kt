package com.kigkig.rcv_mutipleview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kigkig.rcv_mutipleview.databinding.ItemLargeNewsBinding
import com.kigkig.rcv_mutipleview.databinding.ItemShortNewsBinding
import com.kigkig.rcv_mutipleview.model.LargeNews
import com.kigkig.rcv_mutipleview.model.News
import com.kigkig.rcv_mutipleview.model.NewsType
import com.kigkig.rcv_mutipleview.model.ShortNews

class NewsAdapter(private val newsList: List<News>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var bindingLargeNews: ItemLargeNewsBinding
    private lateinit var bindingShortNews: ItemShortNewsBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder =
        when (viewType) {
            NewsType.SHORT_NEWS.value -> {
                bindingShortNews =
                    ItemShortNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                ShortNewsViewHolder(bindingShortNews)
            }
            NewsType.LARGE_NEWS.value -> {
                bindingLargeNews =
                    ItemLargeNewsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                LargeNewsViewHolder(bindingLargeNews)
            }
            else -> {
                bindingLargeNews = ItemLargeNewsBinding.inflate(
                    LayoutInflater.from(parent.context), parent, false
                )
                LargeNewsViewHolder(bindingLargeNews)
            }
        }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (newsList[position]) {
            is ShortNews -> {
                (holder as ShortNewsViewHolder).bind(newsList[position] as ShortNews)
            }
            is LargeNews -> {
                (holder as LargeNewsViewHolder).bind(newsList[position] as LargeNews)
            }
        }
    }

    override fun getItemCount(): Int {
        return newsList.size
    }

    override fun getItemViewType(position: Int): Int =
        when (newsList[position]) {
            is ShortNews -> {
                NewsType.SHORT_NEWS.value
            }
            is LargeNews -> {
                NewsType.LARGE_NEWS.value
            }
            else -> {
                NewsType.LARGE_NEWS.value
            }
        }
}
