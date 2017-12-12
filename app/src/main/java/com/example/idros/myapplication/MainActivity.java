package com.example.idros.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView login;
    EditText username,password;
    MediaPlayer click1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText2);
        click1 = MediaPlayer.create(this,R.raw.click1);


        login = (ImageView)findViewById(R.id.imageView3);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,Page2.class);
                intent.putExtra("username",username.getText().toString());
                intent.putExtra("passwd",password.getText().toString());
                click1.start();
                startActivity(intent);
            }
        });
    }
}
