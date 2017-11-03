package com.example.admin.mykatlin

import com.example.admin.mykatlin.domain.Forecast


/**
 * Created by admin on 2017/11/2.
 */
public interface OnItemClickListener {
    operator fun invoke(forecast: Forecast)
}