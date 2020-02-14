package com.project.findurpanditji.ui.gods;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.findurpanditji.R;
import com.squareup.picasso.Picasso;

public class LaxmiActivity extends AppCompatActivity {
    ImageView laxmiImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_laxmi);
        laxmiImageView = findViewById(R.id.activity_laxmi_image);
//        String url = "https://5.imimg.com/data5/XU/PW/MY-52876856/lord-laxmi-statue-500x500.jpg";
        Picasso.get()
                .load("https://5.imimg.com/data5/XU/PW/MY-52876856/lord-laxmi-statue-500x500.jpg")
                .into(laxmiImageView);
//                .setLoggingEnabled(true)
//        Picasso.get().setLoggingEnabled(true);
//        Picasso.Builder(this)
//                .lo
    }
}
