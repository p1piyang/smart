package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class materialActivity extends AppCompatActivity {
    /**
     * 谷歌刷新头
     * @param savedInstanceState
     */
    private SmartRefreshLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_material);
        layout = findViewById(R.id.material_layout);
        layout.setRefreshHeader(new MaterialHeader(this));
    }
}