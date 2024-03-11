package com.example.viktorina;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class ResultActivity extends AppCompatActivity {

    MaterialCardView home;
    TextView correctt, wrongt, resultinfo, resultscore;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        home=findViewById(R.id.returnHome);
        correctt=findViewById(R.id.correctScore);
        wrongt=findViewById(R.id.wrongScore);
        resultinfo=findViewById(R.id.resultInfo);
        resultscore=findViewById(R.id.resultScore);

        int correct = getIntent().getIntExtra("correct", 0);
        int wrong = getIntent().getIntExtra("wrong", 0);
        int score = correct*5;

        correctt.setText(""+correct);
        wrongt.setText(""+wrong);
        resultscore.setText(""+score);

        if(correct>=0 && correct<=2){
            resultinfo.setText("You have to take the test again");
        } else if (correct>=3 && correct<=5) {
            resultinfo.setText("You have to try a little more");
        }else if (correct>=6 && correct<=8){
            resultinfo.setText("You are pretty good");
        }else {
            resultinfo.setText("You are very good, CONGRATULATION");
        }

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(ResultActivity.this, MainActivity.class));
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(ResultActivity.this, MainActivity.class));
        finish();
    }
}