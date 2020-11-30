package com.pcs.pcs_tabbednavigation_0609;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        String title = getIntent().getStringExtra("EXTRA_TITLE");
        String year = getIntent().getStringExtra("EXTRA_YEAR");
        String image = getIntent().getStringExtra("EXTRA_IMAGE");
        String overview = getIntent().getStringExtra("EXTRA_OVERVIEW");
        String rate = getIntent().getStringExtra("EXTRA_RATE");
        String original = getIntent().getStringExtra("EXTRA_ORIGINAL");
        String bahasa = getIntent().getStringExtra("EXTRA_LANGUAGE");


        TextView txtTitle = findViewById(R.id.txtTitle);
        TextView txtYear = findViewById(R.id.txtYear);
        ImageView imgPoster = findViewById(R.id.imgPoster);
        TextView txtOverview = findViewById(R.id.txtoverview);
        TextView txtRate = findViewById(R.id.txtrate);




        txtTitle.setText(title);
        txtYear.setText(year);
        txtOverview.setText(overview);
        txtRate.setText(rate);




        Glide.with(this)
                .load("https://themoviedb.org/t/p/w500/"+image.toString())
                .into(imgPoster);


    }
}
