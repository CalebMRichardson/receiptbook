package com.duckduckhoneybadger.receiptlog;

import android.support.v4.app.Fragment;

public class ReceiptLogActivity extends SingleFrameActivity {

    @Override
    protected Fragment createFragment() {
        return new ReceiptListFragment().newInstance();
    }
}
