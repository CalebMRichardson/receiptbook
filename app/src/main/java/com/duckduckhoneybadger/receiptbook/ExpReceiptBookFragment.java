package com.duckduckhoneybadger.receiptbook;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.bignerdranch.expandablerecyclerview.ExpandableRecyclerAdapter;
import com.duckduckhoneybadger.receiptlog.R;

import java.util.Arrays;
import java.util.List;

public class ExpReceiptBookFragment extends Fragment {

    private ExpReceiptAdapter mAdapter;

    public static ExpReceiptBookFragment newInstance() {
        return new ExpReceiptBookFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);

        View v = inflater.inflate(R.layout.fragment_receipt_list, container, false);

        ExpReceipt one = new ExpReceipt("Test1");
        ExpReceipt two = new ExpReceipt("Test2");
        ExpReceipt three = new ExpReceipt("Test3");
        ExpReceipt four = new ExpReceipt("Test4");
        ExpReceipt five = new ExpReceipt("Test5");
        ExpReceipt six = new ExpReceipt("Test6");
        ExpReceipt seven = new ExpReceipt("Test7");

        ExpReceiptLocation first = new ExpReceiptLocation("Annies Country Kitchen Buffet", Arrays.asList(one, two, three));
        ExpReceiptLocation second = new ExpReceiptLocation("Super 1", Arrays.asList(four));
        ExpReceiptLocation third = new ExpReceiptLocation("Taco Bell", Arrays.asList(five, six));
        ExpReceiptLocation fourth = new ExpReceiptLocation("McDonalds", Arrays.asList(seven));

        final List<ExpReceiptLocation> locations = Arrays.asList(first, second, third, fourth);

        RecyclerView recyclerView = v.findViewById(R.id.receipt_recycler_view);
        mAdapter = new ExpReceiptAdapter(getActivity(), locations);
        mAdapter.setExpandCollapseListener(new ExpandableRecyclerAdapter.ExpandCollapseListener() {

            @UiThread
            @Override
            public void onParentExpanded(int parentPosition) {

            }

            @UiThread
            @Override
            public void onParentCollapsed(int parentPosition) {

            }
        });

        recyclerView.setAdapter(mAdapter);
        recyclerView.addItemDecoration(new SpaceItemDecoration(20, 10));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        return v;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        mAdapter.onSaveInstanceState(outState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mAdapter.onRestoreInstanceState(savedInstanceState);
    }
}
