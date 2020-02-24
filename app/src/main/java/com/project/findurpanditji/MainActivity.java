package com.project.findurpanditji;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;
import com.project.findurpanditji.ui.gods.GodsFragment;
import com.project.findurpanditji.ui.pandits.PanditFragment;
import com.project.findurpanditji.ui.pujas.PujasFragment;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Handler;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //for hiding the status bar in this activity for API level 16 or higher

        try {
            View decorView = getWindow().getDecorView();
            // Hide the status bar.
            int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
            decorView.setSystemUiVisibility(uiOptions);
            // Remember that you should never show the action bar if the
            // status bar is hidden, so hide that too if necessary.
            ActionBar actionBar = getActionBar();
            actionBar.hide();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //trying to do the handling the clicking of fragments
//        if(savedInstanceState == null) {
//           switch (getSupportFragmentManager().findFragmentById()) {
//
//           }
//        }

        //for adding an extra message popup in the right corner of the screen
//        FloatingActionButton fab = findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);

        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gods, R.id.nav_pandits,
                R.id.nav_pujas, R.id.nav_contact_us)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);

        //setting the listener for the nav header 'login' label
//        try {
//        TextView login = drawer.findViewById(R.id.nav_header_main2_tv_login_label);
//        login.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                Toast.makeText(MainActivity.this, "Going to the LOGIN page", Toast.LENGTH_SHORT).show();
//                //going to the login page by the intent
//                Intent loginIntent = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(loginIntent);
//                return true;
//            }
//        });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this, "Going to the LOGIN page", Toast.LENGTH_SHORT).show();
//                //going to the login page by the intent
//                Intent loginIntent = new Intent(MainActivity.this,LoginActivity.class);
//                startActivity(loginIntent);
//            }
//        });
    }

    //for the menu items
//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        // Inflate the menu; this adds items to the action bar if it is present.
//        getMenuInflater().inflate(R.menu.activity_main2_drawer, menu);
//        return true;
//    }

    //setting code for the menu items in our app
//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
////        Intent fragmentIntent;
//        switch (item.getItemId()) {
//            case R.id.nav_home:
//                startActivity(new Intent(this,MainActivity.class));
//                Toast.makeText(this, "Going to the Main Activity", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.nav_pandits:
//                startActivity(new Intent(this, PanditFragment.class));
//                Toast.makeText(this, "Going to the Pandit Activity", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.nav_pujas:
//                startActivity(new Intent(this, PujasFragment.class));
//                Toast.makeText(this, "Going to the Puja Activity", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.nav_gods:
//                startActivity(new Intent(this,GodsFragment.class));
//                Toast.makeText(this, "Going to the Gods Activity", Toast.LENGTH_SHORT).show();
//                break;
//
//        }
//        return true;
//    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }

//method for going to the login scren
    //for the layout file 'nav_header_main2.xml"
    public void loginUserBtn(View view) {
        Intent loginIntent = new Intent(this,LoginActivity.class);
        startActivity(loginIntent); //going to the login screen
    }
}
