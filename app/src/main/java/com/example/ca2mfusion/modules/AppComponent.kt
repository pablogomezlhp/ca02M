package com.example.ca2mfusion.modules
//Pablo 19562 and Bruno 20053 -->
import android.app.Application
import com.example.ca2mfusion.FoodApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    ActivityBuilderModule::class,
    RoomModule::class,
    RepoModule::class
])
interface AppComponent: AndroidInjector<FoodApplication> {

    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}