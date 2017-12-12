package com.example.idros.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Game2 extends AppCompatActivity {

    ImageView imq;
    RadioGroup radAnswer;
    String strAnswer;
    Button answer;
    MyAlertDialog objMyAlertDialog;
    RadioButton rd1,rd2,rd3,rd4;
    MediaPlayer click;
    Question objQuestion;
    int intTime = 1,userChoose,userScore;
    int userChooseArray[],trueAnswer[];

    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game2);

        click=MediaPlayer.create(this,R.raw.click);
        answer=(Button)findViewById(R.id.button11);
        initialWidget();
        userChooseArray=new int[11];
        trueAnswer=new int[11];
        setValueTrueAnswer();
        rd1=(RadioButton)findViewById(R.id.radioButton1);
        rd2=(RadioButton)findViewById(R.id.radioButton2);
        rd3=(RadioButton)findViewById(R.id.radioButton3);
        rd4=(RadioButton)findViewById(R.id.radioButton4);

        objQuestion=new Question();
        objQuestion.setOnQuestionChangeListener(new Question.onQuestionChangeListener() {
            @Override
            public void onQuestionChangeListener(Question question) {
                switch (question.getIntQuestion()){
                    case 1:
                        imq.setImageResource(R.drawable.q4);
                        rd1.setText(Game2.this.getString(R.string.im10));
                        rd2.setText(Game2.this.getString(R.string.im1));
                        rd3.setText(Game2.this.getString(R.string.im3));
                        rd4.setText(Game2.this.getString(R.string.im4));
                        radAnswer.clearCheck();
                        break;
                    case 2:
                        imq.setImageResource(R.drawable.q10);
                        rd1.setText(Game2.this.getString(R.string.im10));
                        rd2.setText(Game2.this.getString(R.string.im1));
                        rd3.setText(Game2.this.getString(R.string.im3));
                        rd4.setText(Game2.this.getString(R.string.im8));
                        radAnswer.clearCheck();
                        break;
                    case 3:
                        imq.setImageResource(R.drawable.q8);
                        rd1.setText(Game2.this.getString(R.string.im9));
                        rd2.setText(Game2.this.getString(R.string.im8));
                        rd3.setText(Game2.this.getString(R.string.im2));
                        rd4.setText(Game2.this.getString(R.string.im1));
                        radAnswer.clearCheck();
                        break;
                    case 4:
                        imq.setImageResource(R.drawable.q6);
                        rd1.setText(Game2.this.getString(R.string.im10));
                        rd2.setText(Game2.this.getString(R.string.im1));
                        rd3.setText(Game2.this.getString(R.string.im6));
                        rd4.setText(Game2.this.getString(R.string.im7));
                        radAnswer.clearCheck();
                        break;
                    case 5:
                        imq.setImageResource(R.drawable.q3);
                        rd1.setText(Game2.this.getString(R.string.im3));
                        rd2.setText(Game2.this.getString(R.string.im9));
                        rd3.setText(Game2.this.getString(R.string.im6));
                        rd4.setText(Game2.this.getString(R.string.im4));
                        radAnswer.clearCheck();
                        break;
                    case 6:
                        imq.setImageResource(R.drawable.q1);
                        rd1.setText(Game2.this.getString(R.string.im7));
                        rd2.setText(Game2.this.getString(R.string.im10));
                        rd3.setText(Game2.this.getString(R.string.im6));
                        rd4.setText(Game2.this.getString(R.string.im1));
                        radAnswer.clearCheck();
                        break;
                    case 7:
                        imq.setImageResource(R.drawable.q9);
                        rd1.setText(Game2.this.getString(R.string.im8));
                        rd2.setText(Game2.this.getString(R.string.im9));
                        rd3.setText(Game2.this.getString(R.string.im3));
                        rd4.setText(Game2.this.getString(R.string.im5));
                        radAnswer.clearCheck();
                        break;
                    case 8:
                        imq.setImageResource(R.drawable.q5);
                        rd1.setText(Game2.this.getString(R.string.im6));
                        rd2.setText(Game2.this.getString(R.string.im5));
                        rd3.setText(Game2.this.getString(R.string.im4));
                        rd4.setText(Game2.this.getString(R.string.im2));
                        radAnswer.clearCheck();
                        break;
                    case 9:
                        imq.setImageResource(R.drawable.q2);
                        rd1.setText(Game2.this.getString(R.string.im9));
                        rd2.setText(Game2.this.getString(R.string.im1));
                        rd3.setText(Game2.this.getString(R.string.im2));
                        rd4.setText(Game2.this.getString(R.string.im3));
                        radAnswer.clearCheck();
                        break;
                    case 10:
                        imq.setImageResource(R.drawable.q7);
                        rd1.setText(Game2.this.getString(R.string.im1));
                        rd2.setText(Game2.this.getString(R.string.im8));
                        rd3.setText(Game2.this.getString(R.string.im5));
                        rd4.setText(Game2.this.getString(R.string.im7));
                        radAnswer.clearCheck();
                        break;

                }

            }
        });

        radAnswer.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton1:
                        strAnswer="1";
                        userChoose=1;
                        break;
                    case R.id.radioButton2:
                        userChoose=2;
                        strAnswer="1";
                        break;
                    case R.id.radioButton3:
                        userChoose=3;
                        strAnswer="1";
                        break;
                    case R.id.radioButton4:
                        userChoose=4;
                        strAnswer="1";
                        break;
                    default:
                        strAnswer=null;
                        break;
                }
            }
        });
        answer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckChooseAnswer();
            }
        });

    }
    private void initialWidget(){
        imq=(ImageView)findViewById(R.id.imageView9);
        radAnswer=(RadioGroup)findViewById(R.id.radAnswer);
    }
    //--------- when answer button----------//
    private void CheckChooseAnswer(){
        if(strAnswer != null){
            Log.d("Answer","IntTime = "+intTime);
            checkScore();
            intTime++;
        }
        else {
            Log.d("Answer","Please Choose Something");
            objMyAlertDialog = new MyAlertDialog();
            objMyAlertDialog.NoChooseEveryThing(Game2.this,click);
        }
    }
    private void setValueTrueAnswer(){

        trueAnswer[1]=4;
        trueAnswer[2]=1;
        trueAnswer[3]=2;
        trueAnswer[4]=3;
        trueAnswer[5]=1;
        trueAnswer[6]=4;
        trueAnswer[7]=2;
        trueAnswer[8]=2;
        trueAnswer[9]=3;
        trueAnswer[10]=4;


    }
    private void checkScore(){
        userChooseArray[intTime] = userChoose;
        Log.d("ChooseArray","userChooseArray["+String.valueOf(intTime)+"] = "+String.valueOf(userChoose));
        if (userChooseArray[intTime]==trueAnswer[intTime]){
            userScore++;
        }Log.d("Score","userScore  = "+String.valueOf(userScore));
        sentValueToQuestion();
    }
    private void sentValueToQuestion(){

        if(intTime == 10) {

            Intent showScore = new Intent(Game2.this,Score.class);
            showScore.putExtra("Score",userScore);
            startActivity(showScore);
            finish();
        }
        objQuestion.setIntQuestion(intTime+1);
    }
}
