package com.example.nilima.sporteventdemo.data;

/**
 * Created by nilima on 10/9/17.
 */

public class Event {

    private String title,date;

    public Event(){

    }

    public Event(String title,String date){
        this.title=title;
        this.date=date;

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
