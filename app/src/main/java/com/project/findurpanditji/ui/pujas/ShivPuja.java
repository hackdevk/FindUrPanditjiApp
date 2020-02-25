package com.project.findurpanditji.ui.pujas;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.project.findurpanditji.R;

public class ShivPuja extends AppCompatActivity{

    ImageView shivPuja;
    TextView pujaSamagri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shiv_puja);

        shivPuja = findViewById(R.id.activity_shiv_puja_img_puja);
        pujaSamagri = findViewById(R.id.activity_shiv_puja_tv_puja_samagri);

        //setting the image for shiv  puja
        Glide.with(getApplicationContext())
                .load("data:image/jpeg;base64,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")
                .into(shivPuja);

        //adding the list
        pujaSamagri.setText(R.string.bhoomi_puja_samagri_list);
        }

//    private BhoomiPuja bhoomiPuja;

//    public View onCreateView(@NonNull LayoutInflater inflater,
//                             ViewGroup container, Bundle savedInstanceState) {
//        bhoomiPuja = ViewModelProviders.of(this).get(BhoomiPuja.class);
//        View root = inflater.inflate(R.layout.activity_bhoomi_puja, container, false);
//        final TextView textView = root.findViewById(R.id.text_gallery);
////        bhoomiPuja.getText().observe(this, new Observer<String>() {
////            @Override
////            public void onChanged(@Nullable String s) {
////                textView.setText(s);
//            }
//        });
//        return root;
//    }

}
