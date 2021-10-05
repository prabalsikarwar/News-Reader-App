package com.example.newsreaderapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class sports extends Fragment{
    private RecyclerView recyclerViewofsports;
    Adapter adapter;
    ArrayList<model> modelArrayList;
    String api="aa6ab835c72943a78631ea71df862d94";
    String Country="in";
    private String Category="sports";



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sportsfragment,null); adapter= new Adapter(getContext(),modelArrayList);

        recyclerViewofsports=v.findViewById(R.id.recyclerviewofsports);
        modelArrayList=new ArrayList<>();
        recyclerViewofsports.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new Adapter(getContext(),modelArrayList);
        recyclerViewofsports.setAdapter(adapter);
        findNews();


        return v;
    }

    private void findNews() {
        Apiutilities.getapiinterface().getNewscategory(Country,Category,100,api).enqueue(new Callback<Mainnews>() {
            @Override
            public void onResponse(Call<Mainnews> call, Response<Mainnews> response) {
                if (response.isSuccessful()){
                    modelArrayList.addAll(response.body().getArticles());
                    adapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onFailure(Call<Mainnews> call, Throwable t) {

            }
        });



    }

}
