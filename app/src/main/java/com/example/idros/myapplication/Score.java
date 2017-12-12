package com.example.idros.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Score extends AppCompatActivity {

    TextView textScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        textScore=(TextView) findViewById(R.id.textView7);
        textScore.setText(String.valueOf(getIntent().getExtras().getInt("Score")));

    }
    public void ClickPlayAgain(View view){
        Intent agian=new Intent(Score.this,Game2.class);
        startActivity(agian);
        finish();
    }
    public void Exit(View view){
        finish();
    }
}
