package com.example.admin.mykatlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.admin.mykatlin.databinding.ActivityMainBinding

class DownloadActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val list = listOf(1, 2, 3, 4, 5, 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    }

}