package com.duckduckhoneybadger.receiptlog;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

//https://bignerdranch.github.io/expandable-recycler-view/ - https://www.bignerdranch.com/blog/expand-a-recyclerview-in-four-steps/

public class ReceiptListFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.LayoutManager mLayoutManager;
    private ReceiptAdapter mAdapter;

    private TextView mEmptyListTextView;
    private Button mAddNewLogButton;

    public static ReceiptListFragment newInstance() {
        return new ReceiptListFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_receipt_list, container, false);

        mRecyclerView = (RecyclerView) v.findViewById(R.id.receipt_recycler_view);
        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mEmptyListTextView = (TextView) v.findViewById(R.id.empty_list_textview);
        mAddNewLogButton = (Button) v.findViewById(R.id.add_receipt_button);
        mAddNewLogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startAddLogPageActivity();
            }
        });

        updateUI();

        return v;
    }

    private void updateUI() {
        ReceiptLab receiptLab = ReceiptLab.get(getActivity());
        List<Receipt> receipts = receiptLab.getReceipts();

        mAdapter = new ReceiptAdapter(receipts);
        mRecyclerView.setAdapter(mAdapter);
        mAdapter.notifyDataSetChanged();

        boolean listIsEmpty = receiptLab.getReceipts().isEmpty();
        updateEmptyNotification(listIsEmpty);
    }

    private void updateEmptyNotification(boolean isEmpty) {
        if (isEmpty) {
            mAddNewLogButton.setVisibility(View.VISIBLE);
            mEmptyListTextView.setVisibility(View.VISIBLE);
        } else {
            mAddNewLogButton.setVisibility(View.INVISIBLE);
            mEmptyListTextView.setVisibility(View.INVISIBLE);
        }
    }

    private void startAddLogPageActivity() {

        Receipt receipt = new Receipt();

        Intent intent = ReceiptPagerActivity.newIntent(getActivity(), receipt.getID());

        startActivity(intent);

    }
}