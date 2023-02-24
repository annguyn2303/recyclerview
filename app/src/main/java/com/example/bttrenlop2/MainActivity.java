package com.example.bttrenlop2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private LinkedList<String> mWordList = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWordList.add("SQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("QL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SaQL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQdL");
        mWordList.add("Java");
        mWordList.add("C#");
        mWordList.add("SQLg");
        mWordList.add("Java");
        mWordList.add("C#");
        mRecyclerView = findViewById(R.id.recycleview);
        mAdapter = new WordListAdapter(this, mWordList);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}