package com.example.fooball;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    ImageView imageViewFotoClub;
    TextView textViewNamaClub,textViewInfoClub;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFotoClub = findViewById(R.id.imageViewFotoClub);
        textViewNamaClub = findViewById(R.id.textViewNamaClub);
        textViewInfoClub = findViewById(R.id.textViewInfoClub);

        getInComingExtra();
    }
    private void getInComingExtra(){

        if (getIntent().hasExtra("foto_Club") && getIntent().hasExtra("nama_Club") && getIntent().hasExtra("info_Club")){

            String fotoClub = getIntent().getStringExtra("foto_Club");
            String namaClub = getIntent().getStringExtra("nama_Club");
            String infoClub = getIntent().getStringExtra("info_Club");

            setDataActivity(fotoClub,namaClub,infoClub);

        }


    }
    private void setDataActivity(String fotoClub, String namaClub, String infoClub){


        Glide.with(this).asBitmap().load(fotoClub).into(imageViewFotoClub);

        textViewInfoClub.setText(infoClub);
        textViewNamaClub.setText(namaClub);

    }
}
