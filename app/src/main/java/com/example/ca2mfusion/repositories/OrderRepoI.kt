package com.example.ca2mfusion.repositories
//Pablo 19562 and Bruno 20053 -->
import com.example.ca2mfusion.db.entity.Food
import io.reactivex.Flowable
import io.reactivex.Single

interface OrderRepoI {
    fun update(food: Food): Single<Int>

    fun getCartItem(): Flowable<List<Food>>

    fun getAllItem(): Flowable<List<Food>>
}