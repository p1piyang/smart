package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.scwang.smart.refresh.header.FalsifyHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class FalsifyActivity extends AppCompatActivity {
    /**
     * 虚拟刷新头
     * @param savedInstanceState
     */
    private SmartRefreshLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_falsify);
        layout = findViewById(R.id.falsify_layout);
        layout.setRefreshHeader(new FalsifyHeader(this));
    }
}