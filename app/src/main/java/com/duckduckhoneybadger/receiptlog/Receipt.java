package com.duckduckhoneybadger.receiptlog;

import java.util.Date;
import java.util.UUID;

public class Receipt {

    private UUID mID;
    private Date mDate;

    public Receipt() {
        this(UUID.randomUUID());
    }

    public Receipt(UUID id) {
        mID = id;
        mDate = new Date();
    }

    public UUID getID() {
        return mID;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
