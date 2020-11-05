package com.nesar_kaunain.importantquestion;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class  Overview_simpleQuestion extends  AppCompatActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_qus_overview);


    }

    public void proceedSimple(View v){

        startActivity(new Intent(this,SimpleQuestion.class));
    }

}