package com.example.com.masterdetaildemo;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ItemDetailFragment extends Fragment {
    private Item item;

    public ItemDetailFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        item = (Item) getArguments().getSerializable("item");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_item_detail, container, false);
        // Get reference to elements in detail
        ((TextView) rootView.findViewById(R.id.tvTitle)).setText(item.getTitle());
        ((TextView) rootView.findViewById(R.id.tvBody)).setText(item.getBody());
        return rootView;
    }

    // Returns new instance of fragment
    public static ItemDetailFragment newInstance(Item item) {
        ItemDetailFragment fragmentDemo = new ItemDetailFragment();
        Bundle args = new Bundle();
        args.putSerializable("item", item);
        fragmentDemo.setArguments(args);
        return  fragmentDemo;
    }

}
