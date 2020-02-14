package com.project.findurpanditji.ui.gods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.project.findurpanditji.R;
import com.squareup.picasso.Picasso;

public class ShivaActivity extends AppCompatActivity {
    ImageView shivaImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiva);
        shivaImageView = findViewById(R.id.activity_shiva_image);
        Picasso.get()
                .load("https://cdn.bestcollegeart.com/media/catalog/product/cache/1/thumbnail/1000x/17f82f742ffe127f42dca9de82fb58b1/l/o/lord_shiva_30.jpg")
                .into(shivaImageView);
    }
}
