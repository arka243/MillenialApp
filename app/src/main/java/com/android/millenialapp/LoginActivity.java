package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends Activity {

    private static final String Tag = "MillenialApp";

    private EditText mUsernameView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        Log.i(Tag, "From the Millenial App");

        // Set up the login form.
        mUsernameView = (EditText) findViewById(R.id.username);

        mPasswordView = (EditText) findViewById(R.id.password);

        Button mUsernameSignInButton = (Button) findViewById(R.id.username_sign_in_button);
        mUsernameSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = mUsernameView.getText().toString();
                String password = mPasswordView.getText().toString();

                ParseUser.logInInBackground(username, password, new LogInCallback() {
                      @Override
                      public void done(ParseUser parseUser, ParseException e) {
                           if(parseUser != null) {
                                Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                                startActivity(intent);
                                Toast.makeText(getApplicationContext(),"Successfully Logged In",Toast.LENGTH_LONG).show();
                                finish();
                           }
                           else {
                                Toast.makeText(getApplicationContext(), "User doesn't exist! Please Sign Up!", Toast.LENGTH_LONG).show();
                           }
                      }
                });
            }
        });

        TextView mUsernameSignUpButton = (TextView) findViewById(R.id.username_sign_up_button);
        mUsernameSignUpButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}