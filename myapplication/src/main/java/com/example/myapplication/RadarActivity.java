package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.scwang.smart.refresh.header.BezierRadarHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class RadarActivity extends AppCompatActivity {
    /**
     * 雷达刷新头
     * @param savedInstanceState
     */
    private SmartRefreshLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar);
        layout = findViewById(R.id.radar_layout);
        layout.setRefreshHeader(new BezierRadarHeader(this).setEnableHorizontalDrag(true));
    }
}