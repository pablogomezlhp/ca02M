package com.example.ca2mfusion.modules
//Pablo 19562 and Bruno 20053 -->
import com.example.ca2mfusion.repositories.OrderRepo
import com.example.ca2mfusion.repositories.OrderRepoI
import com.example.ca2mfusion.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepoModule {

    @Provides
    @Singleton
    fun provideOrderRepo(appDatabase: AppDatabase): OrderRepoI {
        return OrderRepo(appDatabase)
    }
}