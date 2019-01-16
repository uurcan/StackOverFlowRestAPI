package com.example.celebi.retrofithttp;

import android.content.ContentValues;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    private Context context;
    private List<Items> itemsList;
    private CustomClickListener listener;

    public CustomAdapter(Context context,List<Items> itemsList,CustomClickListener listener) {
        this.context = context;
        this.itemsList = itemsList;
        this.listener = listener;
    }

    @Override
    public CustomAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.simple_list_item_1,parent,false);
        MyViewHolder viewHolder = new MyViewHolder(view,listener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CustomAdapter.MyViewHolder holder, int position) {
        holder.textView.setText(itemsList.get(position).getOwner().getDisplayName());
    }

    @Override
    public int getItemCount() {
        return itemsList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView textView;
        private CustomClickListener listener;
        public MyViewHolder(View itemView,CustomClickListener listener) {
            super(itemView);
            textView = (TextView)itemView.findViewById(android.R.id.text1);
            this.listener = listener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            Items items = getItems(getAdapterPosition());
            this.listener.postOnClick(items.getAnswerId());
            notifyDataSetChanged();
        }
    }
    public void updateItems(List<Items> items){
        itemsList = items;
        notifyDataSetChanged();
    }
    private Items getItems(int adapterPosition){
        return itemsList.get(adapterPosition);
    }
    public interface CustomClickListener{
        void postOnClick(long id);
    }
}
