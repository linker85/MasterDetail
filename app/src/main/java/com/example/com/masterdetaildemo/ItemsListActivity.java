package com.example.com.masterdetaildemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ItemsListActivity extends AppCompatActivity implements ItemsListFragment.OnListItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);
    }

    // Handles the event when the fragmen list item is selected
    @Override
    public void onItemSelected(Item item) {
        Intent intent = new Intent(this, ItemDetailActivity.class);
        // Embed seriealized item
        intent.putExtra("item", item);
        // Start activity
        startActivity(intent);
    }
}
