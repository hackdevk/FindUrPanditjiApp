package com.project.findurpanditji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class FillUserProfileActivity extends AppCompatActivity {

    EditText address,contactNo;
    Button submit;
    RadioButton male,female;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fill_user_profile);

        male = findViewById(R.id.activity_fill_user_profile_rb_male);
        female = findViewById(R.id.activity_fill_user_profile_rb_female);
        address = findViewById(R.id.activity_fill_user_profile_et_address);
        contactNo = findViewById(R.id.activity_fill_user_profile_et_contact_no);
        submit = findViewById(R.id.activity_fill_user_profile_btn_submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent slnls = new Intent(FillUserProfileActivity.this,UserProfile.class);
                startActivity(slnls);
            }
        });

    }
}
