package com.project.findurpanditji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class SplashActivity extends AppCompatActivity {
    Button loginBtn,signupBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        loginBtn = findViewById(R.id.activity_splash_btn_login);
        signupBtn = findViewById(R.id.activity_splash_btn_signup);

//        getActionBar().hide();  //for hiding the action bar from this activity
        //code for the splash screen
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent splashIntent = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(splashIntent);
                finish();  //for to avoiding to not go back in the spalsh activity from the login or any other  activity

            }
        },900000000);

        //handling the buttons for the login and signup
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(SplashActivity.this,LoginActivity.class);
                startActivity(loginIntent);
            }
        });

        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent signupIntent = new Intent(SplashActivity.this,SignupActivity.class);
                startActivity(signupIntent);
            }
        });
    }
}
