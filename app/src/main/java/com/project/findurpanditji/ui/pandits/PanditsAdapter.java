package com.project.findurpanditji.ui.pandits;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.findurpanditji.R;
import com.project.findurpanditji.RecyclerViewClickListener;
import com.project.findurpanditji.ui.gods.GodsClass;

import java.util.ArrayList;
import java.util.List;

public class PanditsAdapter extends RecyclerView.Adapter {
    public List<PanditsClass> panditsArrayList;
    private RecyclerViewClickListener panditViewClickListener;
    Context context;

    public PanditsAdapter(List<PanditsClass> panditsArrayList, Context context, RecyclerViewClickListener panditViewClickListener) {
        this.panditsArrayList = panditsArrayList;
        this.context = context;
        this.panditViewClickListener = panditViewClickListener;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pandits_view_layout, parent, false);
        return new PanditsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, final int position) {
        final PanditsViewHolder panditsViewHolder= (PanditsViewHolder) holder;
        panditsViewHolder.panditName.setText(panditsArrayList.get(position).getPanditName());
        //getting the dynamic image through the picasso
//        Picasso.get()
//                .load(panditsArrayList.get(position).getImageLink())
//                .resize(50,50)
//                .into(panditsViewHolder.panditImageView);


        //setting the click event for the images
        panditsViewHolder.panditImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(panditsViewHolder,position);
//                panditViewClickListener.recyclerViewListClicked(panditsViewHolder.panditImageView,position);
            }
        });
    }

    private void showPopup(PanditsViewHolder panditsViewHolder,int position) {
        View popupView = LayoutInflater.from(context).inflate(R.layout.pandits_popup_window_layout,null);
        final PopupWindow popupWindow = new PopupWindow(popupView, WindowManager.LayoutParams.WRAP_CONTENT,WindowManager.LayoutParams.WRAP_CONTENT);
        ImageView closeImage = popupView.findViewById(R.id.pandits_popup_window_layout_iv_close);
        ImageView profileImage = popupView.findViewById(R.id.pandits_popup_window_layout_iv_pandit);
        TextView panditName = popupView.findViewById(R.id.pandits_popup_window_layout_tv_name);
        TextView panditEmail = popupView.findViewById(R.id.pandits_popup_window_layout_tv_email);
        TextView panditAddress = popupView.findViewById(R.id.pandits_popup_window_layout_tv_address);
        TextView panditContactNo = popupView.findViewById(R.id.pandits_popup_window_layout_tv_contact_no);
        Button btnBook = popupView.findViewById(R.id.pandits_popup_window_layout_btn_book);  //for the booking button

        //setting the values for the fields
        panditName.setText(panditsArrayList.get(position).getPanditName());
        panditEmail.setText(panditsArrayList.get(position).getEmail());
        panditAddress.setText(panditsArrayList.get(position).getAddress());
        panditContactNo.setText(panditsArrayList.get(position).getContact_no());

        closeImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                popupWindow.dismiss();
            }
        });
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                popupWindow.dismiss();
                Toast.makeText(context, "Pandit booked", Toast.LENGTH_SHORT).show();
            }
        });
//        popupWindow.showAsDropDown(popupView,200,250);
        popupWindow.showAtLocation(popupView, Gravity.CENTER,0,0);
    }


    @Override
    public int getItemCount() {
        return panditsArrayList.size();
    }

    public class PanditsViewHolder extends RecyclerView.ViewHolder implements RecyclerViewClickListener{
        ImageView panditImageView;
        TextView panditName;

        public PanditsViewHolder(@NonNull View itemView) {
            super(itemView);
            panditName = itemView.findViewById(R.id.pandits_view_layout_pandit_name);
            panditImageView = itemView.findViewById(R.id.pandits_view_layout_image);
            panditImageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //printing  a toast
                    Toast.makeText(panditImageView.getContext(), panditsArrayList.get(getAdapterPosition()).getPanditName()+"image is clicked!!", Toast.LENGTH_SHORT).show();

                }
            });
        }

        @Override
        public void recyclerViewListClicked(View v, int position) {
            panditViewClickListener.recyclerViewListClicked(v,this.getLayoutPosition());
        }
    }
}
