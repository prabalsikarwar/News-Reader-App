package com.example.newsreaderapp;

import java.util.ArrayList;

public class Mainnews{
    private String status;
    private String TotalResult;
    private ArrayList<model> articles;
    public Mainnews(String status,String TotalResult,ArrayList <model> articles){
        this.articles=articles;
        this.status=status;
        this.TotalResult=TotalResult;
    }

    public String getStatus() {
        return status;


    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<model> getArticles() {
        return articles;
    }

    public void setArticles(ArrayList<model> articles) {
        this.articles = articles;
    }

    public String getTotalResult() {
        return TotalResult;

    }

    public void setTotalResult(String totalResult) {
        TotalResult = totalResult;
    }
}
