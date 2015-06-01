package com.android.millenialapp;

import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class ForumActivity extends DrawerActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_drawer);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }
}
