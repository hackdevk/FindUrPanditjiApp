package com.project.findurpanditji.ui.gods;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.project.findurpanditji.R;

public class DurgaActivity extends AppCompatActivity {
    ImageView durgaImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_durga);

        //for showing the toolbar in the top of the app
//        Toolbar mToolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(mToolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);
//        mToolbar.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
//        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

        Toolbar toolbar = findViewById(R.id.toolbar);


        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        durgaImageView = findViewById(R.id.activity_durga_image);
//        String url = "https://i1.wp.com/www.allabouthinduism.info/wp-content/uploads/2013/03/vishnu2.jpg";

        Glide.with(getApplicationContext())
                .load( "https://www.astroved.com/images/pooja/DurgaPooja1400.jpg")
                .into(durgaImageView);

//                .setLoggingEnabled(true)
//        Picasso.get().setLoggingEnabled(true);
//        Picasso.Builder(this)
//                .lo
    }
}
