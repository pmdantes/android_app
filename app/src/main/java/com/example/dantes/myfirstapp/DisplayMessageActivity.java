package com.example.dantes.myfirstapp;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        // Uses content_display_message.xml layout for new page
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_display_message);

        // Gets intent from the assigned intent from what was calling this class
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Displays in TextView object in this context
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        // Creates RelativeLayout view from content_display_message.xml
        RelativeLayout layout = (RelativeLayout) findViewById(R.id.content);
        layout.addView(textView);

//        Log.d(getLocalClassName(), "onCreate");
    }
}
