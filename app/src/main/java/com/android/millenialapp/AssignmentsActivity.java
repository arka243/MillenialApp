package com.android.millenialapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.GestureDetector;
import android.view.Menu;
import android.view.MotionEvent;
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

    private GestureDetector gestureDetector;

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

        gestureDetector = new GestureDetector(
                new SwipeGestureDetector());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.drawer, menu);
        return true;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (gestureDetector.onTouchEvent(event)) {
            return true;
        }
        return super.onTouchEvent(event);
    }

    private void onLeftSwipe() {
        // Do something
        Intent i = new Intent(this, MessagesActivity.class);
        startActivity(i);
    }

    private void onRightSwipe() {
        // Do something
        Intent i = new Intent(this, MessagesActivity.class);
        startActivity(i);
    }

    // Private class for gestures
    private class SwipeGestureDetector
            extends GestureDetector.SimpleOnGestureListener {
        // Swipe properties, you can change it to make the swipe
        // longer or shorter and speed
        private static final int SWIPE_MIN_DISTANCE = 120;
        private static final int SWIPE_MAX_OFF_PATH = 200;
        private static final int SWIPE_THRESHOLD_VELOCITY = 200;

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2,
                               float velocityX, float velocityY) {
            try {
                float diffAbs = Math.abs(e1.getY() - e2.getY());
                float diff = e1.getX() - e2.getX();

                if (diffAbs > SWIPE_MAX_OFF_PATH)
                    return false;

                // Left swipe
                if (diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    AssignmentsActivity.this.onLeftSwipe();

                    // Right swipe
                } else if (-diff > SWIPE_MIN_DISTANCE
                        && Math.abs(velocityX) > SWIPE_THRESHOLD_VELOCITY) {
                    AssignmentsActivity.this.onRightSwipe();
                }
            } catch (Exception e) {
                Log.e("YourActivity", "Error on gestures");
            }
            return false;
        }
    }
}
