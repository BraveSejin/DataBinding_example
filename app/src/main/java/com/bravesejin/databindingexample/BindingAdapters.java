package com.bravesejin.databindingexample;

import android.net.Uri;
import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;


public class BindingAdapters {
    @BindingAdapter("imgUri")
    public static void loadImage( ImageView imageView, String url){
        Glide.with(imageView.getContext()).load(Uri.parse(url)).into(imageView);
    }
}
