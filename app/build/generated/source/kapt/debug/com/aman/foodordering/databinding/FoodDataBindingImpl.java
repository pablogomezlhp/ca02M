package com.aman.foodordering.databinding;
import com.aman.foodordering.R;
import com.aman.foodordering.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FoodDataBindingImpl extends FoodDataBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.view_plus_minus, 7);
        sViewsWithIds.put(R.id.tv_minus, 8);
        sViewsWithIds.put(R.id.tv_plus, 9);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FoodDataBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 10, sIncludes, sViewsWithIds));
    }
    private FoodDataBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (androidx.appcompat.widget.AppCompatButton) bindings[4]
            , (androidx.constraintlayout.widget.Group) bindings[5]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[2]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[6]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (android.view.View) bindings[7]
            );
        this.btnAdd.setTag(null);
        this.groupRetry.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvDescription.setTag(null);
        this.tvItemCount.setTag(null);
        this.tvRate.setTag(null);
        this.tvTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.food == variableId) {
            setFood((com.example.ca2mfusion.db.entity.Food) variable);
        }
        else if (BR.shouldPlusMinusButton == variableId) {
            setShouldPlusMinusButton((java.lang.Boolean) variable);
        }
        else if (BR.shouldShowAddButton == variableId) {
            setShouldShowAddButton((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setFood(@Nullable com.example.ca2mfusion.db.entity.Food Food) {
        this.mFood = Food;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.food);
        super.requestRebind();
    }
    public void setShouldPlusMinusButton(@Nullable java.lang.Boolean ShouldPlusMinusButton) {
        this.mShouldPlusMinusButton = ShouldPlusMinusButton;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.shouldPlusMinusButton);
        super.requestRebind();
    }
    public void setShouldShowAddButton(@Nullable java.lang.Boolean ShouldShowAddButton) {
        this.mShouldShowAddButton = ShouldShowAddButton;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.shouldShowAddButton);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        com.example.ca2mfusion.db.entity.Food food = mFood;
        java.lang.String foodRate = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxShouldShowAddButton = false;
        boolean androidxDatabindingViewDataBindingSafeUnboxShouldPlusMinusButton = false;
        java.lang.String foodCurrency = null;
        int shouldPlusMinusButtonViewVISIBLEViewGONE = 0;
        java.lang.Boolean shouldPlusMinusButton = mShouldPlusMinusButton;
        java.lang.Integer foodQuantity = null;
        java.lang.String foodQuantityToString = null;
        int shouldShowAddButtonViewVISIBLEViewGONE = 0;
        java.lang.Boolean shouldShowAddButton = mShouldShowAddButton;
        java.lang.String foodTitle = null;
        java.lang.String foodDescription = null;
        java.lang.String foodCurrencyFoodRate = null;

        if ((dirtyFlags & 0x9L) != 0) {



                if (food != null) {
                    // read food.rate
                    foodRate = food.getRate();
                    // read food.currency
                    foodCurrency = food.getCurrency();
                    // read food.quantity
                    foodQuantity = food.getQuantity();
                    // read food.title
                    foodTitle = food.getTitle();
                    // read food.description
                    foodDescription = food.getDescription();
                }


                // read (food.currency) + (food.rate)
                foodCurrencyFoodRate = (foodCurrency) + (foodRate);
                if (foodQuantity != null) {
                    // read food.quantity.toString()
                    foodQuantityToString = foodQuantity.toString();
                }
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldPlusMinusButton)
                androidxDatabindingViewDataBindingSafeUnboxShouldPlusMinusButton = androidx.databinding.ViewDataBinding.safeUnbox(shouldPlusMinusButton);
            if((dirtyFlags & 0xaL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShouldPlusMinusButton) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldPlusMinusButton) ? View.VISIBLE : View.GONE
                shouldPlusMinusButtonViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShouldPlusMinusButton) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldShowAddButton)
                androidxDatabindingViewDataBindingSafeUnboxShouldShowAddButton = androidx.databinding.ViewDataBinding.safeUnbox(shouldShowAddButton);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShouldShowAddButton) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldShowAddButton) ? View.VISIBLE : View.GONE
                shouldShowAddButtonViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShouldShowAddButton) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.btnAdd.setVisibility(shouldShowAddButtonViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.groupRetry.setVisibility(shouldPlusMinusButtonViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDescription, foodDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemCount, foodQuantityToString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRate, foodCurrencyFoodRate);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTitle, foodTitle);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): food
        flag 1 (0x2L): shouldPlusMinusButton
        flag 2 (0x3L): shouldShowAddButton
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(shouldPlusMinusButton) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(shouldPlusMinusButton) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): androidx.databinding.ViewDataBinding.safeUnbox(shouldShowAddButton) ? View.VISIBLE : View.GONE
        flag 7 (0x8L): androidx.databinding.ViewDataBinding.safeUnbox(shouldShowAddButton) ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}