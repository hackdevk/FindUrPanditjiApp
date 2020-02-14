package com.project.findurpanditji.recycler_view_example;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.findurpanditji.R;

import java.util.ArrayList;

public class GodsAdapter extends RecyclerView.Adapter {
    public ArrayList<GodsClass>godsArrayList;
    Context context;

    public GodsAdapter(ArrayList<GodsClass> godsArrayList, Context context) {
        this.godsArrayList = godsArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gods_view_layout,parent,false);
        return new GodsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        GodsViewHolder godsViewHolder = (GodsViewHolder) holder;
        godsViewHolder.godName.setText(godsArrayList.get(position).getGodName());
        //getting the static image
//        godsViewHolder.godImageView.setImageResource(godsArrayList.get(position).getImageLink());
    }

    @Override
    public int getItemCount() {
        return godsArrayList.size();
    }

    public class GodsViewHolder extends RecyclerView.ViewHolder {
        ImageView godImageView;
        TextView godName;

        public GodsViewHolder(@NonNull View itemView) {
            super(itemView);
            godImageView = itemView.findViewById(R.id.gods_view_layout_image);
            godName = itemView.findViewById(R.id.gods_view_layout_god_name);
        }
    }
}
