package com.ekosp.androlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokePresenter extends AppCompatActivity {

    public static String JOKES_EXTRA = "JOKES_EXTRA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_presenter);

        TextView textview = (TextView) findViewById(R.id.joke_text);

        //Retrieve the joke from the Intent Extras
        String JokeResult = null;
        //the Intent that started us
        Intent intent = getIntent();
        if (intent.hasExtra(JOKES_EXTRA)) {
            JokeResult = intent.getStringExtra(JOKES_EXTRA);
        }

        if (JokeResult != null) {
            textview.setText(JokeResult);
        } else {
            textview.setText("Jokes Result null?, where is my jokes?!");
        }
    }
}
