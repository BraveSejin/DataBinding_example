package com.bravesejin.databindingexample;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.bravesejin.databindingexample.databinding.ItemUserBinding;

public class UserViewHolder extends RecyclerView.ViewHolder {

    ItemUserBinding binding;

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        binding= DataBindingUtil.bind(itemView);
    }
}
