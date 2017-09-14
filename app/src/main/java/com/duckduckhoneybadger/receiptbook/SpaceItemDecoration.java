package com.duckduckhoneybadger.receiptbook;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class SpaceItemDecoration extends RecyclerView.ItemDecoration {

    private int mHorizontal;
    private int mVertical;

    public SpaceItemDecoration(int horizontal, int vertical) {
        mHorizontal = horizontal;
        mVertical = vertical;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        outRect.left = mHorizontal;
        outRect.right = mHorizontal;
        outRect.bottom = mVertical;
        outRect.top = mVertical;

    }
}
