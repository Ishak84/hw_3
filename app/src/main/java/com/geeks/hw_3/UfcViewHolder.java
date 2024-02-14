package com.geeks.hw_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class UfcViewHolder extends RecyclerView.ViewHolder {

    private TextView nameTv;
    public UfcViewHolder(@NonNull View itemView) {
        super(itemView);
        nameTv = itemView.findViewById(R.id.name_tv);
    }

    public void bind(String starName){
        nameTv.setText(starName);
    }
}
