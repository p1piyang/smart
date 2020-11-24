package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.scwang.smart.refresh.header.TwoLevelHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class TwoLevelActivity extends AppCompatActivity {
    /**
     * 二级刷新头
     * @param savedInstanceState
     */
    private SmartRefreshLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two_level);
        layout = findViewById(R.id.twolevel_layout);
        layout.setRefreshHeader(new TwoLevelHeader(this));
        System.out.println("aaa");
        //aaaaaaaa
    }
}