package com.example.ca2mfusion.modules;

import com.example.ca2mfusion.ui.cart.CartActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = ActivityBuilderModule_CartActivityProvider.CartActivitySubcomponent.class)
public abstract class ActivityBuilderModule_CartActivityProvider {
  private ActivityBuilderModule_CartActivityProvider() {}

  @Binds
  @IntoMap
  @ClassKey(CartActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      CartActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface CartActivitySubcomponent extends AndroidInjector<CartActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<CartActivity> {}
  }
}
