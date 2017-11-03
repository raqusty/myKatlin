package com.example.admin.mykatlin.sql.db

import android.text.method.TextKeyListener.clear
import com.example.admin.mykatlin.R.id.date
import com.example.admin.mykatlin.domain.ForecastList
import com.example.admin.mykatlin.sql.mapper.DbDataMapper
import com.example.admin.mykatlin.sql.model.CityForecast
import com.example.admin.mykatlin.sql.model.DayForecast
import com.example.admin.mykatlin.sql.objects.CityForecastTable
import com.example.admin.mykatlin.sql.objects.DayForecastTable
import com.example.admin.mykatlin.sql.utils.ForecastDbHelper
import org.jetbrains.anko.db.MapRowParser
import org.jetbrains.anko.db.RowParser
import org.jetbrains.anko.db.SelectQueryBuilder
import org.jetbrains.anko.db.select

/**
 * Created by linzehao
 * time: 2017/11/3.
 * info:
 */
class ForecastDb(
        val forecastDbHelper: ForecastDbHelper = ForecastDbHelper.instance,
        val dataMapper: DbDataMapper = DbDataMapper()) {

    fun requestForecastByZipCode(zipCode: Long, date: Long) = forecastDbHelper.use {

        val dailyRequest = "${DayForecastTable.CITY_ID} = ? AND " +
                "${DayForecastTable.DATE} >= ?"

//        val dailyForecast = select(DayForecastTable.NAME)
//                .whereSimple(dailyRequest, zipCode.toString(), date.toString())
//                .parseList(){DayForecast(HashMap(it))}

//

//        val city = select(CityForecastTable.NAME)
//                .whereSimple("${CityForecastTable.ID} = ?", zipCode.toString())
//                .parseOpt { CityForecast(HashMap(it), dailyForecast) }

//        if (city != null) dataMapper.convertToDomain(city) else null
    }

//    fun saveForecast(forecast: ForecastList) = forecastDbHelper.use {
//        clear(CityForecastTable.NAME)
//        clear(DayForecastTable.NAME)
//
//        with(dataMapper.convertFromDomain(forecast)) {
//            insert(CityForecastTable.NAME, *map.toVarargArray())
//            dailyForecast forEach {
//                insert(DayForecastTable.NAME, *it.map.toVarargArray())
//            }
//        }
//    }


    /*
      这里不太懂
     */
//    fun <T : Any> SelectQueryBuilder.parseList(
//            parser: (Map<String, Any>) -> T): List<T> =
//            parseList(object : MapRowParser<T> {
//                override fun parseRow(columns: Map<String, Any?>):T = parser(columns)
//
//            })
}