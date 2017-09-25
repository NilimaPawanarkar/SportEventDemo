package com.example.nilima.sporteventdemo.main;

/**
 * Created by nilima on 24/9/17.
 */

public interface MainContract {

    interface View{
        void prepareEventData();
        void setTitle(String title);
        void setDate(String date);
    }

    interface Presenter{

        void onstart();
        void ontitleClick();

        void onActivityStopped();
        void onActivityStarted();
    }
}
