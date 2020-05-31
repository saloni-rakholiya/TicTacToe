package com.example.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.media.MediaPlayer;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.Vector;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

public class singleactor extends View {



    private Paint black;
    private Paint white;
    private  Paint text;
    private Paint red;
    private  Paint blue;
    float cx;
    Vector v=new Vector();
    int[] whichsymbol={0,0,0,0,0,0,0,0,0};
    int rounds=0;
    float cy;
    int ck=0;
    float x;
    int check=0;
    float y;
    float a;
    float b;
    float c;
    float d;
    int s1=0;
    int s2=0;


    public singleactor(Context context) {
        super(context);
        init(null);
    }

    public singleactor(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public singleactor(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    public singleactor(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(attrs);
    }

    private void init(@Nullable AttributeSet set)
    {
        red=new Paint();
        blue=new Paint();
        red.setColor(Color.RED);
        blue.setColor(Color.BLUE);
        blue.setStyle(Paint.Style.STROKE);
        blue.setStrokeWidth(30);
        black=new Paint();
        white=new Paint();
        white.setColor(Color.WHITE);
        white.setStrokeWidth(40);
        black.setColor(Color.BLACK);
        text=new Paint();
        text.setColor(Color.WHITE);
        text.setTextSize(100);
        text.setStrokeWidth(60);
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

        canvas.drawRect(a-15,cy/4,a+15,3*cy/4,black);
        canvas.drawRect(b-15,cy/4,b+15,3*cy/4,black);
        canvas.drawRect((cx/5),c-15,(4*cx/5),c+15,black);
        canvas.drawRect((cx/5),d-15,(4*cx/5),d+15,black);

        //here

            check=0;
if(ck==1) {
    if (check != 1 && !v.contains(0) && ((whichsymbol[1] == -1 && whichsymbol[2] == -1) || (whichsymbol[3] == -1 && whichsymbol[6] == -1) || (whichsymbol[4] == -1 && whichsymbol[8] == -1))) {
        canvas.drawCircle((3 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[0] = -1;
    } else if (check != 1 && !v.contains(1) && ((whichsymbol[0] == -1 && whichsymbol[2] == -1) || (whichsymbol[4] == -1 && whichsymbol[7] == -1))) {
        canvas.drawCircle((cx / 2), cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[1] = -1;
    } else if (check != 1 && !v.contains(2) && ((whichsymbol[0] == -1 && whichsymbol[1] == -1) || (whichsymbol[4] == -1 && whichsymbol[6] == -1) || (whichsymbol[5] == -1 && whichsymbol[8] == -1))) {
        canvas.drawCircle((7 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[2] = -1;
    } else if (check != 1 && !v.contains(3) && ((whichsymbol[0] == -1 && whichsymbol[6] == -1) || (whichsymbol[4] == -1 && whichsymbol[5] == -1))) {
        canvas.drawCircle((3 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[3] = -1;
    } else if (check != 1 && !v.contains(4) && ((whichsymbol[1] == -1 && whichsymbol[7] == -1) || (whichsymbol[3] == -1 && whichsymbol[5] == -1) || (whichsymbol[0] == -1 && whichsymbol[8] == -1) || (whichsymbol[2] == -1 && whichsymbol[6] == -1))) {
        canvas.drawCircle((cx / 2), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[4] = -1;
    } else if (check != 1 && !v.contains(5) && ((whichsymbol[8] == -1 && whichsymbol[2] == -1) || (whichsymbol[3] == -1 && whichsymbol[4] == -1))) {
        canvas.drawCircle((7 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[5] = -1;
    } else if (check != 1 && !v.contains(6) && ((whichsymbol[0] == -1 && whichsymbol[3] == -1) || (whichsymbol[7] == -1 && whichsymbol[8] == -1) || (whichsymbol[4] == -1 && whichsymbol[2] == -1))) {
        canvas.drawCircle((3 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[6] = -1;
    } else if (check != 1 && !v.contains(7) && ((whichsymbol[1] == -1 && whichsymbol[4] == -1) || (whichsymbol[8] == -1 && whichsymbol[6] == -1))) {
        canvas.drawCircle((cx / 2), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        check = 1;
        whichsymbol[7] = -1;
    } else if (check != 1 && !v.contains(8) && ((whichsymbol[5] == -1 && whichsymbol[2] == -1) || (whichsymbol[7] == -1 && whichsymbol[6] == -1) || (whichsymbol[4] == -1 && whichsymbol[0] == -1))) {
        canvas.drawCircle((7 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[8] = -1;
    } else if (check != 1 && whichsymbol[0] == 0 && ((v.contains(1) && v.contains(2)) || (v.contains(3) && v.contains(6)) || (v.contains(4) && v.contains(8)))) {
        canvas.drawCircle((3 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[0] = -1;
    } else if (check != 1 && whichsymbol[1] == 0 && ((v.contains(0) && v.contains(2)) || (v.contains(4) && v.contains(7)))) {
        canvas.drawCircle((cx / 2), cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[1] = -1;
    } else if (check != 1 && whichsymbol[2] == 0 && ((v.contains(1) && v.contains(0)) || (v.contains(4) && v.contains(6)) || (v.contains(5) && v.contains(8)))) {
        canvas.drawCircle((7 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[2] = -1;
    } else if (check != 1 && whichsymbol[3] == 0 && ((v.contains(4) && v.contains(5)) || (v.contains(0) && v.contains(6)))) {
        canvas.drawCircle((3 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[3] = -1;
    } else if (check != 1 && whichsymbol[5] == 0 && ((v.contains(8) && v.contains(2)) || (v.contains(4) && v.contains(3)))) {
        canvas.drawCircle((7 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[5] = -1;
    } else if (check != 1 && whichsymbol[7] == 0 && ((v.contains(1) && v.contains(4)) || (v.contains(6) && v.contains(8)))) {
        canvas.drawCircle((cx / 2), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[7] = -1;
    } else if (check != 1 && whichsymbol[6] == 0 && ((v.contains(4) && v.contains(2)) || (v.contains(3) && v.contains(0)) || (v.contains(7) && v.contains(8)))) {
        canvas.drawCircle((3 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[6] = -1;
    } else if (check != 1 && whichsymbol[8] == 0 && ((v.contains(4) && v.contains(0)) || (v.contains(5) && v.contains(2)) || (v.contains(7) && v.contains(6)))) {
        canvas.drawCircle((7 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[8] = -1;
    } else if (check != 1 && whichsymbol[4] == 0 && ((v.contains(1) && v.contains(7)) || (v.contains(3) && v.contains(5)) || (v.contains(8) && v.contains(0)) || (v.contains(2) && v.contains(6)))) {
        canvas.drawCircle((cx / 2), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[4] = -1;
    }

    else if (whichsymbol[4] == 0 && !v.contains(4) && v.size() >= 1) //center
    {
        check = 1;
        canvas.drawCircle((cx / 2), cy / 2, (cx / 10) - 20, blue);
        whichsymbol[4] = -1;
    }
//here
    else if(v.contains(0)&&v.contains(8)&&whichsymbol[1]==0 &&v.size()>=1)
    { check = 1;
        canvas.drawCircle((cx / 2), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[1] = -1;}
    else if(v.contains(0)&&v.contains(8)&&whichsymbol[3]==0 &&v.size()>=1)
    {canvas.drawCircle((3 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[3] = -1;}
    else if(v.contains(0)&&v.contains(8)&&whichsymbol[5]==0 && v.size()>=1)
    { canvas.drawCircle((7 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[5] = -1;}
    else if(v.contains(0)&&v.contains(8)&&whichsymbol[7]==0 && v.size()>=1)
    {canvas.drawCircle((cx / 2), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[7] = -1;}
    else if(v.contains(2)&&v.contains(6)&&whichsymbol[1]==0 &&v.size()>=1)
    { check = 1;
        canvas.drawCircle((cx / 2), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[1] = -1;}
    else if(v.contains(2)&&v.contains(6)&&whichsymbol[3]==0 &&v.size()>=1)
    {canvas.drawCircle((3 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[3] = -1;}
    else if(v.contains(2)&&v.contains(6)&&whichsymbol[5]==0 && v.size()>=1)
    { canvas.drawCircle((7 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[5] = -1;}
    else if(v.contains(2)&&v.contains(6)&&whichsymbol[7]==0 && v.size()>=1)
    {canvas.drawCircle((cx / 2), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[7] = -1;}
    //till here
    else if (v.contains(0) && whichsymbol[8] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((7 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        whichsymbol[8] = -1;
    } else if (v.contains(2) && whichsymbol[6] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((3 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        whichsymbol[6] = -1;
    } else if (v.contains(8) && whichsymbol[0] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((3 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[0] = -1;
    } else if (v.contains(6) && whichsymbol[2] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((7 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[2] = -1;
    } else if (check == 0 && whichsymbol[0] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((3 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[0] = -1;
    } else if (check == 0 && whichsymbol[2] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((7 * cx / 10), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[2] = -1;
    } else if (check == 0 && whichsymbol[6] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((3 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        whichsymbol[6] = -1;
    } else if (check == 0 && whichsymbol[8] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((7 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
        whichsymbol[8] = -1;
    } else if (whichsymbol[1] == 0 && v.size() >= 1) {
        check = 1;
        canvas.drawCircle((cx / 2), cy / 3, (cx / 10) - 20, blue);
        whichsymbol[1] = -1;
    } else if (whichsymbol[3] == 0 && v.size() >= 1) {
        canvas.drawCircle((3 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[3] = -1;
    } else if (whichsymbol[7] == 0 && v.size() >= 1) {
        canvas.drawCircle((cx / 2), 2 * cy / 3, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[7] = -1;
    } else if (whichsymbol[5] == 0 && v.size() >= 1) {
        canvas.drawCircle((7 * cx / 10), cy / 2, (cx / 10) - 20, blue);
        check = 1;
        whichsymbol[5] = -1;
    }

}
    //hereend
    if (whichsymbol[0] == -1)
        canvas.drawCircle((3 * cx / 10), cy / 3, (cx / 10) - 20, blue);
    if (whichsymbol[1] == -1)
        canvas.drawCircle((cx / 2), cy / 3, (cx / 10) - 20, blue);
    if (whichsymbol[2] == -1)
        canvas.drawCircle((7 * cx / 10), cy / 3, (cx / 10) - 20, blue);
    if (whichsymbol[3] == -1)
        canvas.drawCircle((3 * cx / 10), cy / 2, (cx / 10) - 20, blue);
    if (whichsymbol[4] == -1)
        canvas.drawCircle((cx / 2), cy / 2, (cx / 10) - 20, blue);
    if (whichsymbol[5] == -1)
        canvas.drawCircle((7 * cx / 10), cy / 2, (cx / 10) - 20, blue);
    if (whichsymbol[6] == -1)
        canvas.drawCircle((3 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);
    if (whichsymbol[7] == -1)
        canvas.drawCircle((cx / 2), 2 * cy / 3, (cx / 10) - 20, blue);
    if (whichsymbol[8] == -1)
        canvas.drawCircle((7 * cx / 10), 2 * cy / 3, (cx / 10) - 20, blue);


        //addall











        //if(v.contains(0))
        //canvas.drawCircle((3*cx/10),cy/3,(cx/10)-20,blue);
      //if(v.contains(3))
        //canvas.drawCircle((3*cx/10),cy/2,(cx/10)-20,blue);
      //if(v.contains(6))
        //canvas.drawCircle((3*cx/10),2*cy/3,(cx/10)-20,blue);

      //if(v.contains(1))
         // canvas.drawCircle((cx/2),cy/3,(cx/10)-20,blue);
      //if(v.contains(4))
        //canvas.drawCircle((cx/2),cy/2,(cx/10)-20,blue);
      //if(v.contains(7))
        //canvas.drawCircle((cx/2),2*cy/3,(cx/10)-20,blue);
      //if(v.contains(2))
        //canvas.drawCircle((7*cx/10),cy/3,(cx/10)-20,blue);
      //if(v.contains(5))
        //canvas.drawCircle((7*cx/10),cy/2,(cx/10)-20,blue);
      //if(v.contains(8))
        //canvas.drawCircle((7*cx/10),2*cy/3,(cx/10)-20,blue);


        red.setStrokeWidth(50);

        if(v.contains(0))
        {canvas.drawLine((cx/5)+35,(cy/4)+35,(2*cx/5)-35,(5*cy/12)-35,red);
            canvas.drawLine((cx/5)+35,(5*cy/12)-35,(2*cx/5)-35,(cy/4)+35,red);}

        if(v.contains(1))
        {canvas.drawLine((2*cx/5)+35,(cy/4)+35,(3*cx/5)-35,(5*cy/12)-35,red);
            canvas.drawLine((2*cx/5)+35,(5*cy/12)-35,(3*cx/5)-35,(cy/4)+35,red);}

        if(v.contains(2))
        { canvas.drawLine((3*cx/5)+35,(cy/4)+35,(4*cx/5)-35,(5*cy/12)-35,red);
            canvas.drawLine((3*cx/5)+35,(5*cy/12)-35,(4*cx/5)-35,(cy/4)+35,red);}


        if(v.contains(3))
        {canvas.drawLine((cx/5)+35,(5*cy/12)+35,(2*cx/5)-35,(7*cy/12)-35,red);
            canvas.drawLine((cx/5)+35,(7*cy/12)-35,(2*cx/5)-35,(5*cy/12)+35,red);}

        if(v.contains(4))
        {canvas.drawLine((2*cx/5)+35,(5*cy/12)+35,(3*cx/5)-35,(7*cy/12)-35,red);
            canvas.drawLine((2*cx/5)+35,(7*cy/12)-35,(3*cx/5)-35,(5*cy/12)+35,red);}

        if(v.contains(5))
        {canvas.drawLine((3*cx/5)+35,(5*cy/12)+35,(4*cx/5)-35,(7*cy/12)-35,red);
            canvas.drawLine((3*cx/5)+35,(7*cy/12)-35,(4*cx/5)-35,(5*cy/12)+35,red);}


        if(v.contains(6))
        {canvas.drawLine((cx/5)+35,(7*cy/12)+35,(2*cx/5)-35,(3*cy/4)-35,red);
            canvas.drawLine((cx/5)+35,(3*cy/4)-35,(2*cx/5)-35,(7*cy/12)+35,red);}

        if(v.contains(7))
        { canvas.drawLine((2*cx/5)+35,(7*cy/12)+35,(3*cx/5)-35,(3*cy/4)-35,red);
            canvas.drawLine((2*cx/5)+35,(3*cy/4)-35,(3*cx/5)-35,(7*cy/12)+35,red);}

        if(v.contains(8))
        {canvas.drawLine((3*cx/5)+35,(7*cy/12)+35,(4*cx/5)-35,(3*cy/4)-35,red);
            canvas.drawLine((3*cx/5)+35,(3*cy/4)-35,(4*cx/5)-35,(7*cy/12)+35,red);}



        //chechscore

        if(rounds!=5 && v.contains(0)&&v.contains(3)&&v.contains(6))
          { rounds=5; s1=s1+1;
              canvas.drawLine(3*cx/10,cy/4,3*cx/10,3*cy/4,white) ;}
        if(rounds!=5 && v.contains(1)&&v.contains(4)&&v.contains(7))
            { rounds=5; s1=s1+1;
                canvas.drawLine(cx/2,cy/4,cx/2,3*cy/4,white)  ;}
        if(rounds!=5 && v.contains(2)&&v.contains(5)&&v.contains(8))
           { rounds=5; s1=s1+1;
           canvas.drawLine(7*cx/10,cy/4,7*cx/10,3*cy/4,white);}
        if(rounds!=5 && v.contains(0)&&v.contains(1)&&v.contains(2))
           { rounds=5; s1=s1+1;
           canvas.drawLine(cx/5,cy/3,4*cx/5,cy/3,white) ;}
        if(rounds!=5 && v.contains(4)&&v.contains(3)&&v.contains(5))
            { rounds=5; s1=s1+1;
            canvas.drawLine(cx/5,cy/2,4*cx/5,cy/2,white) ;}
        if(rounds!=5 && v.contains(8)&&v.contains(7)&&v.contains(6))
            { rounds=5; s1=s1+1;
            canvas.drawLine(cx/5,2*cy/3,4*cx/5,2*cy/3,white);}
        if(rounds!=5 && v.contains(0)&&v.contains(4)&&v.contains(8))
            { rounds=5; s1=s1+1;
            canvas.drawLine(cx/5,cy/4,4*cx/5,3*cy/4,white);}
        if(rounds!=5 && v.contains(2)&&v.contains(4)&&v.contains(6))
           { rounds=5; s1=s1+1;
           canvas.drawLine(cx/5,3*cy/4,4*cx/5,cy/4,white);}


        if(rounds!=5 && whichsymbol[0]==-1 && whichsymbol[3]==-1 && whichsymbol[6]==-1)
           { rounds=5; s2=s2+1;
               canvas.drawLine(3*cx/10,cy/4,3*cx/10,3*cy/4,white) ;}
        if(rounds!=5 && whichsymbol[1]==-1 && whichsymbol[4]==-1 && whichsymbol[7]==-1)
            {rounds=5; s2=s2+1;
            canvas.drawLine(cx/2,cy/4,cx/2,3*cy/4,white) ;}
        if(rounds!=5 && whichsymbol[2]==-1 && whichsymbol[5]==-1 && whichsymbol[8]==-1)
           {rounds=5; s2=s2+1;
           canvas.drawLine(7*cx/10,cy/4,7*cx/10,3*cy/4,white);}
        if(rounds!=5 && whichsymbol[0]==-1 && whichsymbol[1]==-1 && whichsymbol[2]==-1)
           {rounds=5; s2=s2+1;
           canvas.drawLine(cx/5,cy/3,4*cx/5,cy/3,white) ;}
        if(rounds!=5 && whichsymbol[4]==-1 && whichsymbol[3]==-1 && whichsymbol[5]==-1)
            {rounds=5; s2=s2+1;
            canvas.drawLine(cx/5,cy/2,4*cx/5,cy/2,white) ;}
        if(rounds!=5 && whichsymbol[8]==-1 && whichsymbol[7]==-1 && whichsymbol[6]==-1)
           {rounds=5; s2=s2+1;
           canvas.drawLine(cx/5,2*cy/3,4*cx/5,2*cy/3,white) ;}
        if(rounds!=5 && whichsymbol[0]==-1 && whichsymbol[4]==-1 && whichsymbol[8]==-1)
            {rounds=5; s2=s2+1;
            canvas.drawLine(cx/5,cy/4,4*cx/5,3*cy/4,white);}
        if(rounds!=5 && whichsymbol[2]==-1 && whichsymbol[4]==-1 && whichsymbol[6]==-1)
           {rounds=5; s2=s2+1;
           canvas.drawLine(cx/5,3*cy/4,4*cx/5,cy/4,white);}

        //checkscoreend
        if(rounds==5) {
            Toast.makeText(getContext(),"GAME OVER",4000).show();
            //canvas.drawRect((cx / 5) - 30, (cy / 4) - 30, (4 * cx / 5) + 30, (3 * cy / 4) + 30, black);
            if(s1==s2)
            { canvas.drawText("ITS A DRAW",cx/2,7*cy/8,text) ;
                MediaPlayer mp=MediaPlayer.create(getContext(),R.raw.start);
                mp.start();

                Intent intent=new Intent(getContext(),singlerecyclerview.class);
                // intent.putExtra("whowon","5");
                intent.putExtra("whowon",5);
                getContext().startActivity(intent);


            }
            else if(s1>s2)
            { MediaPlayer mp2=MediaPlayer.create(getContext(),R.raw.player1victory);
            mp2.start();
            canvas.drawText("YOU WIN !!",cx/2,7*cy/8,text);
                Intent intent=new Intent(getContext(),singlerecyclerview.class);
                //intent.putExtra("whowon","1");
                intent.putExtra("whowon",1);
                getContext().startActivity(intent);

            }
            else if(s1<s2)
            { MediaPlayer mp3=MediaPlayer.create(getContext(),R.raw.player2victory);
            mp3.start();


                canvas.drawText("YOU LOSE !!",cx/2,7*cy/8,text);
                Intent intent=new Intent(getContext(),singlerecyclerview.class);
                intent.putExtra("whowon",2);
                //intent.putExtra("whowon","2");
                getContext().startActivity(intent);

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
                ck=0;
                if(rounds!=5) {
                    if (whichsymbol[0]==0 && !v.contains(0) && x >= cx / 5 && x <= (a - 15) && y >= cy / 4 && y <= (c - 15)) {
                        v.add(0);
                        ck=1;
                        rounds = rounds + 1;
                        whichsymbol[0] = rounds;
                    }
                    if (whichsymbol[1]==0 && !v.contains(1) && x >= a + 15 && x <= b - 15 && y >= cy / 4 && y <= c - 15) {
                        v.add(1);
                        ck=1;
                        rounds = rounds + 1;
                        whichsymbol[1] = rounds;
                    }
                    if (whichsymbol[2]==0 && !v.contains(2) && x >= b + 15 && x <= 4 * cx / 5 && y >= cy / 4 && y <= c - 15) {
                        v.add(2);
                        ck=1;
                        rounds = rounds + 1;
                        whichsymbol[2] = rounds;
                    }

                    if (whichsymbol[3]==0 && !v.contains(3) && x >= cx / 5 && x <= (a - 15) && y >= (5 * cy / 12) + 15 && y <= (d - 15)) {
                        v.add(3);
                        ck=1;
                        rounds = rounds + 1;
                        whichsymbol[3] = rounds;
                    }
                    if (whichsymbol[4]==0 && !v.contains(4) && x >= a + 15 && x <= b - 15 && y >= (5 * cy / 12) + 15 && y <= (d - 15)) {
                        v.add(4);
                        ck=1;
                        rounds = rounds + 1;
                        whichsymbol[4] = rounds;
                    }
                    if (whichsymbol[5]==0 && !v.contains(5) && x >= b + 15 && x <= 4 * cx / 5 && y >= (5 * cy / 12) + 15 && y <= (d - 15)) {
                        v.add(5);
                        ck=1;
                        rounds = rounds + 1;
                        whichsymbol[5] = rounds;
                    }

                    if (whichsymbol[6]==0 && !v.contains(6) && x >= cx / 5 && x <= (a - 15) && y >= d + 15 && y <= 3 * cy / 4) {
                        v.add(6);
                        rounds = rounds + 1;
                        ck=1;
                        whichsymbol[6] = rounds;
                    }
                    if (whichsymbol[7]==0 && !v.contains(7) && x >= a + 15 && x <= b - 15 && y >= d + 15 && y <= 3 * cy / 4) {
                        v.add(7);
                        rounds = rounds + 1;
                        ck=1;
                        whichsymbol[7] = rounds;
                    }
                    if (whichsymbol[8]==0 && !v.contains(8) && x >= b + 15 && x <= 4 * cx / 5 && y >= d + 15 && y <= 3 * cy / 4) {
                        v.add(8);
                        ck=1;
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
