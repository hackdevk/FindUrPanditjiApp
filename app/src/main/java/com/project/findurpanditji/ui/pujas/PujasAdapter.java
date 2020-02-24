package com.project.findurpanditji.ui.pujas;

import android.content.Context;
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
import com.project.findurpanditji.ui.gods.GodsClass;

import java.util.ArrayList;

public class PujasAdapter extends RecyclerView.Adapter {
    ArrayList<PujasClass>pujasArrayList;
    Context context;
    //for getting the clicked item in the recycler view
    private static RecyclerViewClickListener itemListener;

    public PujasAdapter(ArrayList<PujasClass> pujasArrayList, Context context, RecyclerViewClickListener itemListener) {
        this.pujasArrayList = pujasArrayList;
        this.context = context;
        this.itemListener = itemListener;

    }
//    public PujasAdapter(ArrayList<PujasClass> pujasArrayList, Context context) {
//        this.pujasArrayList = pujasArrayList;
//        this.context = context;
//    }
//    public void getItem() {
//        pujasArrayList.
//    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pujas_view_layout,parent,false);
        return new PujasViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RecyclerView.ViewHolder holder, final int position) {
        PujasViewHolder pujasViewHolder = (PujasViewHolder) holder;
        pujasViewHolder.pujaName.setText(pujasArrayList.get(position).getPujaName());
        //getting the static image
        Glide.with(context)
                .load(pujasArrayList.get(position).getImageLink())
                .into(pujasViewHolder.pujaImageView);
//        Picasso.with(pujasViewHolder.pujaImageView.getContext())
//                .load(pujasArrayList.get(position).getImageLink())
//                .resize(50,50)
//                .into(pujasViewHolder.pujaImageView);
//        godsViewHolder.godImageView.setImageResource(godsArrayList.get(position).getImageLink());
        pujasViewHolder.pujaImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemListener.recyclerViewListClicked(((PujasViewHolder) holder).pujaImageView,position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return pujasArrayList.size();
    }

    public class PujasViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView pujaImageView;
        TextView pujaName;

        public PujasViewHolder(@NonNull View itemView) {
            super(itemView);
            pujaName = itemView.findViewById(R.id.pujas_view_layout_puja_name);
            pujaImageView = itemView.findViewById(R.id.pujas_view_layout_image);
//            pujaImageView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Toast.makeText(pujaImageView.getContext(), "clicked in a image", Toast.LENGTH_SHORT).show();
//                }
//            });

//            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            itemListener.recyclerViewListClicked(v,this.getLayoutPosition());
        }
    }
}
