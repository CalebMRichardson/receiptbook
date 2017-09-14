package com.duckduckhoneybadger.receiptbook;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.UUID;

public class ReceiptPagerActivity extends AppCompatActivity {

    //TODO make this a fragment

    private static final String EXTRA_RECEIPT_ID = "com.duckduckhoneybadger.receiptbook.receipt_id";

    public static Intent newIntent(Context packageContext, UUID receiptID) {
        Intent intent = new Intent(packageContext, ReceiptPagerActivity.class);
        intent.putExtra(EXTRA_RECEIPT_ID, receiptID);
        return intent;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
