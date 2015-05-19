package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.parse.Parse;
import com.parse.ParseUser;
import com.parse.ParseAnonymousUtils;

/**
 * Created by Arkaprava on 5/19/2015.
 */
public class MainActivity extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if(ParseAnonymousUtils.isLinked(ParseUser.getCurrentUser())) {
            Intent i = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(i);
            finish();
        }
        else {
            ParseUser current = ParseUser.getCurrentUser();
            if(current != null) {
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
                finish();
            }
            else {
                Intent i = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(i);
                finish();
            }
        }
    }
}
