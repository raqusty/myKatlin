package com.example.admin.mykatlin.domain


/**
 * Created by admin on 2017/11/1.
 */
data class ForecastList(val city: String, val country: String,
                        val dailyForecast: List<Forecast>) {
    operator fun get(position: Int): Forecast = dailyForecast[position]
    fun size(): Int = dailyForecast.size
}