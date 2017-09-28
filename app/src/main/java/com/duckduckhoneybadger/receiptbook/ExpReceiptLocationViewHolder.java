package com.duckduckhoneybadger.receiptbook;


import android.support.annotation.NonNull;
import android.view.View;
import android.widget.TextView;

import com.bignerdranch.expandablerecyclerview.ParentViewHolder;
import com.bignerdranch.expandablerecyclerview.model.Parent;

import com.duckduckhoneybadger.receiptlog.R;


public class ExpReceiptLocationViewHolder extends ParentViewHolder {

    private TextView mLocationTextView;
    private TextView mTotalTextView;

    public ExpReceiptLocationViewHolder(@NonNull View itemView) {
        super(itemView);
        mLocationTextView = itemView.findViewById(R.id.location_text_view);
        mTotalTextView = itemView.findViewById(R.id.total_text_view);
    }

    public void bind(@NonNull ExpReceiptLocation location) {
        mLocationTextView.setText(location.getLocation());
    }

    @Override
    public void setExpanded(boolean expanded) {
        super.setExpanded(expanded);
    }

    @Override
    public void onExpansionToggled(boolean expanded) {
        super.onExpansionToggled(expanded);
    }
}
