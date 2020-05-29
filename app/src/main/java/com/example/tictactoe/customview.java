package com.example.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Vector;

public class customview extends View {







    private Paint black;
    private Paint text;
    private Paint white;
    private Paint red;
    private  Paint blue;
    float cx;
    int rounds=0;
    float cy;
    float x;
    float y;
    float a;

    float b;
    static int score1;
    static int score2;
    float c;
    float d;

    Vector v=new Vector();
    int[] whichsymbol={0,0,0,0,0,0,0,0,0};


    public customview(Context context) {
        super(context);

        init(null);

    }


    public customview(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);

    }

    public customview(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public customview(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set)
    {   red=new Paint();
        blue=new Paint();
        red.setColor(Color.RED);
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.STROKE);
        blue.setStrokeWidth(30);
        black=new Paint();
        black.setColor(Color.BLACK);
         white=new Paint();
        white.setColor(Color.WHITE);
        white.setStrokeWidth(40);
        text=new Paint();
        text.setColor(Color.WHITE);
        text.setTextSize(150);
        text.setStrokeWidth(30);
        text.setTextAlign(Paint.Align.CENTER);
    }



    @Override
    protected void onDraw(Canvas canvas)
    {
        cx=canvas.getWidth();
        cy=canvas.getHeight();
        a=(2*cx/5);
        b=3*cx/5;
        c=5*cy/12;
        d=7*cy/12;


        //canvas.drawColor(Color.parseColor("#8BC34A"));

     canvas.drawRect(a-15,cy/4,a+15,3*cy/4,black);
     canvas.drawRect(b-15,cy/4,b+15,3*cy/4,black);
     canvas.drawRect((cx/5),c-15,(4*cx/5),c+15,black);
     canvas.drawRect((cx/5),d-15,(4*cx/5),d+15,black);


     score1=0;
     score2=0;


     // o for all
     if(v.contains(0) && (int)(whichsymbol[0]%2)==1)
     canvas.drawCircle((3*cx/10),cy/3,(cx/10)-20,blue);
     if(v.contains(3)&& (int)(whichsymbol[3]%2)==1)
     canvas.drawCircle((3*cx/10),cy/2,(cx/10)-20,blue);
     if(v.contains(6)&& (int)(whichsymbol[6]%2)==1)
     canvas.drawCircle((3*cx/10),2*cy/3,(cx/10)-20,blue);
     if(v.contains(1)&& (int)(whichsymbol[1]%2)==1)
     canvas.drawCircle((cx/2),cy/3,(cx/10)-20,blue);
     if(v.contains(4)&& (int)(whichsymbol[4]%2)==1)
     canvas.drawCircle((cx/2),cy/2,(cx/10)-20,blue);
     if(v.contains(7)&& (int)(whichsymbol[7]%2)==1)
     canvas.drawCircle((cx/2),2*cy/3,(cx/10)-20,blue);
     if(v.contains(2)&& (int)(whichsymbol[2]%2)==1)
     canvas.drawCircle((7*cx/10),cy/3,(cx/10)-20,blue);
     if(v.contains(5)&& (int)(whichsymbol[5]%2)==1)
     canvas.drawCircle((7*cx/10),cy/2,(cx/10)-20,blue);
     if(v.contains(8)&& (int)(whichsymbol[8]%2)==1)
     canvas.drawCircle((7*cx/10),2*cy/3,(cx/10)-20,blue);

     // X for all

        red.setStrokeWidth(50);
        if(v.contains(0)&& (int)(whichsymbol[0]%2)==0)
        {canvas.drawLine((cx/5)+35,(cy/4)+35,(2*cx/5)-35,(5*cy/12)-35,red);
        canvas.drawLine((cx/5)+35,(5*cy/12)-35,(2*cx/5)-35,(cy/4)+35,red);}
        if(v.contains(1)&& (int)(whichsymbol[1]%2)==0)
        {canvas.drawLine((2*cx/5)+35,(cy/4)+35,(3*cx/5)-35,(5*cy/12)-35,red);
        canvas.drawLine((2*cx/5)+35,(5*cy/12)-35,(3*cx/5)-35,(cy/4)+35,red);}
        if(v.contains(2)&& (int)(whichsymbol[2]%2)==0)
       { canvas.drawLine((3*cx/5)+35,(cy/4)+35,(4*cx/5)-35,(5*cy/12)-35,red);
        canvas.drawLine((3*cx/5)+35,(5*cy/12)-35,(4*cx/5)-35,(cy/4)+35,red);}

        if(v.contains(3)&& (int)(whichsymbol[3]%2)==0)
        {canvas.drawLine((cx/5)+35,(5*cy/12)+35,(2*cx/5)-35,(7*cy/12)-35,red);
        canvas.drawLine((cx/5)+35,(7*cy/12)-35,(2*cx/5)-35,(5*cy/12)+35,red);}
        if(v.contains(4)&& (int)(whichsymbol[4]%2)==0)
        {canvas.drawLine((2*cx/5)+35,(5*cy/12)+35,(3*cx/5)-35,(7*cy/12)-35,red);
        canvas.drawLine((2*cx/5)+35,(7*cy/12)-35,(3*cx/5)-35,(5*cy/12)+35,red);}
        if(v.contains(5)&& (int)(whichsymbol[5]%2)==0)
        {canvas.drawLine((3*cx/5)+35,(5*cy/12)+35,(4*cx/5)-35,(7*cy/12)-35,red);
        canvas.drawLine((3*cx/5)+35,(7*cy/12)-35,(4*cx/5)-35,(5*cy/12)+35,red);}

        if(v.contains(6)&& (int)(whichsymbol[6]%2)==0)
        {canvas.drawLine((cx/5)+35,(7*cy/12)+35,(2*cx/5)-35,(3*cy/4)-35,red);
        canvas.drawLine((cx/5)+35,(3*cy/4)-35,(2*cx/5)-35,(7*cy/12)+35,red);}
        if(v.contains(7)&& (int)(whichsymbol[7]%2)==0)
       { canvas.drawLine((2*cx/5)+35,(7*cy/12)+35,(3*cx/5)-35,(3*cy/4)-35,red);
        canvas.drawLine((2*cx/5)+35,(3*cy/4)-35,(3*cx/5)-35,(7*cy/12)+35,red);}
        if(v.contains(8)&& (int)(whichsymbol[8]%2)==0)
        {canvas.drawLine((3*cx/5)+35,(7*cy/12)+35,(4*cx/5)-35,(3*cy/4)-35,red);
        canvas.drawLine((3*cx/5)+35,(3*cy/4)-35,(4*cx/5)-35,(7*cy/12)+35,red);}

        //scoring
        if(v.contains(0)&& v.contains(4) && v.contains(8) && whichsymbol[0]%2==0 &&whichsymbol[4]%2==0 && whichsymbol[8]%2==0)
            {canvas.drawLine(cx/5,cy/4,4*cx/5,3*cy/4,white);
            rounds=9;score2=10; score1=0; }
        if(v.contains(2)&& v.contains(4) && v.contains(6)&& whichsymbol[2]%2==0 &&whichsymbol[4]%2==0 && whichsymbol[6]%2==0)
            {canvas.drawLine(cx/5,3*cy/4,4*cx/5,cy/4,white);
            rounds=9;score2=10; score1=0; }
        if(v.contains(0)&& v.contains(3) && v.contains(6)&& whichsymbol[0]%2==0 &&whichsymbol[3]%2==0 && whichsymbol[6]%2==0)
            {canvas.drawLine(3*cx/10,cy/4,3*cx/10,3*cy/4,white);
        rounds=9;score2=10; score1=0; }
        if(v.contains(1)&& v.contains(4) && v.contains(7)&& whichsymbol[1]%2==0 &&whichsymbol[4]%2==0 && whichsymbol[7]%2==0)
            {canvas.drawLine(cx/2,cy/4,cx/2,3*cy/4,white);
        rounds=9;score2=10; score1=0; }
        if(v.contains(2)&& v.contains(5) && v.contains(8)&& whichsymbol[2]%2==0 &&whichsymbol[5]%2==0 && whichsymbol[8]%2==0)
           { rounds=9;score2=10; score1=0;
               canvas.drawLine(7*cx/10,cy/4,7*cx/10,3*cy/4,white);}
        if(v.contains(0)&& v.contains(1) && v.contains(2)&& whichsymbol[0]%2==0 &&whichsymbol[1]%2==0 && whichsymbol[2]%2==0)
            {rounds=9;score2=10; score1=0;
                canvas.drawLine(cx/5,cy/3,4*cx/5,cy/3,white);}
        if(v.contains(3)&& v.contains(4) && v.contains(5)&& whichsymbol[3]%2==0 &&whichsymbol[4]%2==0 && whichsymbol[5]%2==0)
            {rounds=9;
                score2=10; score1=0;
                canvas.drawLine(cx/5,cy/2,4*cx/5,cy/2,white);}
        if(v.contains(6)&& v.contains(7) && v.contains(8)&& whichsymbol[6]%2==0 &&whichsymbol[7]%2==0 && whichsymbol[8]%2==0)
            {rounds=9;score2=10; score1=0;
                canvas.drawLine(cx/5,2*cy/3,4*cx/5,2*cy/3,white);}
//set2
        if(v.contains(0)&& v.contains(4) && v.contains(8)&& whichsymbol[0]%2==1 &&whichsymbol[4]%2==1 && whichsymbol[8]%2==1)
            {rounds=9;
            score1=5;score2=0;
            canvas.drawLine(cx/5,cy/4,4*cx/5,3*cy/4,white);}
        if(v.contains(2)&& v.contains(4) && v.contains(6)&& whichsymbol[2]%2==1 &&whichsymbol[4]%2==1 && whichsymbol[6]%2==1)
            {rounds=9;
                score1=5;score2=0;
            canvas.drawLine(cx/5,3*cy/4,4*cx/5,cy/4,white);}
        if(v.contains(0)&& v.contains(3) && v.contains(6)&& whichsymbol[0]%2==1 &&whichsymbol[3]%2==1 && whichsymbol[6]%2==1)
            {rounds=9;score1=5;score2=0;
            canvas.drawLine(3*cx/10,cy/4,3*cx/10,3*cy/4,white);}
        if(v.contains(1)&& v.contains(4) && v.contains(7)&& whichsymbol[1]%2==1 &&whichsymbol[4]%2==1 && whichsymbol[7]%2==1)
            {rounds=9;score1=5;score2=0;
        canvas.drawLine(cx/2,cy/4,cx/2,3*cy/4,white);}
        if(v.contains(2)&& v.contains(5) && v.contains(8)&& whichsymbol[2]%2==1 &&whichsymbol[5]%2==1 && whichsymbol[8]%2==1)
           { rounds=9;score1=5;score2=0;
        canvas.drawLine(7*cx/10,cy/4,7*cx/10,3*cy/4,white);}
        if(v.contains(0)&& v.contains(1) && v.contains(2)&& whichsymbol[0]%2==1 &&whichsymbol[1]%2==1 && whichsymbol[2]%2==1)
           { rounds=9;score1=5;score2=0;
        canvas.drawLine(cx/5,cy/3,4*cx/5,cy/3,white);}
        if(v.contains(3)&& v.contains(4) && v.contains(5)&& whichsymbol[3]%2==1 &&whichsymbol[4]%2==1 && whichsymbol[5]%2==1)
            {rounds=9;score1=5;score2=0;
        canvas.drawLine(cx/5,cy/2,4*cx/5,cy/2,white);}
        if(v.contains(6)&& v.contains(7) && v.contains(8)&& whichsymbol[6]%2==1 &&whichsymbol[7]%2==1 && whichsymbol[8]%2==1)
            {rounds=9;score1=5;score2=0;
            canvas.drawLine(cx/5,2*cy/3,4*cx/5,2*cy/3,white);}


        if(rounds==9) {
            Toast.makeText(getContext(),"GAME OVER",4000).show();
            //canvas.drawRect((cx / 5) - 30, (cy / 4) - 30, (4 * cx / 5) + 30, (3 * cy / 4) + 30, black);
            if(score1==0 &&score2==0)
            {MediaPlayer mp3=MediaPlayer.create(getContext(),R.raw.start);
                mp3.start();
                canvas.drawText("ITS A DRAW",cx/2,7*cy/8,text);}
            if(score1>score2)
           { MediaPlayer mp=MediaPlayer.create(getContext(),R.raw.player1victory);
             mp.start();
               canvas.drawText("PLAYER1 WINS",cx/2,7*cy/8,text);}
            if(score2>score1)
            { MediaPlayer mp2=MediaPlayer.create(getContext(),R.raw.player2victory);
              mp2.start();
                canvas.drawText("PLAYER2 WINS",cx/2,7*cy/8,text);
            }

        }

    }

    @Override
    public boolean onTouchEvent(MotionEvent event)
    {
        boolean value=super.onTouchEvent(event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
            { x=event.getX();

              y=event.getY();
                if(rounds!=9) {
                    if (!v.contains(0) && x >= cx / 5 && x <= (a - 15) && y >= cy / 4 && y <= (c - 15)) {
                        v.add(0);
                        rounds = rounds + 1;
                        whichsymbol[0] = rounds;
                    }
                    if (!v.contains(1) && x >= a + 15 && x <= b - 15 && y >= cy / 4 && y <= c - 15) {
                        v.add(1);
                        rounds = rounds + 1;
                        whichsymbol[1] = rounds;
                    }
                    if (!v.contains(2) && x >= b + 15 && x <= 4 * cx / 5 && y >= cy / 4 && y <= c - 15) {
                        v.add(2);
                        rounds = rounds + 1;
                        whichsymbol[2] = rounds;
                    }

                    if (!v.contains(3) && x >= cx / 5 && x <= (a - 15) && y >= (5 * cy / 12) + 15 && y <= (d - 15)) {
                        v.add(3);
                        rounds = rounds + 1;
                        whichsymbol[3] = rounds;
                    }
                    if (!v.contains(4) && x >= a + 15 && x <= b - 15 && y >= (5 * cy / 12) + 15 && y <= (d - 15)) {
                        v.add(4);
                        rounds = rounds + 1;
                        whichsymbol[4] = rounds;
                    }
                    if (!v.contains(5) && x >= b + 15 && x <= 4 * cx / 5 && y >= (5 * cy / 12) + 15 && y <= (d - 15)) {
                        v.add(5);
                        rounds = rounds + 1;
                        whichsymbol[5] = rounds;
                    }

                    if (!v.contains(6) && x >= cx / 5 && x <= (a - 15) && y >= d + 15 && y <= 3 * cy / 4) {
                        v.add(6);
                        rounds = rounds + 1;
                        whichsymbol[6] = rounds;
                    }
                    if (!v.contains(7) && x >= a + 15 && x <= b - 15 && y >= d + 15 && y <= 3 * cy / 4) {
                        v.add(7);
                        rounds = rounds + 1;
                        whichsymbol[7] = rounds;
                    }
                    if (!v.contains(8) && x >= b + 15 && x <= 4 * cx / 5 && y >= d + 15 && y <= 3 * cy / 4) {
                        v.add(8);
                        rounds = rounds + 1;
                        whichsymbol[8] = rounds;
                    }
                }








                postInvalidate();

                return true;
            }




        }
        return value;
    }



}



