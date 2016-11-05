package com.example.bridgeit.myapplication;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by bridgeit on 4/11/16.
 */
public class GridAdapter extends BaseAdapter {
    private Context mContext;
    //Constructor
    public GridAdapter(Context c){
        mContext=c;
    }
    @Override
    public int getCount() {
        return mImage.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    // create a new imageview for each item refernced by adapter

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        ImageView imageView;
        if (view == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(250, 250));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(7, 7, 7,20);
        } else {
            imageView = (ImageView) view;
        }
        imageView.setImageResource(mImage[i]);
        return imageView;
    }
    // keeping all imagesc in array
    public Integer[] mImage ={
            R.drawable.airplane, R.drawable.barbie,
            R.drawable.bourbon, R.drawable.camera,
            R.drawable.download, R.drawable.cold,
            R.drawable.downloadd, R.drawable.firefox,
            R.drawable.global, R.drawable.safari,
            R.drawable.gun, R.drawable.imagesc,
            R.drawable.imagesa, R.drawable.imagesb,
            R.drawable.imagesd, R.drawable.jet,
            R.drawable.train, R.drawable.metro,
            R.drawable.mobile, R.drawable.uc,
            R.drawable.watch

    };
}
