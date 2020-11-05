package com.nesar_kaunain.importantquestion;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SimpleQuestion extends AppCompatActivity implements View.OnClickListener {

    String[] simple_Qn, simple_ans;   // *declaration of  String_array
    int index;
    TextView viewQuestion, viewAnswer, count_xx, count_yy;  // *declaration of  textViews
    Button nextButton, previousButton;       // *declaration of  buttons


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.simple_question_activity);

        //Initializing of textView
        viewAnswer = findViewById(R.id.answer);
        viewQuestion = findViewById(R.id.question);
        count_xx = findViewById(R.id.xx);
        count_yy = findViewById(R.id.yy);

        //Initializing of buttons
        nextButton = findViewById(R.id.tapNext);
        previousButton = findViewById(R.id.tapPre);


        //  Importing string arrays of qn and ans from values folder
        simple_Qn = getResources().getStringArray(R.array.simple_question);
        simple_ans = getResources().getStringArray(R.array.simple_answer);

        //Setting values for our variables and textViews

        index = 0;
        viewQuestion.setText(simple_Qn[index]);
        viewAnswer.setText("Press Here To See The Answer");
        count_xx.setText(String.valueOf(index + 1));
        count_yy.setText("/" + String.valueOf(simple_Qn.length));


        //   Setting On click Listener on buttons
        nextButton.setOnClickListener(this);
      viewAnswer.setOnClickListener(this);
        previousButton.setOnClickListener(this);

    }

    @Override    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.answer:
                viewAnswer.setText(simple_ans[index]);
                break;
            case R.id.tapNext:
                index++;
                if(index==simple_Qn.length){
                    index=0;
                    viewAnswer.setText("Press Here To See The Answer");
                    viewQuestion.setText(simple_Qn[index]);
                    count_xx.setText(String.valueOf(index + 1));
                }
                else{
                    viewAnswer.setText("Press Here To See The Answer");
                    viewQuestion.setText(simple_Qn[index]);
                    count_xx.setText(String.valueOf(index + 1));
                }
                break;
            case R.id.tapPre:
                index--;
                if(index==-1){
                    index=simple_Qn.length-1;
                    viewAnswer.setText("Press Here To See The Answer");
                    viewQuestion.setText(simple_Qn[index]);
                    count_xx.setText(String.valueOf(index + 1));
                }
                else{
                    viewAnswer.setText("Press Here To See The Answer");
                    viewQuestion.setText(simple_Qn[index]);
                    count_xx.setText(String.valueOf(index + 1));
                }

                break;
        }
    }
}
