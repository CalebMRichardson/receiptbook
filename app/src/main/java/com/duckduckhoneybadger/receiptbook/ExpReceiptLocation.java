package com.duckduckhoneybadger.receiptbook;

import com.bignerdranch.expandablerecyclerview.model.Parent;

import java.util.List;

public class ExpReceiptLocation implements Parent<ExpReceipt> {

    private String mLocation;
    private List<ExpReceipt> mReceipts;

    public ExpReceiptLocation(String location, List<ExpReceipt> receipts) {
        mLocation = location;
        mReceipts = receipts;
    }

    @Override
    public List<ExpReceipt> getChildList() {
        return mReceipts;
    }

    @Override
    public boolean isInitiallyExpanded() {
        return false;
    }

    public String getLocation() {
        return mLocation;
    }
}
