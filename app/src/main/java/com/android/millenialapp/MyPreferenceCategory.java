package com.android.millenialapp;

import android.content.Context;
import android.preference.PreferenceCategory;
import android.util.AttributeSet;

/**
 * Created by PRITI on 5/21/15.
 */
public class MyPreferenceCategory extends PreferenceCategory {

    public MyPreferenceCategory(Context context) {
        super(context);
        setLayoutResource(R.layout.activity_settings);
    }

    public MyPreferenceCategory(Context context, AttributeSet attrs) {
        super(context, attrs);
        setLayoutResource(R.layout.activity_settings);
    }
}
