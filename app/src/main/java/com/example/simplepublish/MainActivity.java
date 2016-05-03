package com.example.simplepublish;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG, "onCreate: " + BuildConfig.APPLICATION_ID);
        Log.d(TAG, "onCreate: " + BuildConfig.FLAVOR);
        Log.d(TAG, "onCreate: " + BuildConfig.TITLE_FLAVOR);
        Log.d(TAG, "onCreate: " + getString(R.string.string_flavor));

    }
}
