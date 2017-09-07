package com.duckduckhoneybadger.receiptlog;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

        private TextView mTitleTextView;
        private ImageView mImageView;

        private Receipt mReceipt;

        public ReceiptHolder(LayoutInflater inflater, ViewGroup parent) {
            super(inflater.inflate(R.layout.list_item_receipt, parent, false));

            mTitleTextView = (TextView) itemView.findViewById(R.id.log_title);
            mImageView = (ImageView) itemView.findViewById(R.id.log_expand);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Log.i(TAG, mReceipt.getTitle() + " Clicked");
        }

        public void bind(Receipt receipt) {
            mReceipt = receipt;
            mTitleTextView.setText(mReceipt.getTitle());
        }
    }
}
