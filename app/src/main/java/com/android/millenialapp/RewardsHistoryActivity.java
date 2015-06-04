package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class RewardsHistoryActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private ImageButton backButton;
    private TextView priceView1;
    private TextView dateView1;
    private TextView companyView1;
    private TextView actionView1;
    private TextView actionView2;
    private ImageButton sharebtn1;

    private TextView priceView2;
    private TextView dateView2;
    private TextView companyView2;
    private TextView actionView21;
    private TextView actionView22;
    private ImageButton sharebtn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_history);

        toolbar = (Toolbar) findViewById(R.id.back_tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        priceView1 = (TextView) findViewById(R.id.price1);
        dateView1 = (TextView) findViewById(R.id.date1);
        companyView1 = (TextView) findViewById(R.id.company1);
        actionView1 = (TextView) findViewById(R.id.action1);
        actionView2 = (TextView) findViewById(R.id.action2);
        sharebtn1 = (ImageButton) findViewById(R.id.sharebutton1);

        priceView2 = (TextView) findViewById(R.id.price2);
        dateView2 = (TextView) findViewById(R.id.date2);
        companyView2 = (TextView) findViewById(R.id.company2);
        actionView21 = (TextView) findViewById(R.id.action21);
        actionView22 = (TextView) findViewById(R.id.action22);
        sharebtn2 = (ImageButton) findViewById(R.id.sharebutton2);

        priceView1.setText("$10");
        dateView1.setText("Feb 15, 2015");
        companyView1.setText("Amazon");
        actionView1.setText("ACTION 1");
        actionView2.setText("ACTION 2");

        priceView2.setText("$15");
        dateView2.setText("Mar 24, 2015");
        companyView2.setText("Starbucks");
        actionView21.setText("ACTION 1");
        actionView22.setText("ACTION 2");

        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RewardsHistoryActivity.this, RewardsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
