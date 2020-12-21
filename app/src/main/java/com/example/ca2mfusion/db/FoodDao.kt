package com.example.ca2mfusion.db
//Pablo 19562 and Bruno 20053 -->
import androidx.room.*
import com.example.ca2mfusion.db.entity.Food
import io.reactivex.Flowable
import io.reactivex.Single

@Dao
interface FoodDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(foods: List<Food>)

    @Update
    fun updateFood(food: Food): Single<Int>

    @Query("SELECT * FROM FOOD")
    fun getAllList(): Flowable<List<Food>>

    @Query("SELECT * FROM FOOD WHERE quantity > 0")
    fun getCartList(): Flowable<List<Food>>

    @Delete
    fun deleteFood(food: Food)

}