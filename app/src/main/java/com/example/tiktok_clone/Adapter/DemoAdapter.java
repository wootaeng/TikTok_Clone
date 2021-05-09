package com.example.tiktok_clone.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.tiktok_clone.Models.MediaObject;
import com.example.tiktok_clone.R;

import java.util.List;

public class DemoAdapter extends RecyclerView.Adapter<DemoAdapter.DemoViewHolder> {

    List<MediaObject> mediaObjectList;
    Context context;

    public DemoAdapter(List<MediaObject> mediaObjectList, Context context) {
        this.mediaObjectList = mediaObjectList;
        this.context = context;
    }

    @NonNull
    @Override
    public DemoViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_main,viewGroup,false);

        return new DemoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DemoViewHolder holder, int position) {

        MediaObject mediaObject = mediaObjectList.get(position);

        //glide 를 활용해서 gif 파일 움직이게 적용
        Glide.with(context).load(R.drawable.discroll).into(holder.sound_dis);
    }

    @Override
    public int getItemCount() {
        return mediaObjectList.size();
    }

    public class DemoViewHolder extends RecyclerView.ViewHolder {
        //sound_dis 사용하기위한 변수선언
        private ImageView sound_dis;

        public DemoViewHolder(@NonNull View itemView) {
            super(itemView);

            sound_dis = (ImageView) itemView.findViewById(R.id.imageView2);
        }
    }
}
