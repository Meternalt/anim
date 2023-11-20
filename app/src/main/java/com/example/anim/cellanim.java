package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class cellanim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cellanim);

        ImageView img = findViewById(R.id.animationView);
        img.setBackgroundResource(R.drawable.rabbit_animation);
        AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                frameAnimation.start();
            }
        });
    }
}