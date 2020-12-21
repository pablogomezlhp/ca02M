package com.example.ca2mfusion.modules
//Pablo 19562 and Bruno 20053 -->
import com.example.ca2mfusion.ui.main.MainActivity
import com.example.ca2mfusion.ui.cart.CartActivity
import com.example.ca2mfusion.ui.option.OptionActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuilderModule {

    @ContributesAndroidInjector
    abstract fun mainActivityProvider() : MainActivity

    @ContributesAndroidInjector
    abstract fun cartActivityProvider() : CartActivity

    @ContributesAndroidInjector
    abstract fun optionActivityProvider() : OptionActivity

}
