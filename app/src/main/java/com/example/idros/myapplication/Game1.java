package com.example.idros.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Game1 extends AppCompatActivity {

    ImageView image,next,back;
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,btstart;
    TextView title,description;
    MediaPlayer click1,s1,s2,s3,s4,s5,s6,s7,s8,s9,s10;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game1);

        title=(TextView)findViewById(R.id.textView2);
        description=(TextView)findViewById(R.id.textView1);
        back=(ImageView)findViewById(R.id.imageView7);
        next=(ImageView)findViewById(R.id.imageView8);
        bt1=(Button)findViewById(R.id.button1);
        bt2=(Button)findViewById(R.id.button2);
        bt3=(Button)findViewById(R.id.button3);
        bt4=(Button)findViewById(R.id.button4);
        bt5=(Button)findViewById(R.id.button5);
        bt6=(Button)findViewById(R.id.button6);
        bt7=(Button)findViewById(R.id.button7);
        bt8=(Button)findViewById(R.id.button8);
        bt9=(Button)findViewById(R.id.button9);
        bt10=(Button)findViewById(R.id.button10);
        btstart=(Button)findViewById(R.id.button16);

        image = (ImageView)findViewById(R.id.imageView12);
        click1 = MediaPlayer.create(this,R.raw.click1);
        s1= MediaPlayer.create(this,R.raw.qq1);
        s2= MediaPlayer.create(this,R.raw.qq2);
        s3= MediaPlayer.create(this,R.raw.qq3);
        s4= MediaPlayer.create(this,R.raw.qq4);
        s5= MediaPlayer.create(this,R.raw.qq5);
        s6= MediaPlayer.create(this,R.raw.qq6);
        s7= MediaPlayer.create(this,R.raw.qq7);
        s8= MediaPlayer.create(this,R.raw.qq8);
        s9= MediaPlayer.create(this,R.raw.qq9);
        s10= MediaPlayer.create(this,R.raw.qq10);

        btstart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Game1.this,Game2.class);
                startActivity(intent2);
                click1.start();
                finish();
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(Game1.this,Page2.class);
                startActivity(intent1);
                click1.start();
                finish();
            }
        });

        /*next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2=new Intent(Game1.this,Game2.class);
                startActivity(intent2);
                click1.start();
                finish();
            }
        });*/
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q1);
                title.setText(Game1.this.getString(R.string.im1));
                description.setText(Game1.this.getString(R.string.m1));
                s1.start();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q2);
                title.setText(Game1.this.getString(R.string.im2));
                description.setText(Game1.this.getString(R.string.m2));
                s2.start();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q3);
                title.setText(Game1.this.getString(R.string.im3));
                description.setText(Game1.this.getString(R.string.m3));
                s3.start();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q4);
                title.setText(Game1.this.getString(R.string.im4));
                description.setText(Game1.this.getString(R.string.m4));
                s4.start();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q5);
                title.setText(Game1.this.getString(R.string.im5));
                description.setText(Game1.this.getString(R.string.m5));
                s5.start();

            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q6);
                title.setText(Game1.this.getString(R.string.im6));
                description.setText(Game1.this.getString(R.string.m6));
                s6.start();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q7);
                title.setText(Game1.this.getString(R.string.im7));
                description.setText(Game1.this.getString(R.string.m7));
                s7.start();

            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q8);
                title.setText(Game1.this.getString(R.string.im8));
                description.setText(Game1.this.getString(R.string.m8));
                s8.start();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q9);
                title.setText(Game1.this.getString(R.string.im9));
                description.setText(Game1.this.getString(R.string.m9));
                s9.start();
            }
        });
        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                image.setImageResource(R.drawable.q10);
                title.setText(Game1.this.getString(R.string.im10));
                description.setText(Game1.this.getString(R.string.m10));
                s10.start();
            }
        });
    }
}
