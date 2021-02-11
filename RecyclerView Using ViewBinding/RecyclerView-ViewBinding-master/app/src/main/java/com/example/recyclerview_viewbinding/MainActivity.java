package com.example.recyclerview_viewbinding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.recyclerview_viewbinding.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    RecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = ActivityMainBinding.inflate(getLayoutInflater());
        View rootView = activityMainBinding.getRoot();
        setContentView(rootView);

        recyclerAdapter = new RecyclerAdapter();
        activityMainBinding.recyclerView.setAdapter(recyclerAdapter);

        List<String> list = new ArrayList<>();
        list.add("Android");
        list.add("React");
        list.add("JavaScript");
        list.add("Flutter");
        list.add("Node JS");
        list.add("Java");
        recyclerAdapter.updateList(list);
    }

}
