package com.example.aplikasitempatwisata;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ProfileActivity extends AppCompatActivity {
    TextView nama,email;
    ImageView photo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        photo = findViewById(R.id.imageView);
        photo.setImageResource(R.drawable.people);
        nama = findViewById(R.id.textView);
        email = findViewById(R.id.textView2);
    }
}
