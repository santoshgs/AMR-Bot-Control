/*
 * Released under GPL License
 * Copyright (c) 2014 Santosh G.S.
 * Refer to file LICENSE for full text 
 */

package com.siddaganga;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
 
public class SplashScreen extends Activity {
 
    // Splash screen time in msec
    private static int SPLASH_TIME_OUT = 7000;
 
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
 
        new Handler().postDelayed(new Runnable() {
             @Override
            public void run() {
                // Executed once the timer is over. Start main activity.
                Intent i = new Intent(SplashScreen.this, Homescreen.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }
 
}