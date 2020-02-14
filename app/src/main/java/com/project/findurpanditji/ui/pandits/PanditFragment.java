package com.project.findurpanditji.ui.pandits;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.findurpanditji.R;
import com.project.findurpanditji.RecyclerViewClickListener;

import java.util.ArrayList;

public class PanditFragment extends Fragment {

    private PanditViewModel galleryViewModel;
    RecyclerView panditsRecyclerView;
    private RecyclerViewClickListener panditViewClickListener;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        galleryViewModel =
                ViewModelProviders.of(this).get(PanditViewModel.class);
        View view = inflater.inflate(R.layout.fragment_pandits, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
//        galleryViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });

        panditsRecyclerView = view.findViewById(R.id.pandit_recycler_list);
        showPanditList();
        return view;
    }

    private void showPanditList() {
        ArrayList<PanditsClass> panditList = new ArrayList<>();
        PanditsClass pandit1 = new PanditsClass();
        pandit1.setPanditName("Pt Acharya Rajesh");
        pandit1.setImageLink("  ");

        PanditsClass pandit2 = new PanditsClass();
        pandit1.setPanditName("Pt Ashok Shastri");
        pandit1.setImageLink("");

        PanditsClass pandit3 = new PanditsClass();
        pandit1.setPanditName("Pt Sanjay Sharma");
        pandit1.setImageLink("");

        PanditsClass pandit4 = new PanditsClass();
        pandit1.setPanditName("Pt Acharya Sri Guruji");
        pandit1.setImageLink("");

        PanditsClass pandit5 = new PanditsClass();
        pandit1.setPanditName("Pt C I Panchal");
        pandit1.setImageLink("");

        PanditsClass pandit6 = new PanditsClass();
        pandit1.setPanditName("Pt Vinod Gautam");
        pandit1.setImageLink("");

        PanditsClass pandit7 = new PanditsClass();
        pandit1.setPanditName("Pt Vaidhik");
        pandit1.setImageLink("");

        PanditsClass pandit8 = new PanditsClass();
        pandit1.setPanditName("Pt Rajesh Dubey");
        pandit1.setImageLink("");

        PanditsClass pandit9 = new PanditsClass();
        pandit1.setPanditName("Pt Narendra Shrivastava");
        pandit1.setImageLink("");

        PanditsClass pandit10 = new PanditsClass();
        pandit1.setPanditName("Pt Acharya Sri Guruji");
        pandit1.setImageLink("");

        PanditsClass pandit11 = new PanditsClass();
        pandit1.setPanditName("Pt Acharya Panchal Jyotish");
        pandit1.setImageLink("");

        PanditsClass pandit12 = new PanditsClass();
        pandit1.setPanditName("Pt Swarn Sagar");
        pandit1.setImageLink("");

        PanditsClass pandit13 = new PanditsClass();
        pandit1.setPanditName("Pt  Satakshi Jyotishudh Sanstha");
        pandit1.setImageLink("");

        PanditsClass pandit14 = new PanditsClass();
        pandit1.setPanditName("Pt Acharya P Laxminarayan");
        pandit1.setImageLink("");

        PanditsClass pandit15 = new PanditsClass();
        pandit1.setPanditName("Pt Mishra Pujapath");
        pandit1.setImageLink("");

        PanditsClass pandit16 = new PanditsClass();
        pandit1.setPanditName("Pt Sundar Lala Shastri");
        pandit1.setImageLink("");

        panditList.add(pandit1);
        panditList.add(pandit2);
        panditList.add(pandit3);
        panditList.add(pandit4);
        panditList.add(pandit5);
        panditList.add(pandit6);
        panditList.add(pandit7);
        panditList.add(pandit8);
        panditList.add(pandit9);
        panditList.add(pandit10);
        panditList.add(pandit11);
        panditList.add(pandit12);
        panditList.add(pandit13);
        panditList.add(pandit14);
        panditList.add(pandit15);
        panditList.add(pandit16);
        PanditsAdapter panditsAdapter = new PanditsAdapter(panditList,getContext(),panditViewClickListener);
        panditsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        panditsRecyclerView.setAdapter(panditsAdapter);



    }
}