package com.android.millenialapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import com.parse.ParseUser;

public class ProfileActivity extends Activity {

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

        ParseUser current = ParseUser.getCurrentUser();

        String user = current.getUsername().toString();
        fullName.setText(user);

    }
}
