package com.example.ca2mfusion.ui.adapter
//Pablo 19562 and Bruno 20053 -->
import com.example.ca2mfusion.db.entity.Food

interface OnClickListener {
    fun update(food: Food, position: Int)
}