package com.culiu.refresh.demo.ptrview;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.culiu.refresh.ultrapulltorefresh.ptr.PtrFrameLayout;
import com.culiu.refresh.ultrapulltorefresh.ptr.PtrUIHandler;
import com.culiu.refresh.ultrapulltorefresh.ptr.indicator.PtrIndicator;


/**
 * 用于UltraPullToRefresh使用,老虎机的下拉刷新
 * Created by wangjing on 2016/3/22.
 */
public class PtrSlotHeader extends FrameLayout implements PtrUIHandler {

//    protected SlotView mSlotView;

    protected ImageView mSlotProgressBar;

    protected ImageView mSlotHeaderView;

    public PtrSlotHeader(Context context) {
        super(context);
        initView();
    }

    public PtrSlotHeader(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView();
    }

    public PtrSlotHeader(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    public PtrSlotHeader(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView();
    }

    public void initView() {
//        inflate(getContext(), R.layout.pull_to_refresh_header_slot, this);
//        mSlotView = (SlotView) findViewById(R.id.iv_big_ptr_header);
//        mSlotProgressBar = (ImageView) findViewById(R.id.slot_progress_bar);
//        mSlotHeaderView = (ImageView) findViewById(R.id.iv_header);
    }


    @Override
    public void onUIReset(PtrFrameLayout frame) {
//        mSlotView.onStop();
//        handleSlotProgress(0);
    }

    @Override
    public void onUIRefreshPrepare(PtrFrameLayout frame) {
//        setSlotViewLayout(frame);
//        mSlotView.startAnimation();
//
//
//        // 动画加速: 3倍速
//        mSlotView.updateSpeed();
//        mSlotView.updateSpeed();
    }

    @Override
    public void onUIRefreshBegin(PtrFrameLayout frame) {
        handleSlotProgress(0);
    }

    @Override
    public void onUIRefreshComplete(PtrFrameLayout frame) {
//        mSlotView.stopAnimation();
    }

    @Override
    public void onUIPositionChange(PtrFrameLayout frame, boolean isUnderTouch, byte status,
                                   PtrIndicator ptrIndicator) {
        if (isUnderTouch) {
            float scaleOfSlotProgress = ptrIndicator.getCurrentPosY() * 1.0F / ptrIndicator.getOffsetToRefresh();
            handleSlotProgress(scaleOfSlotProgress);
        }
    }

    private boolean hasAdjustLayout = false;

    private void setSlotViewLayout(PtrFrameLayout frame) {
//        if (hasAdjustLayout) {
//            return;
//        }
//        hasAdjustLayout = true;
//        // 上面隐藏4个View的距离; 上方有一个mSlotHeaderView
//        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) mSlotView.getLayoutParams();
//        layoutParams.topMargin -= (mSlotView.getHeight() / SlotView.VIEW_NUM * 4 - mSlotHeaderView.getHeight());
//        mSlotView.setLayoutParams(layoutParams);

        /**
         * 设置headerview停住的位置,实现方式有些恶心,按理应该在初始化的时候就应该把这些设置好的,因为上面
         * 老虎机的布局又改过一次高度，减去20dp为偏移量，调试出来的，跟计算无关，因为高度变了，悬停的位置也
         * 变了
         */
//        frame.setOffsetToKeepHeaderWhileLoading(getHeight() / 5 - PixelUtil.dip2px(getContext(), 20));
    }

    private void handleSlotProgress(float scaleOfLayout) {
//        if (1 < scaleOfLayout) {
//            return;
//        }
//        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) mSlotProgressBar.getLayoutParams();
//        layoutParams.height = (int) (getResources().getDimension(R.dimen.slot_progress_bar_height) * (1 - scaleOfLayout));
//        mSlotProgressBar.setLayoutParams(layoutParams);
    }

}
