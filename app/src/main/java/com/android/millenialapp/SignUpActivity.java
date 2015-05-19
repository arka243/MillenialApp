package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.parse.SignUpCallback;
import com.parse.ParseUser;
import com.parse.ParseException;

public class SignUpActivity extends Activity {

    private EditText signupEmail;
    private EditText signupUid;
    private EditText signupPwd;
    private EditText signupConfirmPwd;
    private Button signupBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //setting up the sign up form

        signupEmail = (EditText) findViewById(R.id.signupemail);
        signupUid = (EditText) findViewById(R.id.signupusername);
        signupPwd = (EditText) findViewById(R.id.signuppassword);
        signupConfirmPwd = (EditText) findViewById(R.id.signupconfirmpassword);

        signupBtn = (Button) findViewById(R.id.sign_up_btn);
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = signupEmail.getText().toString();
                String username = signupUid.getText().toString();
                String password = signupPwd.getText().toString();
                String confpwd = signupConfirmPwd.getText().toString();
                if (email.equals("") || username.equals("") || password.equals("") || confpwd.equals("")) {
                    Toast.makeText(getApplicationContext(), "Fill up all the fields!", Toast.LENGTH_LONG).show();
                }
                else if(!password.equals(confpwd)){
                    Toast.makeText(getApplicationContext(), "Passwords didn't match!", Toast.LENGTH_LONG).show();
                }
                else if(!email.contains("@")) {
                    Toast.makeText(getApplicationContext(), "Email id not valid", Toast.LENGTH_LONG).show();
                }
                else if(password.length() <= 6) {
                    Toast.makeText(getApplicationContext(), "Password must be more than 6 characters", Toast.LENGTH_LONG).show();
                }
                else {
                    ParseUser user = new ParseUser();
                    user.setEmail(email);
                    user.setUsername(username);
                    user.setPassword(password);
                    user.signUpInBackground(new SignUpCallback() {
                        @Override
                        public void done(ParseException e) {
                            if(e == null) {
                                Toast.makeText(getApplicationContext(), "Successfully signed in, please log in!", Toast.LENGTH_LONG).show();
                                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                                startActivity(intent);
                                finish();
                            }
                            else {
                                Toast.makeText(getApplicationContext(), "Sign Up Error", Toast.LENGTH_LONG).show();
                            }
                        }
                    });
                }
            }
        });

    }
}
