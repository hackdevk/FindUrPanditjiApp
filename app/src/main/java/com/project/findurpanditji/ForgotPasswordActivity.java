package com.project.findurpanditji;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import es.dmoral.toasty.Toasty;

public class ForgotPasswordActivity extends AppCompatActivity {

    EditText oldPassword;
    EditText newPassword,cnfrmPassword;
    Button resetBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        oldPassword = findViewById(R.id.activity_forgot_pswd_et_pswd_old);
        newPassword = findViewById(R.id.activity_forgot_pswd_et_pswd_new);
        cnfrmPassword = findViewById(R.id.activity_forgot_pswd_et_cnfrm_pswd);
        resetBtn = findViewById(R.id.activity_forgot_pswd_btn_reset);

        


//        //setting the login btn for logging in

//                if(email.isEmpty()) {
//                    emailField.setError("Please enter your username");
//                    emailField.requestFocus();
//                } else if(password.isEmpty()) {
//                    passwordField.setError("Please enter your password");
//                    passwordField.requestFocus();
//                } else if(panditOption.isEmpty() || jajmanOption.isEmpty()) {
//                    panditRadio.setError("Please enter choose whether you are a pandit or jajman");
//                    panditRadio.requestFocus();
//                } else if(email.isEmpty() && password.isEmpty() ) {
//                    Toast.makeText(LoginActivity.this, "Fill out the fields in the form!!", Toast.LENGTH_SHORT).show();
//                } else if(!(email.isEmpty() && password.isEmpty() )) {
//                    //here we will write the logic of ours for storing the informstion which the user has providede

            }
}
