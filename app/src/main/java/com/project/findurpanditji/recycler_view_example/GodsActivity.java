package com.project.findurpanditji.recycler_view_example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.project.findurpanditji.R;
import com.project.findurpanditji.ui.gods.GodsClass;

import java.util.ArrayList;

public class GodsActivity extends AppCompatActivity {
    RecyclerView godsList;
    Context context;
//    LinearLayoutManager linearLayoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gods);

        godsList = findViewById(R.id.god_recycler_view);
        ArrayList<com.project.findurpanditji.recycler_view_example.GodsClass> godsArrayList = new ArrayList<>();

        com.project.findurpanditji.recycler_view_example.GodsClass shiv = new com.project.findurpanditji.recycler_view_example.GodsClass();
        shiv.setGodName("Shiv ji");
        shiv.setImageLink("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfUMEp_iVfRA14ryh-iLNZbU0okTq6Rpgl92MG4dqMctNVpuzv&s");

        com.project.findurpanditji.recycler_view_example.GodsClass laxmi = new com.project.findurpanditji.recycler_view_example.GodsClass();
        laxmi.setGodName("Laxmi ji");
        laxmi.setImageLink("https://i.pinimg.com/236x/80/69/4f/80694fbe02b3a63f776cb6bdf91e5716--indian-gods-hindu-deities.jpg");

        com.project.findurpanditji.recycler_view_example.GodsClass ldvnld = new com.project.findurpanditji.recycler_view_example.GodsClass();
        ldvnld.setGodName("slknlncl");
        ldvnld.setImageLink("https://i.pinimg.com/236x/80/69/4f/80694fbe02b3a63f776cb6bdf91e5716--indian-gods-hindu-deities.jpg");

        com.project.findurpanditji.recycler_view_example.GodsClass oj = new com.project.findurpanditji.recycler_view_example.GodsClass();
        oj.setGodName("scs");
        oj.setImageLink("https://i.pinimg.com/236x/80/69/4f/80694fbe02b3a63f776cb6bdf91e5716--indian-gods-hindu-deities.jpg");

        godsArrayList.add(shiv);
        godsArrayList.add(oj);
        godsArrayList.add(laxmi);
        godsArrayList.add(ldvnld);

        //change it to the list view because of some good reasons
        com.project.findurpanditji.recycler_view_example.GodsAdapter godsAdapter = new GodsAdapter(godsArrayList,this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        godsList.setLayoutManager(linearLayoutManager);
        godsList.setAdapter(godsAdapter);   //setting the adapter
        Log.i("GODS",""+godsArrayList);
    }
}
