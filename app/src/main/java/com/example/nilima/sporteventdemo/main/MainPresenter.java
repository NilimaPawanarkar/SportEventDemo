package com.example.nilima.sporteventdemo.main;

import android.content.Intent;
import android.text.TextUtils;
import android.content.Context;


import com.example.nilima.sporteventdemo.AppController;
import com.example.nilima.sporteventdemo.event.EventActivity;

/**
 * Created by nilima on 24/9/17.
 */

public class MainPresenter implements MainContract.Presenter
{
    MainContract.View view;
    Context context;
    AppController appController;

    public MainPresenter(Context context, MainContract.View view) {
        this.view = view;
        this.context = context;
        this.appController = (AppController) ((MainActivity) context).getApplication();
    }



    @Override
    public void onActivityStopped() {

    }

    @Override
    public void onActivityStarted() {

    }



}
