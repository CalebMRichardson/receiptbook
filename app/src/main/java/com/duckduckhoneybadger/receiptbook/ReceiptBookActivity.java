package com.duckduckhoneybadger.receiptbook;

import android.support.v4.app.Fragment;

public class ReceiptBookActivity extends SingleFrameActivity {

    @Override
    protected Fragment createFragment() {
        return new ReceiptListFragment().newInstance();
    }
}
