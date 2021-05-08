package com.example.tiktok_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class HomeActivity extends AppCompatActivity {

    private ImageView sound_dis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        sound_dis = (ImageView) findViewById(R.id.imageView2);
        Glide.with(this).load(R.drawable.discroll).into(sound_dis);

    }
}