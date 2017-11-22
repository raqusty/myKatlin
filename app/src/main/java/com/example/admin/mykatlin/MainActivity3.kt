package com.example.admin.mykatlin

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.example.admin.mykatlin.databinding.ActivityMainBinding

class MainActivity3 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    val list = listOf(1, 2, 3, 4, 5, 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
//        User user = new User("Test", "User");
//        binding.setUser(user);


        var list2 = listOf(1, 2, 4, 6)

        TestLamda2(listener = object : MyListener {
            override fun log(a: Int, b: Int): Int {
                return a + b + a
            }

        })


        setOnClickListener1{a,b->a+b+a}

        TestLamda2(listener = object : MyListener {
            override fun log(a: Int, b: Int): Int {
                return a + b + a
            }

        })

    }

    fun TestLamda2(listener: MyListener) {
        val a = 5
        val b = 2
        Log.i("linzehao", "" + listener.log(a, b))
    }

    interface MyListener {
         fun log(a: Int, b: Int): Int
    }

    interface OnClickListener {
        fun onClick(v: View)
    }

    fun setOnClickListener1(listener: (a:String,b:Int ) -> String){
        var a :String = "s"
        var b :Int  =1
        listener.let { Log.i("linzehao", it(a, b))}
    }


}

