package com.android.millenialapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


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

    }
}
