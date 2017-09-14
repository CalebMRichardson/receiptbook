package com.duckduckhoneybadger.receiptlog;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ReceiptAdapter extends RecyclerView.Adapter<ReceiptAdapter.ReceiptHolder> {

    private static final String TAG = "ReceiptAdapter";

    private List<Receipt> mReceipts;

    public ReceiptAdapter(List<Receipt> receipts) {
        mReceipts = receipts;
    }

    @Override
    public ReceiptHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        return new ReceiptHolder(inflater, parent);
    }

    @Override
    public void onBindViewHolder(ReceiptHolder holder, int position) {
        Receipt receipt = mReceipts.get(position);
        holder.bind(receipt);
    }

    @Override
    public int getItemCount() {
        return mReceipts.size();
    }

    public class ReceiptHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private ImageView mImageView;
        private EditText mLocationText;
        private EditText mDateText;

        private Receipt mReceipt;

        public ReceiptHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_receipt, parent, false));

            mImageView = (ImageView) itemView.findViewById(R.id.log_image);
            mLocationText = (EditText) itemView.findViewById(R.id.location_edit_text);
            mDateText = (EditText) itemView.findViewById(R.id.date_edit_text);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

        }

        public void bind(Receipt receipt) {
            mReceipt = receipt;
            mDateText.setText(mReceipt.getDate().toString());
        }
    }
}
