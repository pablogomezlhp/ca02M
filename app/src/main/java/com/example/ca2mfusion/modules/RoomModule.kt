package com.example.ca2mfusion.modules
//Pablo 19562 and Bruno 20053 -->
import android.app.Application
import com.example.ca2mfusion.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {

    @Provides
    @Singleton
    fun provideAppDatabase(applicationContext: Application): AppDatabase {
        return AppDatabase.getInstance(applicationContext)!!
    }
}