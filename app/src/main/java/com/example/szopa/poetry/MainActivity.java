package com.example.szopa.poetry;

import android.widget.Button;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.content.Intent;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    public static int words = 1;
    private TextView wordsAmountTextView;
    public void goToDisplayPoem (View view)
    {
        Intent intent = new Intent(this, DisplayPoem.class);
        startActivity(intent);
    }
    //This code activates the About button

    public void onButtonClick (View v)
    {
        if(v.getId() == R.id.button) {

            Intent intent =new Intent(MainActivity.this, About.class);
            startActivity(intent);
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wordsAmountTextView = (TextView) findViewById(R.id.wordsAmountTextView);

        // set SeekBars' OnSeekBarChangeListener
        SeekBar wordsSeekBar =
                (SeekBar) findViewById(R.id.wordsSeekBar);
        wordsSeekBar.setOnSeekBarChangeListener(seekBarListener);
    }

    // listener object for the SeekBar's progress changed events
    private final OnSeekBarChangeListener seekBarListener =
            new OnSeekBarChangeListener()
            {

                @Override
                public void onProgressChanged(SeekBar seekBar, int progress,
                                              boolean fromUser) {
                    words = progress;
                    String displayWords = "" + words;
                    wordsAmountTextView.setText(displayWords);
                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {
                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {
                }

            };



}