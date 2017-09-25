package com.example.nilima.sporteventdemo.main.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.nilima.sporteventdemo.R;
import com.example.nilima.sporteventdemo.data.Event;

import java.util.List;

/**
 * Created by nilima on 24/9/17.
 */

public class EventAdapter extends RecyclerView.Adapter<EventAdapter.MyViewHolder> {

    private List<Event> eventList;

    public class MyViewHolder extends RecyclerView.ViewHolder{

        public TextView title,date;

        public MyViewHolder(View view){
            super(view);
            title=(TextView) view.findViewById(R.id.etitle);
            date=(TextView) view.findViewById(R.id.edate);

        }
    }

    public EventAdapter(List<Event> bookList){
        this.eventList=eventList;
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.event_list_row,parent,false);

        return new MyViewHolder(itemView);
    }

    public void onBindViewHolder(MyViewHolder holder,int position){
        Event event=eventList.get(position);
        holder.title.setText(event.getTitle());
        holder.date.setText(event.getDate());
    }

    public int getItemCount(){
        return eventList.size();
    }
}
