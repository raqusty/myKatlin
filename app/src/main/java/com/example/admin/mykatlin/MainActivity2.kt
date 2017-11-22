package com.example.admin.mykatlin

import android.content.Intent
import android.content.pm.ActivityInfo
import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.LinearLayout
import com.example.admin.mykatlin.databinding.ActivityMainBinding
import com.example.admin.mykatlin.MainActivity2.MyListener
import com.zhihu.matisse.Matisse
import com.zhihu.matisse.MimeType
import com.zhihu.matisse.engine.impl.GlideEngine
import java.util.*


class MainActivity2 : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    val list = listOf(1, 2, 3, 4, 5, 6)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main);
//        User user = new User("Test", "User");
//        binding.setUser(user);

        Matisse.from(this)
                .choose(MimeType.allOf())
                .countable(true)
                .maxSelectable(9)
                .gridExpectedSize(resources.getDimensionPixelSize(R.dimen.grid_expected_size))
                .restrictOrientation(ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED)
                .thumbnailScale(0.85f)
                .imageEngine(GlideEngine())
                .forResult(1111)

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

        var list4 = listOf(1, 2, 4, 6) as MutableList

        val a: Int? = null
        a?.toString()

//        val myString = a?.toString() ?: throw IllegalStateException()

        var str1 :Array<String>
        var list = listOf("1","2","3","4")
         str1 = list.toTypedArray()
        str1.forEach { Log.i("linzehao","array "+it) }

        val sum = { x: Int, y: Int -> x + y }

        val sum1: (Int, Int) -> Int = { x, y -> x + y }


        TestLamda() { a, b ->
            Log.i("","")
           ""
        }
//        {a,b->String}()
//        TestLamda2({ a, b ->
//            val result = a + b
//            result
//        })
    }

    fun TestLamda(listener: (a: String, b :Int) -> String){
        val a = "Lamda"
        val b = 3
        listener.let { Log.e("linzehao", it(a, b))}
    }

    fun TestLamda3(listener: (a: String, b :Int) -> String){
        val a = "Lamda"
        val b = 3
        a+b
    }

    interface MyListener {
        fun logHello(a: String, b: Int): String
    }

    fun TestLamda2(listener: MyListener) {
        val a = "Lamda"
        val b = 2
        val result = listener.logHello(a, b)
        Log.e("linzehao", result)
    }



    fun getTest(test2:test,test1:(test)->Unit){
        test1(test2)
    }

    class test{
        fun println( message:String){Log.i("linzehao",message)}
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
    }
}