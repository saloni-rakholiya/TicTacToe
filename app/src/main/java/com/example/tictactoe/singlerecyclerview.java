package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toolbar;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class singlerecyclerview extends AppCompatActivity {
Button btn;

    ArrayList<Exampleitem> exampleitems=new ArrayList<>();
    @Override
    public void onBackPressed() {

        return;
    }




    private RecyclerView recyclerview;
    private RecyclerView.Adapter madapter;
    private RecyclerView.LayoutManager mlayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_singlerecyclerview);

       loaddata();

        



        btn=findViewById(R.id.goback);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Main2Activity.class);
                startActivity(intent);
            }
        });






        //ArrayList<Exampleitem> exampleitems=new ArrayList<>();


        ///SharedPreferences setting=getSharedPreferences("gamedata2", Context.MODE_PRIVATE);



        //String score=setting.getString("Highscore",getIntent().getStringExtra("whowon"));

       /// SharedPreferences.Editor editor=setting.edit();
        //String score=setting.getString("Highscore",getIntent().getStringExtra("name1"));



        //if(!exampleitems.contains(score))
        //{ editor.putString("Highscore",getIntent().getStringExtra("name1"));
        //  editor.commit();
        //exampleitems.add(new Exampleitem(score,"5"));}

//    String score=setting.getString("score","0");
  //  String score2=setting.getString("score2","0");

//"1".equals(getIntent().getStringExtra("whowon"))
        if(getIntent().getIntExtra("whowon",0)==1 ) {
            exampleitems.add(new Exampleitem("YOU WON", "1"));
         ///   editor.putString("score", String.valueOf(Integer.parseInt(score) + 1));
            ///editor.commit();
        ///  exampleitems.add(new Exampleitem("YOU", String.valueOf(Integer.parseInt(score) + 1)));
        /// exampleitems.add(new Exampleitem("COMPUTER", String.valueOf(Integer.parseInt(score2))));
            //exampleitems.add(new Exampleitem("player1",String.valueOf(Integer.parseInt(score)+1)));
            //exampleitems.add(new Exampleitem("player2",String.valueOf(Integer.parseInt(score2)+1)));}
        }

    else if( getIntent().getIntExtra("whowon",0)==2)
     {
         exampleitems.add(new Exampleitem("COMPUTER WON", "1"));
        /// editor.putString("score2",String.valueOf(Integer.parseInt(score2)+1));
    ///     editor.commit();
            //exampleitems.add(new Exampleitem("player1",String.valueOf(Integer.parseInt(score)+1)));
            //exampleitems.add(new Exampleitem("player2",String.valueOf(Integer.parseInt(score2)+1)));
    ///     exampleitems.add(new Exampleitem("YOU",String.valueOf(Integer.parseInt(score))));
    ///     exampleitems.add(new Exampleitem("COMPUTER",String.valueOf(Integer.parseInt(score2)+1)));
    }

     else if( getIntent().getIntExtra("whowon",0)==5) {
            /// {   editor.putString("score",String.valueOf(Integer.parseInt(score)+1));
            ///     editor.commit();
            ///     editor.putString("score2",String.valueOf(Integer.parseInt(score2)+1));
            ///     editor.commit();
            exampleitems.add(new Exampleitem("IT WAS A DRAW",""));
            ///     exampleitems.add(new Exampleitem("YOU",String.valueOf(Integer.parseInt(score)+1)));
            ///     exampleitems.add(new Exampleitem("COMPUTER",String.valueOf(Integer.parseInt(score2)+1)));
            /// }
        }


savedata();

//stop



        //exampleitems.add(new Exampleitem("line1","2"));
        //exampleitems.add(new Exampleitem("line1","2"));
        //exampleitems.add(new Exampleitem("line2","5"));
        //exampleitems.add(new Exampleitem(getIntent().getStringExtra("name1"),"1"));
        //exampleitems.add(new Exampleitem(getIntent().getStringExtra("name2"),"1"));



        recyclerview=findViewById(R.id.recyclerview);
        recyclerview.setHasFixedSize( true);
        mlayout=new LinearLayoutManager(this);
        madapter=new exampleadapter(exampleitems);
        recyclerview.setLayoutManager(mlayout);
        recyclerview.setAdapter(madapter);



    }
    
    private void loaddata()
    {SharedPreferences sharedpreferences=getSharedPreferences("gamedata2", Context.MODE_PRIVATE);
        Gson gson=new Gson();
        String json=sharedpreferences.getString("tasklist",null);
        Type type= new TypeToken<ArrayList<Exampleitem>>(){}.getType();
         exampleitems = gson.fromJson(json, type);
        if(exampleitems==null)
        {
            //ArrayList<Exampleitem> exampleitems=new ArrayList<>();
            exampleitems=new ArrayList<Exampleitem>();
        }
    }

    private  void savedata()
    {SharedPreferences sharedpreferences=getSharedPreferences("gamedata2", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor=sharedpreferences.edit();
        Gson gson=new Gson();
        String json=gson.toJson(exampleitems);
        editor.putString("tasklist",json);
        editor.apply();}
    
}
