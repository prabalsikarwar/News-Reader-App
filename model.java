package com.example.newsreaderapp;

public class model {
    private String author,title,description ,urlToimg,Url,Publishedat;
    public model(String author,String title,String description,String urlToimg,String Url,String Publishedat){
        this.author=author;
        this.description=description;
        this.title=title;
        this.urlToimg=urlToimg;
        this.Url=Url;
        this.Publishedat=Publishedat;

    }
    public void setPublishedat(String publishedat) {
        Publishedat=publishedat ;
    }

    public String getPublishedat() {
        return Publishedat;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public String getUrlToimg() {
        return urlToimg;
    }

    public void setUrlToimg(String urltoimg) {
        this.urlToimg = urltoimg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }
}
