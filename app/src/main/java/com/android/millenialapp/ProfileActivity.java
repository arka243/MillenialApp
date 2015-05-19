package com.android.millenialapp;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;


public class ProfileActivity extends Activity {

    private static final String[] DUMMY_NAMES = new String[]{
            "Arkaprava Praharaj", "Priti Changlani", "Admin User"
    };
    private TextView fullName;
    private TextView userTitle;
    private Button editProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //setting up the profile form

        fullName = (TextView) findViewById(R.id.fullname);
        userTitle = (TextView) findViewById(R.id.title);
        editProfile = (Button) findViewById(R.id.editprofile);

        Bundle b = getIntent().getExtras();
        int cnt = b.getInt("key");
        fullName.setText(DUMMY_NAMES[cnt]);

    }
}
