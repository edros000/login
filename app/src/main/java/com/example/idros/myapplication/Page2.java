package com.example.idros.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Page2 extends AppCompatActivity {

    ImageView btback2,btnext2,exchange;
    TextView name1,passwd1;
    MediaPlayer click1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        name1 = (TextView)findViewById(R.id.textView3);
        passwd1=(TextView)findViewById(R.id.textView4);
        click1 = MediaPlayer.create(this,R.raw.click1);
        btback2 = (ImageView)findViewById(R.id.imageView2);
        btnext2 = (ImageView)findViewById(R.id.imageView8);
        exchange=(ImageView)findViewById(R.id.imageView11);

        btback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Page2.this,MainActivity.class);
                startActivity(intent1);
                click1.start();
                finish();
            }
        });

        btnext2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Page2.this,Game1.class);
                startActivity(intent2);
                click1.start();
                finish();
            }
        });

        exchange.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Page2.this,ExchangeMoney.class);
                startActivity(intent2);
                click1.start();
                finish();
            }
        });

        name1.setText(getIntent().getStringExtra("username"));
        passwd1.setText(getIntent().getStringExtra("passwd"));

        Toast.makeText(this,"complete",Toast.LENGTH_SHORT).show();
    }
}
