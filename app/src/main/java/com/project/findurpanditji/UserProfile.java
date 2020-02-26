package com.project.findurpanditji;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserProfile extends AppCompatActivity {

    TextView name,username,emailID,dateOfBirth,gender,contactNo,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_profile_layout);

        name = findViewById(R.id.user_profile_layout_tv_name);
        username = findViewById(R.id.user_profile_layout_tv_username);
        emailID = findViewById(R.id.user_profile_layout_tv_email);
        contactNo = findViewById(R.id.user_profile_layout_tv_contact_no);
        dateOfBirth = findViewById(R.id.user_profile_layout_tv_date_of_birth);
        gender = findViewById(R.id.user_profile_layout_tv_gender);
        address = findViewById(R.id.user_profile_layout_tv_address);

    }
}
