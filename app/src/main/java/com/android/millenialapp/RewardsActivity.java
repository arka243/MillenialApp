package com.android.millenialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class RewardsActivity extends DrawerActivity {

    private Button showHistory;
    private EditText companyTitle;
    private EditText rewardAmount;
    private TextView rewardTitle;
    private TextView rewardSubtitle;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_rewards);

        companyTitle = (EditText) findViewById(R.id.companyname);
        rewardAmount = (EditText) findViewById(R.id.reward);
        rewardTitle = (TextView) findViewById(R.id.reward_title);
        rewardSubtitle = (TextView) findViewById(R.id.reward_subtitle);

        companyTitle.setText("Amazon");
        rewardAmount.setText("$10");
        rewardTitle.setText("Title Goes Here");
        rewardSubtitle.setText("Subtitle here");

        showHistory = (Button) findViewById(R.id.showhistory);
        showHistory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RewardsActivity.this, RewardsHistoryActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
