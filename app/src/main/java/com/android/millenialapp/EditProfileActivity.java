package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import java.util.HashMap;

/**
 * Created by Arkaprava on 5/20/2015.
 */
public class EditProfileActivity extends Activity {

    private EditText editFirstName;
    private EditText editLastName;
    private EditText editEmail;
    private EditText editZip;
    private EditText editMobile;
    private Button editSave;
    private Spinner editGender;
    private Spinner editMonth;
    private Spinner editDay;
    private Spinner editYear;
    public static HashMap<String,String> userProfileDetails = new HashMap<String, String>();
    String currentuser = "carleigh";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editprofile);

        editFirstName = (EditText) findViewById(R.id.editfirstname);
        editLastName = (EditText) findViewById(R.id.editlastname);
        editEmail = (EditText) findViewById(R.id.editemail);
        editSave = (Button) findViewById(R.id.saveprofile);
        editGender = (Spinner) findViewById(R.id.genderspinner);
        editMonth = (Spinner) findViewById(R.id.monthspinner);
        editDay = (Spinner) findViewById(R.id.dayspinner);
        editYear = (Spinner) findViewById(R.id.yearspinner);
        editZip = (EditText) findViewById(R.id.editzip);
        editMobile = (EditText) findViewById(R.id.editmobile);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.genderarray, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editGender.setAdapter(adapter);
        Integer[] years = new Integer[100];
        for(int i=0;i<years.length;i++) {
            years[i] = 1901+i;
        }
        ArrayAdapter<CharSequence> monthadapter = ArrayAdapter.createFromResource(this, R.array.montharray, android.R.layout.simple_spinner_item);
        monthadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editMonth.setAdapter(monthadapter);
        ArrayAdapter<CharSequence> dayadapter = ArrayAdapter.createFromResource(this, R.array.dayarray, android.R.layout.simple_spinner_item);
        dayadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editDay.setAdapter(dayadapter);
        ArrayAdapter<Integer> yearadapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_spinner_item, years);
        yearadapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        editYear.setAdapter(yearadapter);

        if(userProfileDetails.containsKey(currentuser)) {
            String userinfo = userProfileDetails.get(currentuser);
            String[] userinfosplit = userinfo.split(" ");
            editFirstName.setText(userinfosplit[0]);
            editLastName.setText(userinfosplit[1]);
            editEmail.setText(userinfosplit[2]);
            editZip.setText(userinfosplit[7]);
            editMobile.setText(userinfosplit[8]);
            int pos1 = monthadapter.getPosition(userinfosplit[3]);
            editMonth.setSelection(pos1);
            int pos2 = dayadapter.getPosition(userinfosplit[4]);
            editDay.setSelection(pos2);
            Integer yearvalue = Integer.parseInt(userinfosplit[5]);
            int pos3 = yearadapter.getPosition(yearvalue);
            editYear.setSelection(pos3);
            int pos4 = adapter.getPosition(userinfosplit[6]);
            editGender.setSelection(pos4);
        }

        editSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String first = editFirstName.getText().toString();
                String last = editLastName.getText().toString();
                String mail = editEmail.getText().toString();
                String month = editMonth.getSelectedItem().toString();
                String day = editDay.getSelectedItem().toString();
                String year = editYear.getSelectedItem().toString();
                String gender = editGender.getSelectedItem().toString();
                String zip = editZip.getText().toString();
                String mobile = editMobile.getText().toString();
                if(first.equals("") || last.equals("") || mail.equals("") || month.equals("") || day.equals("") || year.equals("") || gender.equals("") || zip.equals("") || mobile.equals("")) {
                    Toast.makeText(getApplicationContext(), "One or more fields are empty!", Toast.LENGTH_LONG).show();
                }
                else {
                    String fullinfo = first + " " + last + " " + mail + " " + month + " " + day + " " + year + " " + gender + " " + zip + " " + mobile;
                    userProfileDetails.put(currentuser, fullinfo);
                    Intent i = new Intent(EditProfileActivity.this, ProfileActivity.class);
                    startActivity(i);
                    finish();
                }
            }
        });

    }

}
