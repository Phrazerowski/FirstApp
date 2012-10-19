package com.firstapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        // Get the message from the intent
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        String herb = new String("Herb ist doof!");
        
        // Create the text View
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(herb);
        
        // Set the text view as the activity layout
        setContentView(textView);
    }
}
