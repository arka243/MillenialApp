package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.parse.ParseUser;

/**
 * Created by Arkaprava on 5/20/2015.
 */
public class EditProfileActivity extends Activity {

    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private Button editSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        editFirstName = (EditText) findViewById(R.id.editfirstname);
        editLastName = (EditText) findViewById(R.id.editlastname);
        editEmail = (EditText) findViewById(R.id.editemail);
        editSave = (Button) findViewById(R.id.saveprofile);

        ParseUser current = ParseUser.getCurrentUser();
        String firstnm = current.get("FirstName").toString();
        String lastnm = current.get("LastName").toString();
        String emailid = current.getEmail().toString();

        editFirstName.setText(firstnm);
        editLastName.setText(lastnm);
        editEmail.setText(emailid);

        editSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = editFirstName.getText().toString();
                String last = editLastName.getText().toString();
                String mail = editEmail.getText().toString();
                ParseUser currentuser = ParseUser.getCurrentUser();
                currentuser.put("FirstName", first);
                currentuser.put("LastName", last);
                currentuser.setEmail(mail);
                Intent i = new Intent(EditProfileActivity.this, ProfileActivity.class);
                startActivity(i);
                finish();

            }
        });

    }

}
