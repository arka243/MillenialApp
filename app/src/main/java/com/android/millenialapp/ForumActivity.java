package com.android.millenialapp;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class ForumActivity extends DrawerActivity {

    private TextView forumfirstLine1;
    private TextView forumSecondLine1;
    private TextView forumfirstLine2;
    private TextView forumSecondLine2;
    private TextView forumfirstLine3;
    private TextView forumSecondLine3;
    private ImageButton copyButton1;
    private ImageButton shareButton1;
    private ImageButton replyButton1;
    private ImageButton allmsgButton1;
    private ImageButton copyButton2;
    private ImageButton shareButton2;
    private ImageButton replyButton2;
    private ImageButton allmsgButton2;
    private ImageButton copyButton3;
    private ImageButton shareButton3;
    private ImageButton replyButton3;
    private ImageButton allmsgButton3;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_forum);

        forumfirstLine1 = (TextView) findViewById(R.id.firstLine1);
        forumSecondLine1 = (TextView) findViewById(R.id.secondLine1);
        forumfirstLine2 = (TextView) findViewById(R.id.firstLine2);
        forumSecondLine2 = (TextView) findViewById(R.id.secondLine2);
        forumfirstLine3 = (TextView) findViewById(R.id.firstLine3);
        forumSecondLine3 = (TextView) findViewById(R.id.secondLine3);

        copyButton1 = (ImageButton) findViewById(R.id.copybutton1);
        copyButton2 = (ImageButton) findViewById(R.id.copybutton2);
        copyButton3 = (ImageButton) findViewById(R.id.copybutton3);
        shareButton1 = (ImageButton) findViewById(R.id.sharebutton1);
        shareButton2 = (ImageButton) findViewById(R.id.sharebutton2);
        shareButton3 = (ImageButton) findViewById(R.id.sharebutton3);
        replyButton1 = (ImageButton) findViewById(R.id.replybutton1);
        replyButton2 = (ImageButton) findViewById(R.id.replybutton2);
        replyButton3 = (ImageButton) findViewById(R.id.replybutton3);
        allmsgButton1 = (ImageButton) findViewById(R.id.allmsgbutton1);
        allmsgButton2 = (ImageButton) findViewById(R.id.allmsgbutton2);
        allmsgButton3 = (ImageButton) findViewById(R.id.allmsgbutton3);

        forumfirstLine1.setText("Buying Clothes");
        forumSecondLine1.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud.");
        forumfirstLine2.setText("Grocery Shopping");
        forumSecondLine2.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut allquip ex ea commodo consequat.");
        forumfirstLine3.setText("Favorite Sport");
        forumSecondLine3.setText("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }
}
