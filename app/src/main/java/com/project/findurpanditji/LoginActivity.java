package com.project.findurpanditji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.project.findurpanditji.ui.gods.GodsFragment;
import com.project.findurpanditji.ui.home.HomeFragment;

public class LoginActivity extends AppCompatActivity {
    EditText emailField ;
    EditText passwordField;
    TextView signupText;
    Button loginBtn;
    RadioButton panditRadio, jajmanRadio;
    FirebaseAuth mFirebaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailField = findViewById(R.id.activity_login_et_email);
        passwordField = findViewById(R.id.activity_login_et_password);
        loginBtn = findViewById(R.id.activity_login_btn_loginBtn);
        signupText = findViewById(R.id.activity_login_tv_signup_link);
        panditRadio = findViewById(R.id.activity_login_rb_pandit);
        jajmanRadio = findViewById(R.id.activity_login_rb_jajman);

        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser mFirebaseUser = mFirebaseAuth.getCurrentUser();
                if(mFirebaseUser != null) {
                    Toast.makeText(LoginActivity.this, "You are Logged in!!", Toast.LENGTH_SHORT).show();
                    Intent loginIntent = new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(loginIntent);
                } else  {
                    Toast.makeText(LoginActivity.this, "Please Login!!", Toast.LENGTH_SHORT).show();
                }
            }
        };

        //making the text clickable
        SpannableString spannableString = new SpannableString("Don't have an account yet!! Signup");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                startActivity(new Intent(LoginActivity.this,SignupActivity.class));
            }
        };
        spannableString.setSpan(clickableSpan,28,34, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        signupText.setText( spannableString);
        signupText.setMovementMethod(LinkMovementMethod.getInstance());


        //temporary code for logging in
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "User logged in", Toast.LENGTH_SHORT).show();
                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(loginIntent);
            }
        });
//        //setting the login btn for logging in
//        loginBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                //getting the vslues and storing them in strings
//                String email = emailField.getText().toString();
//                String password = passwordField.getText().toString();
//                //for getting the values of the radio buttons
//                String panditOption = panditRadio.getText().toString();
//                String jajmanOption = jajmanRadio.getText().toString();
//                //checking whether any field is empty or not
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
//                    mFirebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                            if(!task.isSuccessful()){
//                                Toast.makeText(LoginActivity.this, "Plesse login!!", Toast.LENGTH_SHORT).show();
//                            } else {
//                                Toast.makeText(LoginActivity.this, "Welcome User", Toast.LENGTH_SHORT).show();
//                                Intent loginIntent = new Intent(LoginActivity.this, MainActivity.class);
//                                startActivity(loginIntent);
//                            }
//                        }
//                    });
//
//                } else {
//                    //this is fo when any unexpected error comes
//                    Toast.makeText(LoginActivity.this, "Some Error Occurred!!", Toast.LENGTH_SHORT).show();
//                }
//
//            }
//        });
    }
}
