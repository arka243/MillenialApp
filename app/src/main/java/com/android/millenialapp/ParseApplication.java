package com.android.millenialapp;

import android.app.Application;

import com.parse.ParseACL;
import com.parse.ParseUser;
import com.parse.Parse;

/**
 * Created by Arkaprava on 5/19/2015.
 */
public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.enableLocalDatastore(this);
        Parse.initialize(this, "T4CuTr6uiDIMQMiAtxjJ85icYmdZc0DWhV4COcbv", "oP0Kln1J9ewnCaVgXpdyf3rnxCKWajRZExpJiuCQ");

        ParseUser.enableAutomaticUser();
        ParseACL defaultACL = new ParseACL();

        defaultACL.setPublicReadAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
