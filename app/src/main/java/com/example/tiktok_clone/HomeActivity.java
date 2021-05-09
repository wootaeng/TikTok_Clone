package com.example.tiktok_clone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

import android.app.Activity;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.tiktok_clone.Adapter.DemoAdapter;
import com.example.tiktok_clone.Models.MediaObject;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class HomeActivity extends AppCompatActivity {

    //Glide 적용시킬 imageView 변수선언
    private ImageView sound_dis;
    private List<MediaObject> mediaObjectList = new ArrayList<>();
    private DemoAdapter demoAdapter;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



        init();
    }

    private void init() {
        //여기에 위치하면 앱 충돌을 일으킨다
//        //sound_dis 에 imageView2 적용
//        sound_dis = (ImageView) findViewById(R.id.imageView2);
//        //glide 를 활용해서 gif 파일 움직이게 적용
//        Glide.with(this).load(R.drawable.discroll).into(sound_dis);

        if (Build.VERSION.SDK_INT >= 19 && Build.VERSION.SDK_INT <21){
            setWindowFlag(this, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, true);
        }
        if (Build.VERSION.SDK_INT >= 19){
            getWindow().getDecorView().setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        }
        if (Build.VERSION.SDK_INT >=21){
            setWindowFlag(this,WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, false);
            getWindow().setStatusBarColor(Color.TRANSPARENT);
        }

        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);

        SnapHelper mSnapHelper = new PagerSnapHelper();
        mSnapHelper.attachToRecyclerView(recyclerView);

        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));
        mediaObjectList.add(new MediaObject("","","","","","","","","",""));

        demoAdapter = new DemoAdapter(mediaObjectList,getApplicationContext());
        recyclerView.setAdapter(demoAdapter);
        demoAdapter.notifyDataSetChanged();



    }

    public static void setWindowFlag(@NotNull Activity activity, final int bits, boolean on){
        Window win = activity.getWindow();
        WindowManager.LayoutParams winParams = win.getAttributes();
        if (on){
            winParams.flags |= bits;
        }else {
            winParams.flags &= ~bits;
        }
        win.setAttributes(winParams);

    }
}