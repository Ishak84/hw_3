package com.geeks.hw_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UfcAdapter extends RecyclerView.Adapter<UfcViewHolder> {

    private ArrayList<String> ufcNameList;

    public UfcAdapter(ArrayList<String> ufcNameList) {
        this.ufcNameList = ufcNameList;
    }

    @NonNull
    @Override
    public UfcViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UfcViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.ufc_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UfcViewHolder holder, int position) {
        holder.bind(ufcNameList.get(position));
    }

    @Override
    public int getItemCount() {
        return ufcNameList.size();
    }
}
