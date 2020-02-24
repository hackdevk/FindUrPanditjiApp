package com.project.findurpanditji.ui.gods;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.project.findurpanditji.R;
import com.project.findurpanditji.RecyclerViewClickListener;
//import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class GodsAdapter extends RecyclerView.Adapter {
    public ArrayList<GodsClass> godsArrayList;
    private RecyclerViewClickListener godViewClickListener;
    Context context;

    public GodsAdapter(ArrayList<GodsClass> godsArrayList, Context context,RecyclerViewClickListener godViewClickListener) {
        this.godsArrayList = godsArrayList;
        this.context = context;
        this.godViewClickListener = godViewClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gods_view_layout, parent, false);
        return new GodsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final GodsViewHolder godsViewHolder = (GodsViewHolder) holder;
        godsViewHolder.godName.setText(godsArrayList.get(position).getGodName());
        //getting the dynamic image through the picasso
        Glide.with(context)
                .load(godsArrayList.get(position).getImageLink())
                .into(godsViewHolder.godImageView);

//                .preload(50,50)(godsViewHolder.godImageView);

//        Picasso.with(godsViewHolder.godImageView.getContext())
//                .load(godsArrayList.get(position).getImageLink())
//                .resize(50,50)
//                .into(godsViewHolder.godImageView);
//        godsViewHolder.godImageView.setImageResource(godsArrayList.get(position).getImageLink());

        //setting the click event for the images
        godsViewHolder.godImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                godViewClickListener.recyclerViewListClicked(godsViewHolder.godImageView,position);
            }
        });
    }


    //trying to add intent for each item in the list for viewin the god's pages
//    public void clickGod(int position) {
//        if(godsArrayList.get(position).getGodName() == "shiv") {
//            Intent shivIntent = new Intent(, Shiv.class);
//            startActivity(shivIntent);
//
//
//        }



    @Override
    public int getItemCount() {
        return godsArrayList.size();
    }

    public class GodsViewHolder extends RecyclerView.ViewHolder implements RecyclerViewClickListener{
        ImageView godImageView;
        TextView godName;

        public GodsViewHolder(@NonNull View itemView) {
            super(itemView);
            godName = itemView.findViewById(R.id.gods_view_layout_god_name);
            godImageView = itemView.findViewById(R.id.gods_view_layout_image);
            godImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //printing  a toast
                    Toast.makeText(godImageView.getContext(), godsArrayList.get(getAdapterPosition()).getGodName()+"image is clicked!!", Toast.LENGTH_SHORT).show();
                }
            });
        }

        @Override
        public void recyclerViewListClicked(View v, int position) {
            godViewClickListener.recyclerViewListClicked(v,this.getLayoutPosition());
        }
    }
}
