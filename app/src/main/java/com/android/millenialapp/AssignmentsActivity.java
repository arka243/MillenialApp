package com.android.millenialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class AssignmentsActivity extends DrawerActivity {

    private TextView msgfirstLine1;
    private TextView msgSecondLine1;
    private TextView msgThirdLine1;
    private TextView msgfirstLine2;
    private TextView msgSecondLine2;
    private TextView msgThirdLine2;
    private TextView msgfirstLine3;
    private TextView msgSecondLine3;
    private TextView msgThirdLine3;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_assignments);

        msgfirstLine1 = (TextView) findViewById(R.id.firstLine1);
        msgSecondLine1 = (TextView) findViewById(R.id.secondLine1);
        msgThirdLine1 = (TextView) findViewById(R.id.thirdLine1);
        msgfirstLine2 = (TextView) findViewById(R.id.firstLine2);
        msgSecondLine2 = (TextView) findViewById(R.id.secondLine2);
        msgThirdLine2 = (TextView) findViewById(R.id.thirdLine2);
        msgfirstLine3 = (TextView) findViewById(R.id.firstLine3);
        msgSecondLine3 = (TextView) findViewById(R.id.secondLine3);
        msgThirdLine3 = (TextView) findViewById(R.id.thirdLine3);

        msgfirstLine1.setText("Project Fridge");
        msgSecondLine1.setText("Chat");
        msgThirdLine1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut allquip ex ea commodo consequat.");
        msgfirstLine2.setText("Old Habbits");
        msgSecondLine2.setText("Diary");
        msgThirdLine2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
        msgfirstLine3.setText("Chatterbox");
        msgSecondLine3.setText("Quiz");
        msgThirdLine3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut allquip ex ea commodo consequat.");

    }

//    public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu) {
//        com.actionbarsherlock.view.MenuInflater inflater = getSupportMenuInflater();
//        inflater.inflate(R.layout.menu, menu);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.info, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.action_info:
                Intent i=new Intent(AssignmentsActivity.this, InformationActivity.class);
                startActivity(i);
                return true;
        }
        return false;
    }

//    public void gotoInfo(MenuItem item) {
//        Intent intent = new Intent(AssignmentsActivity.this, InformationActivity.class);
//        startActivity(intent);
//        finish();
//    }
}
