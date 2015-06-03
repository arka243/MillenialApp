package com.android.millenialapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class RewardsActivity extends DrawerActivity {

    private Button showHistory;

    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState, R.layout.activity_rewards);

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
