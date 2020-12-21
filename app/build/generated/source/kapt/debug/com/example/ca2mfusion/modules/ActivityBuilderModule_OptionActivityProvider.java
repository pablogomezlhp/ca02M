package com.example.ca2mfusion.modules;

import com.example.ca2mfusion.ui.option.OptionActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = ActivityBuilderModule_OptionActivityProvider.OptionActivitySubcomponent.class
)
public abstract class ActivityBuilderModule_OptionActivityProvider {
  private ActivityBuilderModule_OptionActivityProvider() {}

  @Binds
  @IntoMap
  @ClassKey(OptionActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      OptionActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface OptionActivitySubcomponent extends AndroidInjector<OptionActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<OptionActivity> {}
  }
}
