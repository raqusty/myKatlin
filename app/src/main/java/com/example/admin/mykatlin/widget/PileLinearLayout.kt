package com.example.admin.mykatlin.widget

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.util.Log
import android.widget.LinearLayout

/**
 * Created by linzehao
 * time: 2017/11/9.
 * info:
 */
class PileLinearLayout : LinearLayout {
    constructor(context: Context) : super(context) {}

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {}

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {}

    override fun onLayout(changed: Boolean, l: Int, t: Int, r: Int, b: Int) {
//        super.onLayout(changed, l, t, r, b)
        var childLeft = 0
        var childWidth: Int
        for (index in 0 until childCount) {
            val child = getChildAt(index)
            childWidth = child.measuredHeight

            child.layout(childLeft, child.top, childLeft + childWidth, child.top + child.measuredHeight)
            childLeft += childWidth -childWidth/2
        }
    }

    override fun onDraw(canvas: Canvas) {
        for (index in childCount-1..0) {
            val child = getChildAt(index)
            Log.i("linzehao","index  "+index)
            child.draw(canvas)
        }

//        (childCount-1..0)
//                .map { getChildAt(it) }
//                .forEach { it.draw(canvas) }
    }

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)
//        for(index in childCount-1 downTo 0){
//            val child = getChildAt(index)
//            child.draw(canvas)
//        }
    }
}
