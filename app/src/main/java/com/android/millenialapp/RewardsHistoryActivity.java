package com.android.millenialapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Arkaprava on 5/31/2015.
 */
public class RewardsHistoryActivity extends ActionBarActivity {

    private Toolbar toolbar;
    private ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_history);

        toolbar = (Toolbar) findViewById(R.id.back_tool_bar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

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
