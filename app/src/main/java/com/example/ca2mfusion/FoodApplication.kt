package com.example.ca2mfusion
//Pablo 19562 and Bruno 20053 -->
import android.util.Log
import com.aman.foodordering.BuildConfig
import com.example.ca2mfusion.modules.DaggerAppComponent
import com.facebook.stetho.Stetho
import dagger.android.AndroidInjector
import dagger.android.support.DaggerApplication

class FoodApplication: DaggerApplication() {
    override fun applicationInjector(): AndroidInjector<out DaggerApplication> {
        Log.d(TAG, " >>> FoodApplication Created")

        if (BuildConfig.DEBUG) {
            Log.d(TAG, " >>> Initializing")
            Stetho.initializeWithDefaults(this)
        }

        return DaggerAppComponent.builder().application(this).build()
    }

    companion object {
        const val TAG = "FoodApplication"
    }
}