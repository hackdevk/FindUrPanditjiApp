package com.project.findurpanditji.ui.pujas;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.project.findurpanditji.R;
import com.project.findurpanditji.ui.pandits.PanditViewModel;

public class BhoomiPuja extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bhoomi_puja);
    }

//    private BhoomiPuja bhoomiPuja;

//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        bhoomiPuja = ViewModelProviders.of(this).get(BhoomiPuja.class);
//        View root = inflater.inflate(R.layout.activity_bhoomi_puja, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
////        bhoomiPuja.getText().observe(this, new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
//            }
//        });
//        return root;
//    }

}
