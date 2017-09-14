package com.duckduckhoneybadger.receiptbook;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class ReceiptLab {

    private static ReceiptLab sReceiptLab;

    private List<Receipt> mReceipts;

    public static ReceiptLab get(Context context) {
        if (sReceiptLab == null) {
            sReceiptLab = new ReceiptLab(context);
        }

        return  sReceiptLab;
    }

    private ReceiptLab(Context context) {
        mReceipts = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Receipt receipt = new Receipt();
            mReceipts.add(receipt);
        }
    }

    public List<Receipt> getReceipts() {
        return mReceipts;
    }
}
