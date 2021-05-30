package com.example.and1dz3.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.example.and1dz3.R;
import com.example.and1dz3.models.TitleModel;

import java.util.ArrayList;

public class TitleAdapter extends RecyclerView.Adapter<TitleAdapter.TitleViewHolder> {

    private ArrayList<TitleModel> list = new ArrayList<>();

    public void addItem(ArrayList<TitleModel> list) {
        this.list.addAll(list);
    }

    @NonNull
    @Override
    public TitleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_rv, parent, false);
        return new TitleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TitleViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class TitleViewHolder extends RecyclerView.ViewHolder {

        private TextView title;
        private TextView description;

        public TitleViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.title_tv);
            description = itemView.findViewById(R.id.description_tv);
        }

        public void onBind(TitleModel s) {
            title.setText(s.getTitle());
            description.setText(s.getDescription());
        }
    }
}
