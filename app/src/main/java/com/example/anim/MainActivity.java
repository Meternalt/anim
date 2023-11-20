package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void clockwise(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        Animation animationClock = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        imageView.startAnimation(animationClock);
    }

    public void move(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        Animation animationMove = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        imageView.startAnimation(animationMove);
    }

    public void fade(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        Animation animationFade = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        imageView.startAnimation(animationFade);
    }



    public void zoom(View view) {
        ImageView imageView = findViewById(R.id.imageView);
        Animation animationZoom = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        imageView.startAnimation(animationZoom);
    }
}