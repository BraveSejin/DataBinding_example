package com.bravesejin.databindingexample;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserViewHolder> {
    private ArrayList<User> users;
    public UserAdapter() {
        users = new ArrayList<User>();
        users.add(new User("세진","",24));
        users.add(new User("세진","",24));
        users.add(new User("세진","",24));
    }

    @NonNull
    @Override

    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user, parent, false);
        return new UserViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User user = users.get(position);
        holder.binding.setUser(user);
    }


    @Override
    public int getItemCount() {
        return users.size();
    }
}
