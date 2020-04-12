package com.examplevinhphutvp.recyclerview25022020;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ItemViewHolder> {

    private ArrayList<User> mArrayUsers;

    public UserAdapter() {
        mArrayUsers = new ArrayList<>();
    }

    public void submitData(ArrayList<User> arrayUsers){
        if (arrayUsers!= null){
            mArrayUsers.clear();
            mArrayUsers.addAll(arrayUsers);
            notifyDataSetChanged();
        }
    }
    public void addItem(User user){
        if (user != null){
            mArrayUsers.add(user);
            notifyDataSetChanged();
        }
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout_uer,null,true);
        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder holder, int position) {
        User user = mArrayUsers.get(position);
        holder.mImeage.setImageResource(user.getImage());
        holder.mTvName.setText(user.getName());
        holder.mTvAge.setText(user.getAge());
    }

    @Override
    public int getItemCount() {
        return mArrayUsers.size();
    }

    class ItemViewHolder extends RecyclerView.ViewHolder {

        ImageView mImeage;
        TextView mTvName , mTvAge;
        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            mTvAge = itemView.findViewById(R.id.textviewAge);
            mImeage = itemView.findViewById(R.id.imageview);
            mTvName = itemView.findViewById(R.id.textviewName);
        }
    }
}
