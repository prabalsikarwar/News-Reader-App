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
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

import javax.security.auth.callback.Callback;

import retrofit2.Call;
import retrofit2.Response;

public class Homefragment extends Fragment {
    String api="aa6ab835c72943a78631ea71df862d94";
    ArrayList<model> modelArrayList;
    Adapter adapter;
    String Country="in";
    private RecyclerView recyclerViewofhome;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.homefragment,null);

        recyclerViewofhome=v.findViewById(R.id.recyclerviewofhome);
        modelArrayList=new ArrayList<>();
        recyclerViewofhome.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter= new Adapter(getContext(),modelArrayList);
        recyclerViewofhome.setAdapter(adapter);
        findNews();


        return v;
    }

    private void findNews() {
        Apiutilities.getapiinterface().getNews(Country, 100, api).enqueue(new retrofit2.Callback<Mainnews>() {
            @Override
            public void onResponse(Call<Mainnews> call, Response<Mainnews> response) {
                if (response.isSuccessful()) {
                    modelArrayList.addAll(response.body().getArticles());
                }

            }

            @Override
            public void onFailure(Call<Mainnews> call, Throwable t) {

            }
        });
    }
    }


