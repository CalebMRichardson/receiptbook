package com.duckduckhoneybadger.receiptbook;


import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bignerdranch.expandablerecyclerview.ExpandableRecyclerAdapter;

import java.util.List;

import com.duckduckhoneybadger.receiptlog.R;

public class ExpReceiptAdapter extends ExpandableRecyclerAdapter<ExpReceiptLocation, ExpReceipt, ExpReceiptLocationViewHolder, ExpReceiptViewHolder> {

    private LayoutInflater mInflater;
    private List<ExpReceiptLocation> mLocationList;

    public ExpReceiptAdapter(Context context, @NonNull List<ExpReceiptLocation> locations) {
        super(locations);
        mLocationList = locations;
        mInflater = LayoutInflater.from(context);
    }

    @UiThread
    @Override
    public void onBindParentViewHolder(@NonNull ExpReceiptLocationViewHolder locationViewHolder, int parentPosition, @NonNull ExpReceiptLocation location) {
        locationViewHolder.bind(location);
    }

    @UiThread
    @NonNull
    @Override
    public ExpReceiptLocationViewHolder onCreateParentViewHolder(@NonNull ViewGroup parentViewGroup, int viewType) {
        View locationView = mInflater.inflate(R.layout.list_item_receipt_parent, parentViewGroup, false);
        return new ExpReceiptLocationViewHolder(locationView);
    }

    @UiThread
    @NonNull
    @Override
    public ExpReceiptViewHolder onCreateChildViewHolder(@NonNull ViewGroup childViewGroup, int viewType) {
        View receiptView = mInflater.inflate(R.layout.list_item_receipt_child, childViewGroup, false);
        return new ExpReceiptViewHolder(receiptView);
    }

    @UiThread
    @Override
    public void onBindChildViewHolder(@NonNull ExpReceiptViewHolder receiptViewHolder, int parentPosition, int childPosition, @NonNull ExpReceipt receipt) {
        receiptViewHolder.bind(receipt);
    }

    @Override
    public boolean isParentViewType(int viewType) {
        return super.isParentViewType(viewType);
    }
}
