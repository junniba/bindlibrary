package com.seemax.bindlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.junniba.mylibrary.Tool.JTool;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JTool.printPixels(this);
    }
}