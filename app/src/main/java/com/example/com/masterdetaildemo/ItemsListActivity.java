package com.example.com.masterdetaildemo;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.FrameLayout;

public class ItemsListActivity extends AppCompatActivity implements ItemsListFragment.OnListItemSelectedListener {

    private static final String TAG = "ItemsListActivityTAG_";
    // Flag determines if this is a one or two pane layout
    private boolean isLandscape = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items_list);
        determinePaneLayout();
    }

    // Handles the event when the fragmen list item is selected
    @Override
    public void onItemSelected(Item item) {
        if (isLandscape) {
            //If landscape replace with fragment
            ItemDetailFragment fragmentItem = ItemDetailFragment.newInstance(item);
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.flDetailContainer, fragmentItem);
            ft.commit();
        } else {
            // If portrait use an intent to navegate to 2nd activity
            Intent intent = new Intent(this, ItemDetailActivity.class);
            // Embed seriealized item
            intent.putExtra("item", item);
            // Start activity
            startActivity(intent);
        }

    }

    private void determinePaneLayout() {
        FrameLayout fragmentItemDetail = (FrameLayout) findViewById(R.id.flDetailContainer);
        // If there is a second pane for details
        if (fragmentItemDetail != null) {
            isLandscape = true;
        }
    }

    /*@Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        // Checks the orientation of the screen
        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            isLandscape = true;
        } else if (newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            isLandscape = false;
        }
        Log.d(TAG, "isLandscape: " + isLandscape);
    }*/

}
