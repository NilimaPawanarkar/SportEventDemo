package com.example.nilima.sporteventdemo.main;

import android.app.usage.UsageEvents;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.nilima.sporteventdemo.R;
import com.example.nilima.sporteventdemo.data.Event;
import com.example.nilima.sporteventdemo.event.EventActivity;
import com.example.nilima.sporteventdemo.main.adapter.EventAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View{

    public RecyclerView recyclerView;
    private EventAdapter eventAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<UsageEvents.Event> eventList = new ArrayList<>();

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            //Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar1);
            // setSupportActionBar(toolbar);

            recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
            eventAdapter = new EventAdapter(eventList);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(eventAdapter);

            prepareEventData();

        }}

    public void prepareEventData() {

        Event event = new Event("The God of Small Things", "Arundhati Roy");
        eventList.add(event);

        event = new Event("A fine Balance", "Rohinton Mistry");
        eventList.add(event);


        eventAdapter.notifyDataSetChanged();
    }

}
