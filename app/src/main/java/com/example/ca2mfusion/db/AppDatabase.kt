package com.example.ca2mfusion.db
//Pablo 19562 and Bruno 20053 -->
import android.content.Context
import android.util.Log
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.example.ca2mfusion.db.entity.Food
import com.example.ca2mfusion.worker.DataInitializer

@Database(entities = [Food::class], version = 1, exportSchema = false)
abstract class AppDatabase: RoomDatabase() {

    abstract fun foodDao(): FoodDao

    companion object {
        private const val TAG = "AppDatabase"
        private const val DATABASE_NAME = "fusioncloneapp.db"

        // Singleton prevents multiple instances of database opening at the
        // same time.
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase? {
            if (INSTANCE == null) {
                synchronized(this) {
                    Log.d(TAG, " >>> Creating new database instance")
                    INSTANCE = Room.databaseBuilder(
                        context.applicationContext,
                        AppDatabase::class.java,
                        DATABASE_NAME
                    ).addCallback(object : RoomDatabase.Callback() {
                        override fun onCreate(db: SupportSQLiteDatabase) {
                            super.onCreate(db)
                            Log.d(TAG, " >>> DataBase has been created")
                            val request = OneTimeWorkRequestBuilder<DataInitializer>().build()
                            WorkManager.getInstance(context).enqueue(request)
                        }
                    }).build()
                }
            }
            Log.d(TAG, " >>> Getting the database instance")
            return INSTANCE
        }
    }
}