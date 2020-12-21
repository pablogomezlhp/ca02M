package com.aman.foodordering.databinding;
import com.aman.foodordering.R;
import com.aman.foodordering.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 4);
        sViewsWithIds.put(R.id.collapsing_toolbar, 5);
        sViewsWithIds.put(R.id.iv_background, 6);
        sViewsWithIds.put(R.id.scroll, 7);
        sViewsWithIds.put(R.id.tv_starter, 8);
        sViewsWithIds.put(R.id.rv_food, 9);
        sViewsWithIds.put(R.id.view_bottom, 10);
        sViewsWithIds.put(R.id.iv_cart, 11);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[4]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[6]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[11]
            , (android.widget.ProgressBar) bindings[2]
            , (androidx.recyclerview.widget.RecyclerView) bindings[9]
            , (androidx.core.widget.NestedScrollView) bindings[7]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (android.view.View) bindings[10]
            );
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.progressBar.setTag(null);
        this.tvTotalItem.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.totalItem == variableId) {
            setTotalItem((java.lang.String) variable);
        }
        else if (BR.state == variableId) {
            setState((com.example.ca2mfusion.ui.MainState) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotalItem(@Nullable java.lang.String TotalItem) {
        this.mTotalItem = TotalItem;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.totalItem);
        super.requestRebind();
    }
    public void setState(@Nullable com.example.ca2mfusion.ui.MainState State) {
        this.mState = State;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.state);
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
        java.lang.String totalItem = mTotalItem;
        com.example.ca2mfusion.ui.MainState state = mState;
        int stateLoadingViewVISIBLEViewGONE = 0;
        boolean stateLoading = false;
        boolean stateSuccess = false;
        java.lang.String stringFormatTvTotalItemAndroidStringCartItemTotalItem = null;
        int stateSuccessViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x5L) != 0) {



                // read String.format(@android:string/cart_item, totalItem)
                stringFormatTvTotalItemAndroidStringCartItemTotalItem = java.lang.String.format(tvTotalItem.getResources().getString(R.string.cart_item), totalItem);
        }
        if ((dirtyFlags & 0x6L) != 0) {



                if (state != null) {
                    // read state.loading
                    stateLoading = state.getLoading();
                    // read state.success
                    stateSuccess = state.getSuccess();
                }
            if((dirtyFlags & 0x6L) != 0) {
                if(stateLoading) {
                        dirtyFlags |= 0x10L;
                }
                else {
                        dirtyFlags |= 0x8L;
                }
            }
            if((dirtyFlags & 0x6L) != 0) {
                if(stateSuccess) {
                        dirtyFlags |= 0x40L;
                }
                else {
                        dirtyFlags |= 0x20L;
                }
            }


                // read state.loading ? View.VISIBLE : View.GONE
                stateLoadingViewVISIBLEViewGONE = ((stateLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read state.success ? View.VISIBLE : View.GONE
                stateSuccessViewVISIBLEViewGONE = ((stateSuccess) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0x6L) != 0) {
            // api target 1

            this.mboundView1.setVisibility(stateSuccessViewVISIBLEViewGONE);
            this.progressBar.setVisibility(stateLoadingViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvTotalItem, stringFormatTvTotalItemAndroidStringCartItemTotalItem);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): totalItem
        flag 1 (0x2L): state
        flag 2 (0x3L): null
        flag 3 (0x4L): state.loading ? View.VISIBLE : View.GONE
        flag 4 (0x5L): state.loading ? View.VISIBLE : View.GONE
        flag 5 (0x6L): state.success ? View.VISIBLE : View.GONE
        flag 6 (0x7L): state.success ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}