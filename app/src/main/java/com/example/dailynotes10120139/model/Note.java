package com.example.dailynotes10120139.model;

import java.io.Serializable;
//10120139-MochamadRidho-IF4
public class Note implements Serializable {

    String id;
    String title;
    String category;
    String desc;
    String date;

    public Note(String id, String title, String category, String desc, String date){
        this.id = id;
        this.title = title;
        this.category = category;
        this.desc = desc;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}