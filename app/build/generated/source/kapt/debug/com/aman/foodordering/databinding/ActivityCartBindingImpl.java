package com.aman.foodordering.databinding;
import com.aman.foodordering.R;
import com.aman.foodordering.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCartBindingImpl extends ActivityCartBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.app_bar_layout, 5);
        sViewsWithIds.put(R.id.collapsing_toolbar, 6);
        sViewsWithIds.put(R.id.cart_cardView, 7);
        sViewsWithIds.put(R.id.tv_total_cost, 8);
        sViewsWithIds.put(R.id.toolbar, 9);
        sViewsWithIds.put(R.id.btn_back, 10);
        sViewsWithIds.put(R.id.title, 11);
        sViewsWithIds.put(R.id.scroll, 12);
        sViewsWithIds.put(R.id.tv_review_cart, 13);
        sViewsWithIds.put(R.id.rv_cart, 14);
        sViewsWithIds.put(R.id.view_place_order_bottom, 15);
        sViewsWithIds.put(R.id.tv_total_item, 16);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView2;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCartBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityCartBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.material.appbar.AppBarLayout) bindings[5]
            , (androidx.appcompat.widget.AppCompatImageView) bindings[10]
            , (androidx.cardview.widget.CardView) bindings[7]
            , (android.widget.ProgressBar) bindings[4]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.core.widget.NestedScrollView) bindings[12]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[11]
            , (androidx.appcompat.widget.Toolbar) bindings[9]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[1]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[13]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[3]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[8]
            , (androidx.appcompat.widget.AppCompatTextView) bindings[16]
            , (android.view.View) bindings[15]
            );
        this.cartProgressBar.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[2];
        this.mboundView2.setTag(null);
        this.tvPrice.setTag(null);
        this.tvShowMore.setTag(null);
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
        if (BR.totalPrice == variableId) {
            setTotalPrice((java.lang.String) variable);
        }
        else if (BR.state == variableId) {
            setState((com.example.ca2mfusion.ui.MainState) variable);
        }
        else if (BR.shouldShowMore == variableId) {
            setShouldShowMore((java.lang.Boolean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setTotalPrice(@Nullable java.lang.String TotalPrice) {
        this.mTotalPrice = TotalPrice;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.totalPrice);
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
    public void setShouldShowMore(@Nullable java.lang.Boolean ShouldShowMore) {
        this.mShouldShowMore = ShouldShowMore;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.shouldShowMore);
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
        boolean androidxDatabindingViewDataBindingSafeUnboxShouldShowMore = false;
        java.lang.String totalPrice = mTotalPrice;
        int shouldShowMoreViewVISIBLEViewGONE = 0;
        int stateLoadingViewVISIBLEViewGONE = 0;
        boolean stateLoading = false;
        boolean stateSuccess = false;
        com.example.ca2mfusion.ui.MainState state = mState;
        java.lang.Boolean shouldShowMore = mShouldShowMore;
        int stateSuccessViewVISIBLEViewGONE = 0;

        if ((dirtyFlags & 0x9L) != 0) {
        }
        if ((dirtyFlags & 0xaL) != 0) {



                if (state != null) {
                    // read state.loading
                    stateLoading = state.getLoading();
                    // read state.success
                    stateSuccess = state.getSuccess();
                }
            if((dirtyFlags & 0xaL) != 0) {
                if(stateLoading) {
                        dirtyFlags |= 0x80L;
                }
                else {
                        dirtyFlags |= 0x40L;
                }
            }
            if((dirtyFlags & 0xaL) != 0) {
                if(stateSuccess) {
                        dirtyFlags |= 0x200L;
                }
                else {
                        dirtyFlags |= 0x100L;
                }
            }


                // read state.loading ? View.VISIBLE : View.GONE
                stateLoadingViewVISIBLEViewGONE = ((stateLoading) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
                // read state.success ? View.VISIBLE : View.GONE
                stateSuccessViewVISIBLEViewGONE = ((stateSuccess) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        if ((dirtyFlags & 0xcL) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldShowMore)
                androidxDatabindingViewDataBindingSafeUnboxShouldShowMore = androidx.databinding.ViewDataBinding.safeUnbox(shouldShowMore);
            if((dirtyFlags & 0xcL) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxShouldShowMore) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(shouldShowMore) ? View.VISIBLE : View.GONE
                shouldShowMoreViewVISIBLEViewGONE = ((androidxDatabindingViewDataBindingSafeUnboxShouldShowMore) ? (android.view.View.VISIBLE) : (android.view.View.GONE));
        }
        // batch finished
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            this.cartProgressBar.setVisibility(stateLoadingViewVISIBLEViewGONE);
            this.mboundView2.setVisibility(stateSuccessViewVISIBLEViewGONE);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvPrice, totalPrice);
        }
        if ((dirtyFlags & 0xcL) != 0) {
            // api target 1

            this.tvShowMore.setVisibility(shouldShowMoreViewVISIBLEViewGONE);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): totalPrice
        flag 1 (0x2L): state
        flag 2 (0x3L): shouldShowMore
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(shouldShowMore) ? View.VISIBLE : View.GONE
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(shouldShowMore) ? View.VISIBLE : View.GONE
        flag 6 (0x7L): state.loading ? View.VISIBLE : View.GONE
        flag 7 (0x8L): state.loading ? View.VISIBLE : View.GONE
        flag 8 (0x9L): state.success ? View.VISIBLE : View.GONE
        flag 9 (0xaL): state.success ? View.VISIBLE : View.GONE
    flag mapping end*/
    //end
}