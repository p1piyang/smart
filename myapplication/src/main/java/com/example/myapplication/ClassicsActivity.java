package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class ClassicsActivity extends AppCompatActivity {
    /**
     * 经典刷新头
     * @param savedInstanceState
     */

    private SmartRefreshLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_classics);
        layout = findViewById(R.id.classics_layout);
        layout.setRefreshHeader(new ClassicsHeader(this));
        
    }
}