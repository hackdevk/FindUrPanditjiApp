package com.project.findurpanditji.ui.gods;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.findurpanditji.R;
import com.squareup.picasso.Picasso;

public class SaraswatiActivity extends AppCompatActivity {
    ImageView saraswatiImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saraswati);
        saraswatiImageView = findViewById(R.id.activity_saraswati_image);
//        String url = "https://i1.wp.com/www.allabouthinduism.info/wp-content/uploads/2013/03/vishnu2.jpg";
        Picasso.get()
                .load( "https://www.rudraksha-ratna.com/uploads/files/6316857171.jpg")
                .into(saraswatiImageView);
//                .setLoggingEnabled(true)
//        Picasso.get().setLoggingEnabled(true);
//        Picasso.Builder(this)
//                .lo
    }
}
