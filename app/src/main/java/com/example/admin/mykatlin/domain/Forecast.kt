package com.example.admin.mykatlin.domain

/**
 * Created by admin on 2017/11/1.
 */
data class Forecast(val date: String, val description: String, val high: Int,
                    val low: Int, val iconUrl: String)