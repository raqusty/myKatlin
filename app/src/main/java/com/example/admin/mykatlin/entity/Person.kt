package com.example.admin.mykatlin.entity

/**
 * Created by admin on 2017/11/1.
 */
data  class Person(var name: String) {
    var mName: String = ""

    init {
        mName = name
    }
}