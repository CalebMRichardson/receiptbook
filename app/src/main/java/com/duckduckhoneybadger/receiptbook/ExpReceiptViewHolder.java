package com.duckduckhoneybadger.receiptbook;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.EditText;

import com.bignerdranch.expandablerecyclerview.ChildViewHolder;
import com.duckduckhoneybadger.receiptlog.R;

public class ExpReceiptViewHolder extends ChildViewHolder {

    private EditText mDateEditText;

    public ExpReceiptViewHolder(@NonNull View itemView) {
        super(itemView);

        mDateEditText = itemView.findViewById(R.id.date_edit_text);
    }

    public void bind(@NonNull ExpReceipt receipt) {

    }
}
