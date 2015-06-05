package com.android.millenialapp;

import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class MessagesActivity extends DrawerActivity {

    private TextView msgfirstLine1;
    private TextView msgSecondLine1;
    private TextView msgThirdLine1;
    private TextView msgfirstLine2;
    private TextView msgSecondLine2;
    private TextView msgThirdLine2;
    private TextView msgfirstLine3;
    private TextView msgSecondLine3;
    private TextView msgThirdLine3;
    private TextView msgfirstLine4;
    private TextView msgSecondLine4;
    private TextView msgThirdLine4;
    private TextView msgfirstLine5;
    private TextView msgSecondLine5;
    private TextView msgThirdLine5;
    private TextView msgfirstLine6;
    private TextView msgSecondLine6;
    private TextView msgThirdLine6;

    private ImageButton newMsg;

    String[] msgSender = {"Moderator", "Community Manager", "Moderator", "Caroline Leigh", "Moderator", "Truman Warrick"};
    String[] msgTitle = {"Question About", "Problem", "Quiz question #4 is", "We'd", "You have 2 hours", "Public questions"};
    String msgBody = "Loren ipsum dolor sit amet, consectetur...";

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_messages);

        msgfirstLine1 = (TextView) findViewById(R.id.firstLine1);
        msgSecondLine1 = (TextView) findViewById(R.id.secondLine1);
        msgThirdLine1 = (TextView) findViewById(R.id.thirdLine1);
        msgfirstLine2 = (TextView) findViewById(R.id.firstLine2);
        msgSecondLine2 = (TextView) findViewById(R.id.secondLine2);
        msgThirdLine2 = (TextView) findViewById(R.id.thirdLine2);
        msgfirstLine3 = (TextView) findViewById(R.id.firstLine3);
        msgSecondLine3 = (TextView) findViewById(R.id.secondLine3);
        msgThirdLine3 = (TextView) findViewById(R.id.thirdLine3);
        msgfirstLine4 = (TextView) findViewById(R.id.firstLine4);
        msgSecondLine4 = (TextView) findViewById(R.id.secondLine4);
        msgThirdLine4 = (TextView) findViewById(R.id.thirdLine4);
        msgfirstLine5 = (TextView) findViewById(R.id.firstLine5);
        msgSecondLine5 = (TextView) findViewById(R.id.secondLine5);
        msgThirdLine5 = (TextView) findViewById(R.id.thirdLine5);
        msgfirstLine6 = (TextView) findViewById(R.id.firstLine6);
        msgSecondLine6 = (TextView) findViewById(R.id.secondLine6);
        msgThirdLine6 = (TextView) findViewById(R.id.thirdLine6);

        newMsg = (ImageButton) findViewById(R.id.newmessage);

        msgfirstLine1.setText(msgSender[0]);
        msgSecondLine1.setText(msgTitle[0]);
        msgThirdLine1.setText(msgBody);
        msgfirstLine2.setText(msgSender[1]);
        msgSecondLine2.setText(msgTitle[1]);
        msgThirdLine2.setText(msgBody);
        msgfirstLine3.setText(msgSender[2]);
        msgSecondLine3.setText(msgTitle[2]);
        msgThirdLine3.setText(msgBody);
        msgfirstLine4.setText(msgSender[3]);
        msgSecondLine4.setText(msgTitle[3]);
        msgThirdLine4.setText(msgBody);
        msgfirstLine5.setText(msgSender[4]);
        msgSecondLine5.setText(msgTitle[4]);
        msgThirdLine5.setText(msgBody);
        msgfirstLine6.setText(msgSender[5]);
        msgSecondLine6.setText(msgTitle[5]);
        msgThirdLine6.setText(msgBody);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }
}
