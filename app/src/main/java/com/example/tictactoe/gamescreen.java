package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
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
        final TextView text1=findViewById(R.id.textView6);

        final TextView text2=findViewById(R.id.textView7);
        text1.setText(getIntent().getStringExtra("mytext"));
        text2.setText(getIntent().getStringExtra("mytext2"));







        //Button btn;
        //btn=findViewById(R.id.button5);

        //btn.setOnClickListener(new View.OnClickListener() {
          //  @Override
            //public void onClick(View v) {
              //  Intent intent=new Intent(v.getContext(),recycler.class);
                //intent.putExtra("name1",text1.getText());
                //intent.putExtra("name2",text2.getText());
                //startActivity(intent);
            //}
        //});





        Toast.makeText(getApplicationContext(),"Start Game",4000).show();


    }
}
