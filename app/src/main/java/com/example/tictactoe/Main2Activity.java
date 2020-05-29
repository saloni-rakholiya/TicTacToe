package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button player1;
        Button player2;
        player2=findViewById(R.id.button);
        player1=findViewById(R.id.button2);

        player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openactivity2();
            }
        });
        player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openact4();
            }
        });


      }

    public void openact4()
    {Intent intent=new Intent(this,Main4Activity.class);
    startActivity(intent);}
    public void openactivity2()
    { Intent intent=new Intent(this,Main3Activity.class);
        startActivity(intent);

    }
}
