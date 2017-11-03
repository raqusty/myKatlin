package com.example.admin.mykatlin.sql.mapper

import com.example.admin.mykatlin.domain.Forecast
import com.example.admin.mykatlin.domain.ForecastList
import com.example.admin.mykatlin.sql.model.CityForecast
import com.example.admin.mykatlin.sql.model.DayForecast

/**
 * Created by linzehao
 * time: 2017/11/3.
 * info:
 */
class DbDataMapper() {
    fun convertToDomain(forecast: CityForecast) = with(forecast) {
        val daily = dailyForecast.map { convertDayToDomain(it) }
//        ForecastList(_id, city, country, daily)
    }

    private fun convertDayToDomain(dayForecast: DayForecast) = with(dayForecast) {
//                Forecast(date, description, high, low, iconUrl)
    }
}