package com.example.nilima.sporteventdemo.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.nilima.sporteventdemo.R;
import com.example.nilima.sporteventdemo.data.Event;
import com.example.nilima.sporteventdemo.main.adapter.EventAdapter;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MainContract.View {

    public RecyclerView recyclerView;
    List<Event> eventList;
    private EventAdapter eventAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toolbar toolbar=(Toolbar) findViewById(R.id.toolbar1);
        // setSupportActionBar(toolbar);
        eventList = new ArrayList<>();
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        prepareEventData();
        eventAdapter = new EventAdapter(eventList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(eventAdapter);

    }

    public void prepareEventData() {
        Event event = new Event("The God of Small Things", "Arundhati Roy");
        eventList.add(event);
        Event event1 = new Event("A fine Balance", "Rohinton Mistry");
        eventList.add(event1);
//        eventAdapter.notifyDataSetChanged();
    }

    @Override
    public void setTitle(String title) {

    }

    @Override
    public void setDate(String date) {

    }

}
