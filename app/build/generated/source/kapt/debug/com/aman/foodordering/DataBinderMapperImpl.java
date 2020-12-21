package com.aman.foodordering;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.aman.foodordering.databinding.ActivityCartBindingImpl;
import com.aman.foodordering.databinding.ActivityMainBindingImpl;
import com.aman.foodordering.databinding.ActivityOptionBindingImpl;
import com.aman.foodordering.databinding.FoodDataBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYCART = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_ACTIVITYOPTION = 3;

  private static final int LAYOUT_LAYOUTSINGLEITEM = 4;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(4);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.aman.foodordering.R.layout.activity_cart, LAYOUT_ACTIVITYCART);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.aman.foodordering.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.aman.foodordering.R.layout.activity_option, LAYOUT_ACTIVITYOPTION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.aman.foodordering.R.layout.layout_single_item, LAYOUT_LAYOUTSINGLEITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYCART: {
          if ("layout/activity_cart_0".equals(tag)) {
            return new ActivityCartBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_cart is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYOPTION: {
          if ("layout/activity_option_0".equals(tag)) {
            return new ActivityOptionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_option is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTSINGLEITEM: {
          if ("layout/layout_single_item_0".equals(tag)) {
            return new FoodDataBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_single_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(8);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "food");
      sKeys.put(2, "shouldPlusMinusButton");
      sKeys.put(3, "shouldShowAddButton");
      sKeys.put(4, "shouldShowMore");
      sKeys.put(5, "state");
      sKeys.put(6, "totalItem");
      sKeys.put(7, "totalPrice");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(4);

    static {
      sKeys.put("layout/activity_cart_0", com.aman.foodordering.R.layout.activity_cart);
      sKeys.put("layout/activity_main_0", com.aman.foodordering.R.layout.activity_main);
      sKeys.put("layout/activity_option_0", com.aman.foodordering.R.layout.activity_option);
      sKeys.put("layout/layout_single_item_0", com.aman.foodordering.R.layout.layout_single_item);
    }
  }
}
