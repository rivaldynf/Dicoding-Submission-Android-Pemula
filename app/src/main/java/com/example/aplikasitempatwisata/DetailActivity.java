package com.example.aplikasitempatwisata;


import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    public static final String EXTRA_WISATA = "extra_wisata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageView = findViewById(R.id.img_detail);
        TextView name = findViewById(R.id.tv_name_detail);
        TextView description = findViewById(R.id.tv_desc_detail);

        Wisata wisata = getIntent().getParcelableExtra(EXTRA_WISATA);

        Glide.with(this).load(wisata.getPhoto()).into(imageView);
        name.setText(wisata.getName());
        description.setText(wisata.getDescription());
    }
}
