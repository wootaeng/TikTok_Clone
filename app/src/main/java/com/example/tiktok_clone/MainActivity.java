package com.example.tiktok_clone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //화면 계속 켜짐
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //delay 실행
        new Handler().postDelayed(new Runnable() {//3초 후 실행행            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(intent);
                finish();

            }
        }, 3000);
    }
}