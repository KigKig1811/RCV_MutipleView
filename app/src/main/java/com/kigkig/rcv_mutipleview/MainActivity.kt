package com.kigkig.rcv_mutipleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.kigkig.rcv_mutipleview.adapter.NewsAdapter
import com.kigkig.rcv_mutipleview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val rcvNews = binding.rvNews
        val newsList = AddDataNews.getNewsData(this)
        val newsAdapter = NewsAdapter(newsList)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        rcvNews.adapter = newsAdapter
        rcvNews.layoutManager = layoutManager
        rcvNews.setHasFixedSize(true)
        rcvNews.addItemDecoration(
            DividerItemDecoration(
                this,
                layoutManager.orientation
            )
        )
    }
}