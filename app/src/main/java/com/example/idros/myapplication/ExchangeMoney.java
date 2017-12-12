package com.example.idros.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class ExchangeMoney extends AppCompatActivity {

        EditText edtMoney;
        RadioGroup ragMoney;
        Button btnExchenge;
        String strMoney,strUnit="USD",strAnser;
        double douFactor=0.030,douAnswer;
        MyAlertDialog objMyAlertDialog;
        MediaPlayer click;
        ImageView bt1,bt2;

    private void calculateAnswer(){
        douAnswer=Double.parseDouble(strMoney)*douFactor;
        strAnser=Double.toString(douAnswer);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exchange_money);

        click=MediaPlayer.create(this,R.raw.click);
        edtMoney=(EditText)findViewById(R.id.editText);
        btnExchenge=(Button)findViewById(R.id.button);
        ragMoney=(RadioGroup)findViewById(R.id.radioGroup);
        bt1=(ImageView)findViewById(R.id.imageView7);
        bt2=(ImageView)findViewById(R.id.imageView8);

        ragMoney.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.radioButton1:
                        strUnit = "USD";
                        douFactor = 0.030;
                        break;
                    case R.id.radioButton2:
                        strUnit = "GBP";
                        douFactor = 0.022;
                        break;
                    case R.id.radioButton3:
                        strUnit = "YEN";
                        douFactor = 3.440;
                        break;
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(ExchangeMoney.this,Page2.class);
                startActivity(intent1);
                click.start();
                finish();
            }
        });

        /* bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(ExchangeMoney.this,MainActivity.class);
                startActivity(intent2);
                click.start();
                finish();
            }
        });*/

        btnExchenge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click.start();
                try {
                    strMoney = edtMoney.getText().toString().trim();
                    if (strMoney.equals("")) {
                        objMyAlertDialog = new MyAlertDialog();
                        objMyAlertDialog.HavespaceDialog(ExchangeMoney.this,click);
                    }
                    else {

                        calculateAnswer();

                        Log.d("your money","your money is " + strMoney);
                        Log.d("unit","unit = "+strUnit);
                        Log.d("Answer","answer is " + strAnser);
                        objMyAlertDialog = new MyAlertDialog();
                        objMyAlertDialog.ShowAnswer(ExchangeMoney.this,strMoney,strAnser,strUnit,click);
                    }
                }catch (Exception e){}
            }
        });
    }
}
