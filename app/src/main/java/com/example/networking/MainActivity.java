package com.example.networking;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SuppressWarnings("FieldCanBeLocal")
public class MainActivity extends AppCompatActivity implements JsonTask.JsonTaskListener {

    RecyclerView recyclerView;

    private MyAdapter adapter;

    private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
    private final String JSON_FILE = "mountains.json";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adapter = new MyAdapter();
        new JsonTask(this).execute(JSON_URL);

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager( this));
    }

    @Override
    public void onPostExecute(String json) {
        Gson gson = new Gson();
        Mountains mountains[];
        mountains = gson.fromJson(json, Mountains[].class);
        List<Mountains> newMountains = new ArrayList<>();
        for (int i = 0; i < mountains.length; i++) {
            Log.d("MainActivity ==>", "Hittade ett berg:" +mountains[i].getName());
            newMountains.add(mountains[i]);
        }
        Log.d("MainActivity", json);
        adapter.setMountains(newMountains);
        adapter.notifyDataSetChanged();
    }

}
