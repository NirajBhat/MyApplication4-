package com.example.bridgeit.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by bridgeit on 4/11/16.
 */
public class Gview extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        // Get intent data
        Intent i = getIntent();

        // Selected image id
        int position = i.getExtras().getInt("id");
        GridAdapter  imageAdapter = new GridAdapter(this);

        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        imageView.setImageResource(imageAdapter.mImage[position]);
    }
}
