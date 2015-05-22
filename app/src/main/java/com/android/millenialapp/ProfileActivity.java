package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.parse.FindCallback;
import com.parse.ParseException;
import com.parse.ParseObject;
import com.parse.ParseQuery;
import com.parse.ParseUser;

import java.util.HashMap;
import java.util.List;

public class ProfileActivity extends Activity {

    private TextView fullName;
    private TextView userTitle;
    private Button editProfile;
    private Button logOut;
    static HashMap<String, String> userDetails = new HashMap<String, String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        //setting up the profile form
        fullName = (TextView) findViewById(R.id.fullname);
        userTitle = (TextView) findViewById(R.id.title);
        editProfile = (Button) findViewById(R.id.editprofile);
        editProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(ProfileActivity.this,EditProfileActivity.class);
                startActivity(i);
                finish();
            }
        });

        logOut = (Button) findViewById(R.id.logout);
        logOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ParseUser.logOut();
                Intent intent = new Intent(ProfileActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });

        ParseUser current = ParseUser.getCurrentUser();
        String user = current.getUsername().toString();

        EditProfileActivity epa = new EditProfileActivity();
        if(epa.userProfileDetails.containsKey(user)) {
            String userinfo = epa.userProfileDetails.get(user);
            String[] splitinfo = userinfo.split(" ");
            userDetails.put(user, splitinfo[0] + " " + splitinfo[1]);
        }
        if(userDetails.containsKey(user)) {
            fullName.setText(userDetails.get(user));
        }
        else {
            fullName.setText("Anonymous User");
        }
    }
}
