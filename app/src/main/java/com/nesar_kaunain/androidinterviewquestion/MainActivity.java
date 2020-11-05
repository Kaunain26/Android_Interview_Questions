package com.nesar_kaunain.importantquestion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button simpleQues, toughQues, otherApp, rateapp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleQues = findViewById(R.id.sq);
        toughQues = findViewById(R.id.tq);
        otherApp = findViewById(R.id.OA);
        rateapp = findViewById(R.id.RA);

        simpleQues.setOnClickListener(this);
        toughQues.setOnClickListener(this);
        otherApp.setOnClickListener(this);
        rateapp.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.sq:

                Intent i = new Intent(MainActivity.this, Overview_simpleQuestion.class);
                startActivity(i);
                break;
            case R.id.tq:
                Intent j = new Intent(MainActivity.this, Overview_toughQuestion.class);
                startActivity(j);
                break;
            case R.id.OA:
                break;
            case R.id.RA:
                break;

        }
    }
}
