package com.android.millenialapp;

import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class FeedsActivity extends DrawerActivity {

    private TextView feedfirstLine1;
    private TextView feedSecondLine1;
    private TextView feedfirstLine2;
    private TextView feedSecondLine2;
    private TextView feedfirstLine3;
    private TextView feedSecondLine3;
    private TextView feedThirdLine3;
    private TextView feedfirstLine4;
    private TextView feedSecondLine4;
    private TextView feedfirstLine5;
    private TextView feedSecondLine5;
    private TextView feedThirdLine5;
    private TextView feedfirstLine6;
    private TextView feedSecondLine6;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_feeds);

        feedfirstLine1 = (TextView) findViewById(R.id.firstLine1);
        feedSecondLine1 = (TextView) findViewById(R.id.secondLine1);
        feedfirstLine2 = (TextView) findViewById(R.id.firstLine2);
        feedSecondLine2 = (TextView) findViewById(R.id.secondLine2);
        feedfirstLine3 = (TextView) findViewById(R.id.firstLine3);
        feedSecondLine3 = (TextView) findViewById(R.id.secondLine3);
        feedThirdLine3 = (TextView) findViewById(R.id.thirdLine3);
        feedfirstLine4 = (TextView) findViewById(R.id.firstLine4);
        feedSecondLine4 = (TextView) findViewById(R.id.secondLine4);
        feedfirstLine5 = (TextView) findViewById(R.id.firstLine5);
        feedSecondLine5 = (TextView) findViewById(R.id.secondLine5);
        feedThirdLine5 = (TextView) findViewById(R.id.thirdLine5);
        feedfirstLine6 = (TextView) findViewById(R.id.firstLine6);
        feedSecondLine6 = (TextView) findViewById(R.id.secondLine6);

        feedfirstLine1.setText("Public Poll");
        feedSecondLine1.setText("What is your favourite movie by Robin Williams?");
        feedfirstLine2.setText("Project Fridge");
        feedSecondLine2.setText("A new assignment is ready for you!");
        feedfirstLine3.setText("Brett Danika replied on");
        feedSecondLine3.setText("Eating Healthy");
        feedThirdLine3.setText("Lorem ipsum dolor sit amet, consectetur...");
        feedfirstLine4.setText("Chatterbox");
        feedSecondLine4.setText("A new assignment is ready for you!");
        feedfirstLine5.setText("Carolina Leigh replied on");
        feedSecondLine5.setText("On the agenda");
        feedThirdLine5.setText("Lorem ipsum dolor sit amet, consectetur...");
        feedfirstLine6.setText("Old Habits");
        feedSecondLine6.setText("The results you did");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }
}
