package com.project.findurpanditji.ui.gods;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

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

public class GodsFragment extends Fragment {

    private GodsViewModel toolsViewModel;
    private RecyclerView godsList;
    private RecyclerViewClickListener godViewClickListener;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        toolsViewModel =
                ViewModelProviders.of(this).get(GodsViewModel.class);
        View  view = inflater.inflate(R.layout.fragment_gods, container,  false);

//        final TextView textView = root.findViewById(R.id.text_tools);

        toolsViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                Log.e("tools", s);
            }
        });

        //my code
//        generateList();
        //code for the recycler view
        godsList = view.findViewById(R.id.gods_recycler_view);
        godViewClickListener = new RecyclerViewClickListener() {
            @Override
            public void recyclerViewListClicked(View v, int position) {
                if(position == 0){
                    Intent shivaFragment = new Intent(getContext(),ShivaActivity.class);
                    startActivity(shivaFragment); //this will opens the shiva activity
                } else if(position == 1) {
                    Intent laxmiFragment = new Intent(getContext(),LaxmiActivity.class);
                    startActivity(laxmiFragment);
                }  else if(position == 2) {
                    Intent vishnuFragment = new Intent(getContext(),VishnuActivity.class);
                    startActivity(vishnuFragment);
                } else if(position == 3) {
                    Intent durgaFragment = new Intent(getContext(),DurgaActivity.class);
                    startActivity(durgaFragment);
                } else if(position == 4) {
                    Intent ganeshFragment = new Intent(getContext(),GaneshActivity.class);
                    startActivity(ganeshFragment);
                } else if(position == 5) {
                    Intent saraswatiFragment = new Intent(getContext(),SaraswatiActivity.class);
                    startActivity(saraswatiFragment);
                } else if(position == 6) {
                    Toast.makeText(getContext(), "Bhoomi is clicked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(getContext(), position+ "is clicked", Toast.LENGTH_SHORT).show();
                }
            }
        };
        showGodList();

        return view ;
    }

    //function for the showing the god's list
    public void showGodList() {
        ArrayList<GodsClass> godsArrayList = new ArrayList<>();

        GodsClass shiv = new GodsClass();
        shiv.setGodName("Shiv ji");
        shiv.setImageLink("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfUMEp_iVfRA14ryh-iLNZbU0okTq6Rpgl92MG4dqMctNVpuzv&s");

        GodsClass laxmi = new GodsClass();
        laxmi.setGodName("Laxmi ji");
        laxmi.setImageLink("https://i.pinimg.com/236x/80/69/4f/80694fbe02b3a63f776cb6bdf91e5716--indian-gods-hindu-deities.jpg");

        GodsClass vishnu = new GodsClass();
        vishnu.setGodName("Vishnu ji");
        vishnu.setImageLink("https://www.templepurohit.com/wp-content/uploads/2016/12/Why-is-Lord-Vishnu-Blue-in-Color.jpg");

        GodsClass durga= new GodsClass();
        durga.setGodName("Durga ji");
        durga.setImageLink("https://images-na.ssl-images-amazon.com/images/I/91RigFz8cML._SY355_.png");

        GodsClass ganesh = new GodsClass();
        ganesh.setGodName("Ganesh ji");
        ganesh.setImageLink("https://www.thestatesman.com/wp-content/uploads/2019/08/ganesh.jpg");

        GodsClass saraswati = new GodsClass();
        saraswati.setGodName("Saraswati ji");
        saraswati.setImageLink("https://www.pavitrajyotish.com/wp-content/uploads/2016/02/Saraswati-Puja-By-PavitraJyotish.jpg");

        GodsClass bhoomi = new GodsClass();
        bhoomi.setGodName("Bhoomi ji");
        bhoomi.setImageLink("data:image/jpeg;base64,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");

        //adding the god references to the array list
        godsArrayList.add(shiv);
        godsArrayList.add(laxmi);
        godsArrayList.add(vishnu);
        godsArrayList.add(durga);
        godsArrayList.add(ganesh);
        godsArrayList.add(saraswati);
        godsArrayList.add(bhoomi);

        //printing the log mesage
//        Log.i("GOD",""+laxmi.getGodName()+"," +ldmew.getGodName()+"," +shiv.getGodName());

        //change it to the list view because of some good reasons
        GodsAdapter godsAdapter = new GodsAdapter(godsArrayList, getContext(),godViewClickListener);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        godsList.setLayoutManager(linearLayoutManager);    //setting the layout manager
        godsList.setAdapter(godsAdapter);   //setting the adapter
        Log.i("GODS",""+godsArrayList);


//        godsName = {"Shiv ji","Laxmi ji","Vishnu ji","Durga ji","Ganesh ji"
//                ,"Saraswati ji","Bhomi ji"};

    }
    //for generating the recycler view for the gods data and its list
//    public void generateList() {

//        godsList = getView().findViewById(R.id.gods_recycler_view);
//        godsList = root.findViewById(R.id.gods_recycler_view);
//        ArrayList<GodsClass> godsArrayList = new ArrayList<>();
//        GodsClass shiv = new GodsClass();
//        shiv.setGodName("Shiv ji");
//        shiv.setImageLink("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTfUMEp_iVfRA14ryh-iLNZbU0okTq6Rpgl92MG4dqMctNVpuzv&s");
//
//        GodsClass laxmi = new GodsClass();
//        shiv.setGodName("Laxmi ji");
//        shiv.setImageLink("https://i.pinimg.com/236x/80/69/4f/80694fbe02b3a63f776cb6bdf91e5716--indian-gods-hindu-deities.jpg");
//
//        godsArrayList.add(shiv);
//        godsArrayList.add(laxmi);
//        //change it to the list view because of some good reasons
//        GodsAdapter godsAdapter = new GodsAdapter(godsArrayList,getContext());
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        godsList.setLayoutManager(linearLayoutManager);
//        godsList.setAdapter(godsAdapter);   //setting the adapter
//        Log.i("GODS",""+godsArrayList);
//
////        godsName = {"Shiv ji","Laxmi ji","Vishnu ji","Durga ji","Ganesh ji"
////                ,"Saraswati ji","Bhomi ji"};


    }
//}