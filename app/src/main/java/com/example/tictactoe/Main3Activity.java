package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        final Button lesgo=findViewById(R.id.button3);
        final TextView enternames=findViewById(R.id.textView3);
        final TextView playa1=findViewById(R.id.textView4);
        final TextView playa2=findViewById(R.id.textView5);
        final EditText name1=findViewById(R.id.editText);
        final EditText name2=findViewById(R.id.editText2);
        final ImageView image1=findViewById(R.id.imageView3);
        final ImageView image2=findViewById(R.id.imageView4);



        lesgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                enternames.setVisibility(View.INVISIBLE);
                playa1.setVisibility(View.INVISIBLE);
                playa2.setVisibility(View.INVISIBLE);
                name1.setVisibility(View.INVISIBLE);
                name2.setVisibility(View.INVISIBLE);
                image1.setVisibility(View.INVISIBLE);
                image2.setVisibility(View.INVISIBLE);
                lesgo.setVisibility(View.INVISIBLE);
                String text1=name1.getText().toString();
                String text2=name2.getText().toString();

                Intent intent=new Intent(v.getContext(),gamescreen.class);
                intent.putExtra("mytext",text1);
                intent.putExtra("mytext2",text2);
                startActivity(intent);
            }
        });



    }

}
