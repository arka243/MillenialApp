package com.android.millenialapp;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class ResultsActivity extends DrawerActivity {

    private TextView msgfirstLine1;
    private TextView msgSecondLine1;
    private TextView msgThirdLine1;
    private TextView msgfirstLine2;
    private TextView msgSecondLine2;
    private TextView msgThirdLine2;
    private TextView msgfirstLine3;
    private TextView msgSecondLine3;
    private TextView msgThirdLine3;
    private ImageButton copyButton1;
    private ImageButton shareButton1;
    private ImageButton copyButton2;
    private ImageButton shareButton2;
    private ImageButton copyButton3;
    private ImageButton shareButton3;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_results);

        msgfirstLine1 = (TextView) findViewById(R.id.firstLine1);
        msgSecondLine1 = (TextView) findViewById(R.id.secondLine1);
        msgThirdLine1 = (TextView) findViewById(R.id.thirdLine1);
        msgfirstLine2 = (TextView) findViewById(R.id.firstLine2);
        msgSecondLine2 = (TextView) findViewById(R.id.secondLine2);
        msgThirdLine2 = (TextView) findViewById(R.id.thirdLine2);
        msgfirstLine3 = (TextView) findViewById(R.id.firstLine3);
        msgSecondLine3 = (TextView) findViewById(R.id.secondLine3);
        msgThirdLine3 = (TextView) findViewById(R.id.thirdLine3);

        copyButton1 = (ImageButton) findViewById(R.id.copybutton1);
        copyButton2 = (ImageButton) findViewById(R.id.copybutton2);
        copyButton3 = (ImageButton) findViewById(R.id.copybutton3);
        shareButton1 = (ImageButton) findViewById(R.id.sharebutton1);
        shareButton2 = (ImageButton) findViewById(R.id.sharebutton2);
        shareButton3 = (ImageButton) findViewById(R.id.sharebutton3);

        msgfirstLine1.setText("Choosing where to eat");
        msgSecondLine1.setText("Oliver Garden");
        msgThirdLine1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");
        msgfirstLine2.setText("Living on a Student");
        msgSecondLine2.setText("Publix");
        msgThirdLine2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation");
        msgfirstLine3.setText("Eating Healthy");
        msgSecondLine3.setText("Sub-Way");
        msgThirdLine3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor.");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }
}
