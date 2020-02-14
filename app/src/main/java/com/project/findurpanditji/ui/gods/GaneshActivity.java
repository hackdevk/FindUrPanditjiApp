package com.project.findurpanditji.ui.gods;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.findurpanditji.R;
import com.squareup.picasso.Picasso;

public class GaneshActivity extends AppCompatActivity {
    ImageView ganeshImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganesh);
        ganeshImageView = findViewById(R.id.activity_ganesh_image);
//        String url = "https://i1.wp.com/www.allabouthinduism.info/wp-content/uploads/2013/03/vishnu2.jpg";
        Picasso.get()
                .load( "https://img.etimg.com/thumb/msid-70895648,width-643,imgsize-684476,resizemode-4/go-green-this-festive-season-and-bring-home-an-eco-friendly-ganesha-idol-.jpg")
                .into(ganeshImageView);
//                .setLoggingEnabled(true)
//        Picasso.get().setLoggingEnabled(true);
//        Picasso.Builder(this)
//                .lo
    }
}
