package com.android.millenialapp;

import android.content.Context;
import android.content.Intent;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.Toast;


public class DrawerActivity extends ActionBarActivity {

    //First We Declare Titles And Icons For Our Navigation Drawer List View
    //This Icons And Titles Are holded in an Array as you can see

    private static int fromPosition = 0;
    String TITLES[] = {"Assignments","Messages","Forum","Feed","Results","Rewards", "Settings", "Log Out"};
    int ICONS[] = {R.mipmap.ic_menu_assignments_24dp,R.mipmap.ic_menu_messages_24dp,R.mipmap.ic_menu_forum_24dp,R.mipmap.ic_menu_feed_24dp,R.mipmap.ic_menu_results_24dp,R.mipmap.ic_menu_rewards_24dp,R.mipmap.ic_menu_settings_24dp,R.mipmap.ic_menu_logout_24dp};

    //Similarly we Create a String Resource for the name and email in the header view
    //And we also create a int resource for profile picture in the header view
//    String NAME, EMAIL;
    String NAME = "Carolina Leigh";
    String EMAIL = "Rewards: $10";
    int PROFILE = R.mipmap.ic_person_24dp;

    private Toolbar toolbar;                              // Declaring the Toolbar Object

    RecyclerView mRecyclerView;                           // Declaring RecyclerView
    RecyclerView.Adapter mAdapter;                        // Declaring Adapter For Recycler View
    RecyclerView.LayoutManager mLayoutManager;            // Declaring Layout Manager as a linear layout manager
    public DrawerLayout Drawer;                                  // Declaring DrawerLayout

    ActionBarDrawerToggle mDrawerToggle;                  // Declaring Action Bar Drawer Toggle


    protected void onCreate(Bundle savedInstanceState, int resLayoutID) {
        super.onCreate(savedInstanceState);
        setContentView(resLayoutID);

        toolbar = (Toolbar) findViewById(R.id.tool_bar);
        setSupportActionBar(toolbar);

        mRecyclerView = (RecyclerView) findViewById(R.id.RecyclerView); // Assigning the RecyclerView Object to the xml View

        mRecyclerView.setHasFixedSize(true);                            // Letting the system know that the list objects are of fixed size

        mAdapter = new CustomAdapter(TITLES,ICONS,NAME,EMAIL,PROFILE);       // Creating the Adapter of MyAdapter class(which we are going to see in a bit)
        // And passing the titles,icons,header view name, header view email,
        // and header view profile picture

        mRecyclerView.setAdapter(mAdapter);                              // Setting the adapter to RecyclerView

        final GestureDetector mGestureDetector = new GestureDetector(DrawerActivity.this, new GestureDetector.SimpleOnGestureListener() {

            @Override public boolean onSingleTapUp(MotionEvent e) {
                return true;
            }

        });


        mRecyclerView.addOnItemTouchListener(new RecyclerView.OnItemTouchListener() {
            @Override
            public boolean onInterceptTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {
                View child = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());


                if (child != null && mGestureDetector.onTouchEvent(motionEvent)) {
                    Drawer.closeDrawers();
                    if(recyclerView.getChildPosition(child)==0)
                    {
                        if (fromPosition == 0)
                        {}
                        else {
                            fromPosition=0;
                            Intent i = new Intent(DrawerActivity.this, ProfileActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==1)
                    {
                        if (fromPosition == 1)
                        {}
                        else {
                            fromPosition=1;
                            Intent i = new Intent(DrawerActivity.this, AssignmentsActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==2)
                    {
                        if (fromPosition == 2)
                        {}
                        else {
                            fromPosition=2;
                            Intent i = new Intent(DrawerActivity.this, MessagesActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==3)
                    {
                        if (fromPosition == 3)
                        {}
                        else {
                            fromPosition=3;
                            Intent i = new Intent(DrawerActivity.this, ForumActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==4)
                    {
                        if (fromPosition == 4)
                        {}
                        else {
                            fromPosition=4;
                            Intent i = new Intent(DrawerActivity.this, FeedsActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==5)
                    {
                        if (fromPosition == 5)
                        {}
                        else {
                            fromPosition=5;
                            Intent i = new Intent(DrawerActivity.this, ResultsActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==6)
                    {
                        if (fromPosition == 6)
                        {}
                        else {
                            fromPosition=6;
                            Intent i = new Intent(DrawerActivity.this, RewardsActivity.class);
                            startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==7)
                    {
                        if (fromPosition == 7)
                        {}
                        else {
                            fromPosition=7;
                        Intent i = new Intent(DrawerActivity.this, UserSettingActivity.class);
                        startActivity(i);}
                    }
                    if(recyclerView.getChildPosition(child)==8)
                    {
                        if (fromPosition == 8)
                        {}
                        else {
                            fromPosition=8;
                            Intent i = new Intent(DrawerActivity.this, LoginActivity.class);
                            startActivity(i);}
                    }

                    return true;

                }

                return false;
            }

            @Override
            public void onTouchEvent(RecyclerView recyclerView, MotionEvent motionEvent) {

            }
        });

        mLayoutManager = new LinearLayoutManager(this);                 // Creating a layout Manager

        mRecyclerView.setLayoutManager(mLayoutManager);                 // Setting the layout Manager


        Drawer = (DrawerLayout) findViewById(R.id.DrawerLayout);        // Drawer object Assigned to the view

        mDrawerToggle = new ActionBarDrawerToggle(this,Drawer,toolbar,R.string.openDrawer,R.string.closeDrawer){


            @Override
            public void onDrawerOpened(View drawerView) {
                super.onDrawerOpened(drawerView);
                // code here will execute once the drawer is opened( As I dont want anything happened whe drawer is
                // open I am not going to put anything here)
            }

            @Override
            public void onDrawerClosed(View drawerView) {
                super.onDrawerClosed(drawerView);
                // Code here will execute once drawer is closed
            }



        }; // Drawer Toggle Object Made
        Drawer.setDrawerListener(mDrawerToggle); // Drawer Listener set to the Drawer toggle
        mDrawerToggle.syncState();

    }
}