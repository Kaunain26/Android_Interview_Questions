package com.nesar_kaunain.importantquestion;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import androidx.appcompat.app.AppCompatActivity;

public class Overview_toughQuestion extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tough_qus_overview);


    }

  public void proceedTough(View v){
      startActivity(new Intent(this,Tough_Question.class));
  }
}
