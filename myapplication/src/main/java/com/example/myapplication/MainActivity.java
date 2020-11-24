package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.scwang.smart.refresh.classics.ClassicsAbstract;
import com.scwang.smart.refresh.footer.ClassicsFooter;
import com.scwang.smart.refresh.header.ClassicsHeader;
import com.scwang.smart.refresh.header.MaterialHeader;
import com.scwang.smart.refresh.layout.SmartRefreshLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     * 经典刷新
     * @param view
     */
    public void classicsClick(View view) {
        pageJump(ClassicsActivity.class);
    }

    /**
     *
     * @param view
     */
    public void radarClick(View view) {
        pageJump(RadarActivity.class);
    }

    /**
     *
     * @param view
     */
    public void falsifyClick(View view) {
        pageJump(FalsifyActivity.class);
    }

    /**
     *
     * @param view
     */
    public void materialClick(View view) {
        pageJump(materialActivity.class);
    }

    /**
     *
     * @param view
     */
    public void twoLevelClick(View view) {
        pageJump(TwoLevelActivity.class);
    }

    /**
     *
     * @param view
     */
    public void ballClick(View view) {
    }


    void pageJump(Class c){
        Intent intent = new Intent(this, c);
        startActivity(intent);
    }
}