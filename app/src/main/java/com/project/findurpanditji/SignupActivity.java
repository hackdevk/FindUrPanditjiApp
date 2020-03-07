package com.project.findurpanditji;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.gms.common.internal.service.Common;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.auth.User;

import es.dmoral.toasty.Toasty;

public class SignupActivity extends AppCompatActivity {
//    Button uploadBtn;
    Button signupBtn;
//    EditText nameField;
//    EditText usernameField;
    EditText passwordField;
    EditText cnfrmPasswordField;
    EditText emailField;
    RadioButton panditRadioBtn,jajmanRadioBtn;
    FirebaseAuth mFirebaseAuth; //for firebase authentication
    FirebaseFirestore firebaseFirestore;
//    DatabaseReference databaseReference;  //s;lslvdlavdsl;vndlavn;dalvndl;vnldsvn;ldsknvldsknvlskdnv
//    String userID; //for the unique userID provided by firebase

    //for the retrieval of our form data String variables are here
//    String name;
//    String username ;
//    String password;
//    String confirmPassword;
//    String email;
////    String userOption;
//    String panditRadioButton;

    DatabaseReference databaseUsers;   //for stroing the signup data
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        firebaseFirestore = FirebaseFirestore.getInstance();

//        databaseUsers = FirebaseDatabase.getInstance().getReference("USERS");

        if (databaseUsers == null) {
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            database.setPersistenceEnabled(true);
            databaseUsers = database.getReference("USERS");
            // ...
        }

//        FirebaseDatabase.getInstance().setPersistenceEnabled(true);

        //getting tthe firebase instance
        mFirebaseAuth = FirebaseAuth.getInstance();
        FirebaseUser currentUser = mFirebaseAuth.getCurrentUser();
//        upda(currentUser);

        //for sending the user to the main  activity class
//        if(mFirebaseAuth.getCurrentUser() != null) {
//            startActivity(new Intent(SignupActivity.this,MainActivity.class));
//            finish();
//        }

//        databaseUsers = FirebaseDatabase.getInstance().getReference("USERS");  //geettingthe database reference

        //getting the fileds
//        nameField = findViewById(R.id.activity_signup_et_name);
//        usernameField = findViewById(R.id.activity_signup_et_username);
        passwordField = findViewById(R.id.activity_signup_et_password);
        cnfrmPasswordField = findViewById(R.id.activity_signup_et_cnfrm_password);
        emailField = findViewById(R.id.activity_signup_et_email);
        signupBtn = findViewById(R.id.activity_signup_btn_submit_form);
        panditRadioBtn = findViewById(R.id.activity_signup_rb_pandit);
        jajmanRadioBtn = findViewById(R.id.activity_signup_rb_jajman);

        //things which will happen on the press of the signup button
        signupBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                if(Common.isConnectedToInternet(getBaseContext())) {
                //getting the vslues and storing them in strings
//                userOption;

                String password = passwordField.getText().toString().trim();
                String confirmPassword = cnfrmPasswordField.getText().toString().trim();
                String email = emailField.getText().toString().trim();
                //for getting the values of the radio buttons
                //checking whhether any of the radio button is selected and then storing the reaponse from any one of them

                RadioGroup radioGroup = findViewById(R.id.activity_signup_rg_category);
                //getting the vlaue from the radio button
                final String panditRadioButton =
                        ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId()))
                                .getText().toString();
                Log.i("USERTYPE",""+panditRadioButton);             //printing the user type
                radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        Toast.makeText(getBaseContext(), ""+panditRadioButton, Toast.LENGTH_SHORT).show();
                    }
                });
//                if(panditRadioBtn.isChecked() ) {
//                    userOption = "Pandit";
//                } else {
//                    userOption = "Jajman";
//                }
//                String panditOption = panditRadioBtn.getText().toString();
//                String jajmanOption = jajmanRadioBtn.getText().toString();

                //checking whether any field is empty or not
                    if (!email.equalsIgnoreCase("")) {
                            if (!password.equalsIgnoreCase("")) {
                        //this aproach worksss fineeee
                                mFirebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                                    @Override
                                    public void onComplete(@NonNull Task<AuthResult> task) {
                                        if(task.isSuccessful()) {
                                            Toast.makeText(SignupActivity.this, "User registered successfull", Toast.LENGTH_SHORT).show();
                                        } else {
                                            Log.e("error","registration failed " +task.getException().getMessage());
                                            Toast.makeText(SignupActivity.this, "not registereddd", Toast.LENGTH_SHORT).show();
                                        }
                                    }
                                });
                                //trying naother approach dkbvksdjvbdsjvbbsmdvmsdvsdmvsdmvdsv
//                                registerUser(username,name,email,password);
                            } else {
                                Toasty.error(SignupActivity.this, "Please Enter Password", Toast.LENGTH_SHORT).show();
                                Toast.makeText(SignupActivity.this, "pls enter password nd all thwat", Toast.LENGTH_SHORT).show();
                            }
                    }else {
                        Toasty.error(SignupActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                        Toast.makeText(SignupActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                }

//                if(name.isEmpty()) {
//                    nameField.setError("Please enter your name");
//                    nameField.requestFocus();
//                } else if(username.isEmpty()) {
//                    usernameField.setError("Please enter your username");
//                    usernameField.requestFocus();
//                } else if(password.isEmpty() || confirmPassword.isEmpty()) {
//                    passwordField.setError("Please enter your password");
//                    passwordField.requestFocus();
//                } else if(!(confirmPassword.equals(password))) {
//                    cnfrmPasswordField.setError("Passwords do not match");
//                    cnfrmPasswordField.requestFocus();
//                } else if(email.isEmpty()) {
//                    emailField.setError("Please enter your email");
//                    emailField.requestFocus();
//                }
//                else if(panditRadioButton.isEmpty()) {
//                    panditRadioBtn.setError("Please enter choose whether you are a pandit or jajman");
//                    panditRadioBtn.requestFocus();
//                }
//                else if(name.isEmpty() && username.isEmpty() && password.isEmpty() && confirmPassword.isEmpty() && email.isEmpty() ) {
//                    Toast.makeText(SignupActivity.this, "Fill out the fields in the form!!", Toast.LENGTH_SHORT).show();
//                } else if(!(name.isEmpty() && username.isEmpty() && password.isEmpty() && confirmPassword.isEmpty() && email.isEmpty() )) {
                    //here we will write the logic of ours for storing the informstion which the user has providede
//                    registerUser(username, name, email, password, confirmPassword);
//                    mFirebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(SignupActivity.this, new OnCompleteListener<AuthResult>() {
//                        @Override
//                        public void onComplete(@NonNull Task<AuthResult> task) {
//                        if(task.isSuccessful()){
//                                userID = mFirebaseAuth.getCurrentUser().getUid();
//                                //making object and calling constructor of thre modal class for our signu class
//                                final UserValuesClass signupUserValues = new UserValuesClass(name, username, password, confirmPassword, email, userOption, userID);
//
//                            databaseUsers.child(userID).setValue(signupUserValues).addOnCompleteListener(new OnCompleteListener<Void>() {
//                                @Override
//                                public void onComplete(@NonNull Task<Void> task) {
////                                    progressDialog.dismiss();
//                                    Toasty.success(SignupActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
//
//                                    if (!task.isSuccessful()) {
//                                        Toasty.error(SignupActivity.this,"Error registering user",Toast.LENGTH_SHORT).show();
//                                    } else {
//
//                                        startActivity(new Intent(SignupActivity.this, MainActivity.class));
//
//                                    }
//                                }
//                            });
//
//
//                            //stroingg the values of the signup class peviouss approach ---
////---------------------------------------------------------------------------------
////                                DocumentReference documentReference = firebaseFirestore.collection("users").document(userID);
////
////                            Map<String,Object> user = new HashMap<>();
////                            user.put("name",name);
////                            user.put("username",username);
//////                              users.put("password",name);
////                            user.put("email",email);
////                            user.put("userType",userOption);
////                            documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
////                                @Override
////                                public void onSuccess(Void aVoid) {
////                                    Log.d("TAG","user details added successfully");
////                                }
////                            });
////                            //for checking the errors
////                            DocumentSnapshot snapshot = (DocumentSnapshot) task.getResult();
////                            if(snapshot.exists()){
////                                Log.d("TAG", "DocumentSnapshot data: " + snapshot.getData());
////                            } else {
////                                Log.d("TAG", "No such document");
////                            }
//
//
//
////                            firebaseFirestore.collection("users")
////                                    .add(user)
////                                    .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
////                                        @Override
////                                        public void onSuccess(DocumentReference documentReference) {
////                                            Log.d("TAG","user details added successfully");
////                                        }
////                                    });
//                            Toast.makeText(SignupActivity.this, "signup successfull ,please try again!!", Toast.LENGTH_SHORT).show();
//                        } else {
//                            Toast.makeText(SignupActivity.this, "SIgnup unsuccessfull user not  registered", Toast.LENGTH_SHORT).show();
////                                startActivity(new Intent(SignupActivity.this,LoginActivity.class));
//                        }
//                    }
//                });

//                } else {
//                    //this is fo when any unexpected error comes
//                    Toast.makeText(SignupActivity.this, "Some Error Occurred!!", Toast.LENGTH_SHORT).show();
//                }

            }
//            }
        });

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        myRef.setValue("Hello, World!");

    }

    //methodf for register teh users
    public void registerUser(final String username, final String name, final String email, final String password) {
        mFirebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    //getting the id of the user
                    FirebaseUser currentUser = mFirebaseAuth.getCurrentUser();
                    String userID = currentUser.getUid();
                    //making object and calling constructor of thre modal class for our signu class
                    final UserValuesClass userValues = new UserValuesClass(name, username, password, email);
//                    public void onClick(View view) {

                    databaseUsers.child(userID).setValue(userValues).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            Toast.makeText(SignupActivity.this, "user registered successfully", Toast.LENGTH_SHORT);
                            if (!task.isSuccessful()) {
                                Toast.makeText(SignupActivity.this, "not registeredddd", Toast.LENGTH_SHORT).show();
                                Log.e("ERROR", "reasondl " + task.getException().getMessage());
                            }
                        }
                    });
                }

            }

        });
//        ValuesClass note = new UserValuesClass();
//                        note.setUserID(databaseUsers.child("users").push().getKey());
//                        note.setName(name);
//                        note.setPassword(password);
//                        note.setName(email);
//                        note.setPassword(username);

//                        databaseUsers.child("users").child(note.getUserID()).setValue(note);
//                        finish();
//                    }
//                    databaseUsers.child("users").setValue(userValues).addOnCompleteListener(new OnCompleteListener<Void>() {
//                        @Override
//                        public void onComplete(@NonNull Task<Void> task) {
////                                    progressDialog.dismiss();
//                            Toasty.success(SignupActivity.this, "User registered successfully", Toast.LENGTH_SHORT).show();
//                            Toast.makeText(SignupActivity.this, "signup successfull ,please try again!!", Toast.LENGTH_SHORT).show();
////                            DataSnapshot
//                            if (!task.isSuccessful()) {
//                                Toast.makeText(SignupActivity.this, "userrr registered", Toast.LENGTH_SHORT).show();
//                                Toasty.error(SignupActivity.this,"Error registering user",Toast.LENGTH_SHORT).show();
//                            } else {
//                                Log.i("ERROR","why not reggg " +task.getException().getMessage()); //printing the log message
//                                Toast.makeText(SignupActivity.this, "not registered", Toast.LENGTH_SHORT).show();
////                                startActivity(new Intent(SignupActivity.this, LoginActivity.class));

//                    );                   tis is  the finidhing pointttt


//                    Toast.makeText(SignupActivity.this, "signup successfull ,please try again!!", Toast.LENGTH_SHORT).show();

//                } else {
//                    Log.i("ERROR","why not reggg " +task.getException().getMessage()); //printing the log message
//                    Toast.makeText(SignupActivity.this, "SIgnup unsuccessfull user not  registered", Toast.LENGTH_SHORT).show();
////                                startActivity(new Intent(SignupActivity.this,LoginActivity.class));
//                }
    }


    //code for the upload of the photo during the registration
    public void uploadPic(View view) {
        Intent photoIntent  = new Intent(Intent.ACTION_PICK);
        photoIntent.setType("image/*");
        startActivityForResult(photoIntent,1);
    }
}
