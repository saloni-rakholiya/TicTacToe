package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ImageView bg=findViewById(R.id.imageView);
        Animation anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        TextView t=findViewById(R.id.textView);
        Animation ani=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim2);

        bg.startAnimation(anim);
        t.startAnimation(ani);
        Thread timer=new Thread()
        {
            @Override
            public void run() {
                try {
                    sleep(5000);
                    Intent intent=new Intent(getApplicationContext(),Main2Activity.class);
                    startActivity(intent);
                    finish();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }
        };
        timer.start();





    }


}
