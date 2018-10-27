package com.frankchang.animation_demo;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    private ImageView show;
    private AnimationDrawable animation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        show = findViewById(R.id.showImage);
        animation = (AnimationDrawable) show.getDrawable();
    }

    public void startOnClick(View view) {
        animation.start();
    }

    public void stopOnClick(View view) {
        animation.stop();
    }

}
