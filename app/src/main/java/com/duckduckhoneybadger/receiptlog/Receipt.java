package com.duckduckhoneybadger.receiptlog;

import java.util.Date;
import java.util.UUID;

public class Receipt {

    private UUID mID;
    private String mTitle;
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

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }
}
