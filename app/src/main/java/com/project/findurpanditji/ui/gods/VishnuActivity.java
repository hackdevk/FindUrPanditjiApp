package com.project.findurpanditji.ui.gods;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.project.findurpanditji.R;
//import com.squareup.picasso.Picasso;

public class VishnuActivity extends AppCompatActivity {
    ImageView vishnuImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vishnu);
        vishnuImageView = findViewById(R.id.activity_vishnu_image);
//        String url = "https://i1.wp.com/www.allabouthinduism.info/wp-content/uploads/2013/03/vishnu2.jpg";
        Glide.with(getApplicationContext())
                .load( "https://i1.wp.com/www.allabouthinduism.info/wp-content/uploads/2013/03/vishnu2.jpg")
                .into(vishnuImageView);

//                .setLoggingEnabled(true)
//        Picasso.get().setLoggingEnabled(true);
//        Picasso.Builder(this)
//                .lo
    }
}
