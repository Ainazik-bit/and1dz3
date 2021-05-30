package com.example.and1dz3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.and1dz3.R;

import java.util.ArrayList;

public class NumbersAdapter extends RecyclerView.Adapter<NumbersAdapter.NumbersViewHolder> {

    private ArrayList<Integer> list = new ArrayList<>();

    public void addList(ArrayList<Integer> list){
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public NumbersViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv2, parent, false);
        return new NumbersViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NumbersViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class NumbersViewHolder extends RecyclerView.ViewHolder {

        private TextView textView;

        public NumbersViewHolder(@NonNull View itemView) {
            super(itemView);
            textView = itemView.findViewById(R.id.numbers);
        }

        public void onBind(Integer integer) {
            textView.setText(String.valueOf(integer));
        }
    }
}
