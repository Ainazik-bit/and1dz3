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

import com.example.and1dz3.adapter.TitleAdapter;
import com.example.and1dz3.models.TitleModel;

import java.util.ArrayList;

public class TitleFragment extends Fragment {

    private RecyclerView recyclerView;
    public static final String DATA = "DATA";
    private int mPage;
    private TitleAdapter titleAdapter;
    private ArrayList<TitleModel> list;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        createList();
        initRecycler(view);

    }

    private void createList() {
        list = new ArrayList<>();
        list.add(new TitleModel("Ainazik", "Pulatova"));
        list.add(new TitleModel("Orozbek", "Turduev"));
        list.add(new TitleModel("Meerim", "Pulatova"));
        list.add(new TitleModel("Zlata", "Turdueva"));
        list.add(new TitleModel("Bakai", "Ismailov"));
        list.add(new TitleModel("Aidana", "Dosalieva"));
    }

    private void initRecycler(View view) {
        recyclerView = view.findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        titleAdapter = new TitleAdapter();
        titleAdapter.addItem(list);
        recyclerView.setAdapter(titleAdapter);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_title, container, false);

    }
}