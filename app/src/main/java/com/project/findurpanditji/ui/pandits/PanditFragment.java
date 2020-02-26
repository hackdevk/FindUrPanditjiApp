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
import java.util.List;

public class PanditFragment extends Fragment {

    private PanditViewModel galleryViewModel;
    RecyclerView panditsRecyclerView;
    private List<PanditsClass> panditList;

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

        panditList = new ArrayList<>(); //making the array list
        panditsRecyclerView = view.findViewById(R.id.pandit_recycler_list); //getting the recycler view
        showPanditList(); //calling the method to add the items in the recycler view
        return view;
    }

    public void showPanditList() {

        PanditsClass pandit1 = new PanditsClass();
        pandit1.setPanditName("Pt Acharya Rajesh");
        pandit1.setEmail("acharyaRajesh@gmail.com");
        pandit1.setContact_no("+91 9009 444 403");
        pandit1.setAddress("113 junior mig subhash");
        pandit1.setImageLink("  ");

        PanditsClass pandit2 = new PanditsClass();
        pandit2.setPanditName("Pt Ashok Shastri");
        pandit2.setEmail("acharyaRajesh@gmail.com");
        pandit2.setContact_no("+91 9009 444 403");
        pandit2.setAddress("113 junior mig subhash");
        pandit2.setImageLink("");

        PanditsClass pandit3 = new PanditsClass();
        pandit3.setPanditName("Pt Sanjay Sharma");
        pandit3.setEmail("acharyaRajesh@gmail.com");
        pandit3.setContact_no("+91 9009 444 403");
        pandit3.setAddress("113 junior mig subhash");
        pandit3.setImageLink("");

        PanditsClass pandit4 = new PanditsClass();
        pandit4.setPanditName("Pt Acharya Sri Guruji");
        pandit4.setEmail("acharyaRajesh@gmail.com");
        pandit4.setContact_no("+91 9009 444 403");
        pandit4.setAddress("113 junior mig subhash");
        pandit4.setImageLink("");

        PanditsClass pandit5 = new PanditsClass();
        pandit5.setPanditName("Pt C I Panchal");
        pandit5.setEmail("acharyaRajesh@gmail.com");
        pandit5.setContact_no("+91 9009 444 403");
        pandit5.setAddress("113 junior mig subhash");
        pandit5.setImageLink("");

        PanditsClass pandit6 = new PanditsClass();
        pandit6.setPanditName("Pt Vinod Gautam");
        pandit6.setEmail("acharyaRajesh@gmail.com");
        pandit6.setContact_no("+91 9009 444 403");
        pandit6.setAddress("113 junior mig subhash");
        pandit6.setImageLink("");

        PanditsClass pandit7 = new PanditsClass();
        pandit7.setPanditName("Pt Vaidhik");
        pandit7.setEmail("acharyaRajesh@gmail.com");
        pandit7.setContact_no("+91 9009 444 403");
        pandit7.setAddress("113 junior mig subhash");
        pandit7.setImageLink("");

        PanditsClass pandit8 = new PanditsClass();
        pandit8.setPanditName("Pt Rajesh Dubey");
        pandit8.setEmail("acharyaRajesh@gmail.com");
        pandit8.setContact_no("+91 9009 444 403");
        pandit8.setAddress("113 junior mig subhash");
        pandit8.setImageLink("");

        PanditsClass pandit9 = new PanditsClass();
        pandit9.setPanditName("Pt Narendra Shrivastava");
        pandit9.setEmail("acharyaRajesh@gmail.com");
        pandit9.setContact_no("+91 9009 444 403");
        pandit9.setAddress("113 junior mig subhash");
        pandit9.setImageLink("");

        PanditsClass pandit10 = new PanditsClass();
        pandit10.setPanditName("Pt Acharya Sri Guruji");
        pandit10.setEmail("acharyaRajesh@gmail.com");
        pandit10.setContact_no("+91 9009 444 403");
        pandit10.setAddress("113 junior mig subhash");
        pandit10.setImageLink("");

        PanditsClass pandit11 = new PanditsClass();
        pandit11.setPanditName("Pt Acharya Panchal Jyotish");
        pandit11.setEmail("acharyaRajesh@gmail.com");
        pandit11.setContact_no("+91 9009 444 403");
        pandit11.setAddress("113 junior mig subhash");
        pandit11.setImageLink("");

        PanditsClass pandit12 = new PanditsClass();
        pandit12.setPanditName("Pt Swarn Sagar");
        pandit12.setEmail("acharyaRajesh@gmail.com");
        pandit12.setContact_no("+91 9009 444 403");
        pandit12.setAddress("113 junior mig subhash");
        pandit12.setImageLink("");

        PanditsClass pandit13 = new PanditsClass();
        pandit13.setPanditName("Pt  Satakshi Jyotishudh Sanstha");
        pandit13.setEmail("acharyaRajesh@gmail.com");
        pandit13.setContact_no("+91 9009 444 403");
        pandit13.setAddress("113 junior mig subhash");
        pandit13.setImageLink("");

        PanditsClass pandit14 = new PanditsClass();
        pandit14.setPanditName("Pt Acharya P Laxminarayan");
        pandit14.setEmail("acharyaRajesh@gmail.com");
        pandit14.setContact_no("+91 9009 444 403");
        pandit14.setAddress("113 junior mig subhash");
        pandit14.setImageLink("");

        PanditsClass pandit15 = new PanditsClass();
        pandit15.setPanditName("Pt Mishra Pujapath");
        pandit15.setEmail("acharyaRajesh@gmail.com");
        pandit15.setContact_no("+91 9009 444 403");
        pandit15.setAddress("113 junior mig subhash");
        pandit15.setImageLink("");

        PanditsClass pandit16 = new PanditsClass();
        pandit16.setPanditName("Pt Sundar Lala Shastri");
        pandit16.setEmail("acharyaRajesh@gmail.com");
        pandit16.setContact_no("+91 9009 444 403");
        pandit16.setAddress("113 junior mig subhash");
        pandit16.setImageLink("");

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