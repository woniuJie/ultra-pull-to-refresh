package com.culiu.refresh.demo.ptrview;

import android.content.Context;
import android.util.AttributeSet;

import com.culiu.refresh.ultrapulltorefresh.ptr.PtrFrameLayout;


/**
 * Created by wangjing on 2016/3/22.
 */
public class PtrSlotFrameLayout extends PtrFrameLayout {

    private PtrSlotHeader mPtrSlotHeader;

    public PtrSlotFrameLayout(Context context) {
        super(context);
        initView();
    }

    public PtrSlotFrameLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public PtrSlotFrameLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        initView();
    }

    private void initView() {
        mPtrSlotHeader = new PtrSlotHeader(getContext());
        setHeaderView(mPtrSlotHeader);
        addPtrUIHandler(mPtrSlotHeader);

        // 拉到header高度的一半时开始刷新
        setRatioOfHeaderHeightToRefresh(0.25F);

        /**
         * 设置下拉后立即允许下次下拉刷新, 请看updatePos()方法，因为下拉刷新后下拉刷新状态有个复位的过程，
         * 还没有自动复位时，下次在下拉时，是会屏蔽掉这个状态的，这只是作者的一种设计，并不是bug，
         * setEnabledNextPtrAtOnce后，在下拉刷新状态为 complete 时，就会去检验 mFlage 的配置
         */
        setEnabledNextPtrAtOnce(true);
    }

}
