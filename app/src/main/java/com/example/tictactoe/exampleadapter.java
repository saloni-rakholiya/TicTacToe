package com.example.tictactoe;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class exampleadapter extends RecyclerView.Adapter<exampleadapter.ExampleViewHolder> {
private ArrayList<Exampleitem> mexamplelist;
    public static class ExampleViewHolder extends RecyclerView.ViewHolder{

        public TextView name1;
        public TextView score1;



        public ExampleViewHolder(@NonNull View itemView) {
            super(itemView);
            name1=itemView.findViewById(R.id.name);
            score1=itemView.findViewById(R.id.score);

        }
    }


    public exampleadapter(ArrayList<Exampleitem> examplelist){
        mexamplelist=examplelist;
    }

    @NonNull
    @Override
    public ExampleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.mycard,parent,false);
        ExampleViewHolder vh=new ExampleViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull ExampleViewHolder holder, int position) {
      Exampleitem currentitem=mexamplelist.get(position);
      holder.name1.setText(currentitem.getName());
      holder.score1.setText(currentitem.getScore());
    }

    @Override
    public int getItemCount() {
        return mexamplelist.size();
    }
}
