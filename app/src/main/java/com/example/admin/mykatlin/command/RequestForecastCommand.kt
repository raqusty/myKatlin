package com.example.admin.mykatlin.command

import com.example.admin.mykatlin.ForecastDataMapper
import com.example.admin.mykatlin.ForecastRequest
import com.example.admin.mykatlin.domain.ForecastList

/**
 * Created by admin on 2017/11/1.
 */
class RequestForecastCommand(val zipCode: String) :
        Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(
                forecastRequest.execute())
    }
}