package com.example.admin.mykatlin

import android.graphics.Point
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.widget.Toast
import com.example.admin.mykatlin.command.RequestForecastCommand
import com.example.admin.mykatlin.domain.Forecast
import com.example.admin.mykatlin.entity.Person
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import java.net.URL

class MainActivity : AppCompatActivity() {

    private val items = listOf(
            "Mon 6/23 - Sunny - 31/17",
            "Tue 6/24 - Foggy - 21/8",
            "Wed 6/25 - Cloudy - 22/17",
            "Thurs 6/26 - Rainy - 18/11",
            "Fri 6/27 - Foggy - 21/10",
            "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
            "Sun 6/29 - Sunny - 20/7"
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_recleview)




        val forecastList = findViewById<RecyclerView>(R.id.forecast_list)
        forecastList.layoutManager = LinearLayoutManager(this)




        toast("Hello worldssssss!")
        var person = Person("ss")

        var ss: Int = 1

        Log.i("1111", add(1, 2).toString() + person.mName)



        doAsync() {
            val result = RequestForecastCommand("94043").execute()
            uiThread{

//                forecastList.adapter = ForecastListAdapter(result,
//                        object : OnItemClickListener{
//                            override fun invoke(forecast: Forecast) {
//                                toast(forecast.date)
//                            }
//                        })
                forecastList.adapter =  ForecastListAdapter(result) { toast(it.date) }
            }
        }



    }

    fun toast(message: CharSequence, duration: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, duration).show()
    }

    fun toast(message: String) {
        toast(message, Toast.LENGTH_SHORT)
    }


    open class Animal(name: String)


    fun add(x: Int, y: Int): Int {
        return x + y
    }

    public class Request(val url: String) {
        public fun run() {
            val forecastJsonStr = URL(url).readText()
            Log.d(javaClass.simpleName, forecastJsonStr)
        }
    }
}
