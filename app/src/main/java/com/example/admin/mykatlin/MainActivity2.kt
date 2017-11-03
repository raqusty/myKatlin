package com.example.admin.mykatlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.LinearLayout

class MainActivity2 : AppCompatActivity() {
    val list = listOf(1, 2, 3, 4, 5, 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list.forEachIndexed { index,
                              value ->
            Log.i("linzehao", "position $index contains a $value")
        }

        listOf(1, 2, 4, 6).filter { it % 2 == 0 }.forEach {
            Log.i("linzehao", "filter $it")
        }

        var list2 = listOf(1, 2, 4, 6)
        list2 = list2.filterNot { it % 2 == 0 }
        list2.forEach {
            Log.i("linzehao", "filterNot $it")
        }

        val a: Int? = null
        a?.toString()

        val myString = a?.toString() ?: throw IllegalStateException()


    }

}