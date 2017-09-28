package com.duckduckhoneybadger.receiptbook;


import java.util.Date;
import java.util.UUID;

public class ExpReceipt {

    private String mReceipt;
    private Date mDate;
    private UUID mUUID;

    public ExpReceipt(String receipt) {
        mReceipt = receipt;
        mUUID = UUID.randomUUID();
    }

    public String getReceipt() {
        return mReceipt;
    }

}
