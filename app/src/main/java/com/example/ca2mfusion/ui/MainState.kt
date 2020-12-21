package com.example.ca2mfusion.ui
//Pablo 19562 and Bruno 20053 -->
import com.example.ca2mfusion.db.entity.Food

data class MainState(
    var loading: Boolean = false,
    var success: Boolean = false,
    var failure: Boolean = false,
    var message: String? = null,
    var list: List<Food>? = listOf()
)