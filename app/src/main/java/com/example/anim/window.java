package com.example.anim;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class window extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);
    }

    public void cel(View view) {
        Intent intent = new Intent(this, cellanim.class);
        startActivity(intent);
    }
    public void twee(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}