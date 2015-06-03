package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {

    /* Hard coded Login */
    String user = "carleigh";
    String pwd = "car12345";

    private EditText mUsernameView;
    private EditText mPasswordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        // Set up the login form.
        mUsernameView = (EditText) findViewById(R.id.username);

        mPasswordView = (EditText) findViewById(R.id.password);

        Button mUsernameSignInButton = (Button) findViewById(R.id.username_sign_in_button);
        mUsernameSignInButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                final String username = mUsernameView.getText().toString();
                String password = mPasswordView.getText().toString();

                if(!username.equals("") && !password.equals("")) {
                //if(username.equals(user) && password.equals(pwd)) {
                    Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);
                    startActivity(intent);
                    finish();
                }
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