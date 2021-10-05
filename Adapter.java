package com.example.newsreaderapp;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    Context context;
    ArrayList<model> modelArrayList;
    public Adapter(Context context,ArrayList<model> modelArrayList){
        this.context=context;
        this.modelArrayList=modelArrayList;
    }
    @Override
    public Adapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item, null, false);
        return new ViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull Adapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context,web.class);
                intent.putExtra("url",modelArrayList.get(position).getUrl());
                context.startActivity(intent);
            }
        });
        holder.mtime.setText("Published At -:"+ modelArrayList.get(position).getPublishedat() );
        holder.mauthor.setText(modelArrayList.get(position).getAuthor() );
        holder.mheading.setText( modelArrayList.get(position).getTitle() );
        holder.mcontext.setText( modelArrayList.get(position).getDescription());
        Glide.with(context).load(modelArrayList.get(position).getUrl()).into(holder.imageView);
    }
    @Override
    public int getItemCount() {
        return modelArrayList.size() ;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView mheading,mauthor,mcontext,mtime;
        CardView cardView;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mheading=itemView.findViewById(R.id.mainheading);
            mtime=itemView.findViewById(R.id.time);
            mauthor=itemView.findViewById(R.id.author);
            mcontext=itemView.findViewById(R.id.context);
            imageView=itemView.findViewById(R.id.imageview);
            cardView=itemView.findViewById(R.id.cardview);
        }
    }


}
