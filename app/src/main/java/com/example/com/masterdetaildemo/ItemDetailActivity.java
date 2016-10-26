package com.example.com.masterdetaildemo;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemDetailActivity extends AppCompatActivity {

    ItemDetailFragment fragmentDetailFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);

        // Fetch the data from the list
        Item item = (Item) getIntent().getSerializableExtra("item");
        if (savedInstanceState == null) {
            // Get item from fragment detail
            fragmentDetailFragment = ItemDetailFragment.newInstance(item);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flDetailContainer, fragmentDetailFragment);
            ft.commit();
        }
    }
}
