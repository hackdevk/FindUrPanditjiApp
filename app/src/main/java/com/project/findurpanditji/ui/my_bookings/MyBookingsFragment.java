package com.project.findurpanditji.ui.my_bookings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.project.findurpanditji.R;

public class MyBookingsFragment extends Fragment {

    private BookingsViewModel bookingsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        bookingsViewModel =
                ViewModelProviders.of(this).get(BookingsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_my_bookings, container, false);
//        final TextView textView = root.findViewById(R.id.text_home);
//        bookingsViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }
}