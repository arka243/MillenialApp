package com.android.millenialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends DrawerActivity {

    private TextView fullName;
    private TextView userTitle;
    private Button editProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState, R.layout.activity_profile);

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

        /* Hard coded profile */
        fullName.setText("Carolina Leigh");
        userTitle.setText("Tastemaker");
    }
}
