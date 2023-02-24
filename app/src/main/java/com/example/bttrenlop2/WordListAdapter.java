package com.example.bttrenlop2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.LinkedList;


public class WordListAdapter extends RecyclerView.Adapter<WordViewHolder> {
    private final LayoutInflater mInfalter;
    private LinkedList<String> mWordList = new LinkedList<>();

    public WordListAdapter(Context context, LinkedList<String> wordList) {
        mInfalter = LayoutInflater.from(context);
        this.mWordList = wordList;
    }


    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View mItemView = mInfalter.inflate(R.layout.layoutdechi, parent, false);

        return new WordViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(@NonNull WordViewHolder holder, int position) {
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }
}
