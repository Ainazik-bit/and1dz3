package com.example.and1dz3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.and1dz3.adapter.NumbersAdapter;

import java.util.ArrayList;

public class NumbersFragment extends Fragment {

    private RecyclerView recyclerView;
    private NumbersAdapter numbersAdapter;
    private ArrayList<Integer> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_numbers, container, false);
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_view_number);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        numbersAdapter = new NumbersAdapter();
        numbersAdapter.addList(list);
        recyclerView.setAdapter(numbersAdapter);
    }

    private void createList() {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
    }
}