package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class gamescreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamescreen);
        final customview custom=new customview(this);
        TextView text1=findViewById(R.id.textView6);
        TextView text2=findViewById(R.id.textView7);
        text1.setText(getIntent().getStringExtra("mytext"));
        text2.setText(getIntent().getStringExtra("mytext2"));






        Toast.makeText(getApplicationContext(),"Start Game",4000).show();


    }
}
