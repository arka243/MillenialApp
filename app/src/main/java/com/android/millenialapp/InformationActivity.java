package com.android.millenialapp;

import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Arkaprava on 6/15/2015.
 */
public class InformationActivity extends DrawerActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_information);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }

}

