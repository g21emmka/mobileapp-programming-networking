package com.example.networking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class MyAdapter extends RecyclerView.Adapter <MyViewHolder> {

    List <String>mountains = Arrays.asList("K2", "Billingen", "Dundret", "Kebnekaise","Mount Everest");

    public void setMountains(List<String> mountains) {
        this.mountains = mountains;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.title.setText(mountains.get(position));
    }

    @Override
    public int getItemCount() {
        return mountains.size();
    }
}