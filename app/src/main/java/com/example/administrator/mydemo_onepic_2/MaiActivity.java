package com.example.administrator.mydemo_onepic_2;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.roughike.bottombar.BottomBar;


import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;

/**
 * Created by Administrator on 2016/12/24 0024.
 */
public class MaiActivity extends AppCompatActivity implements View.OnClickListener {




    @SuppressWarnings("ConstantConditions")
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mai);


        findViewById(R.id.simple_three_tabs).setOnClickListener(this);
        findViewById(R.id.five_tabs_changing_colors).setOnClickListener(this);
        findViewById(R.id.three_tabs_quick_return).setOnClickListener(this);
        findViewById(R.id.five_tabs_custom_colors).setOnClickListener(this);
        findViewById(R.id.badges).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.simple_three_tabs:
                break;
            case R.id.five_tabs_changing_colors:
                startActivity(new Intent(MaiActivity.this,FiveColorChangingTabsActivity.class));
                break;
            case R.id.three_tabs_quick_return:
                startActivity(new Intent(MaiActivity.this,ThreeTabsQRActivity.class));
                break;
            case R.id.five_tabs_custom_colors:
                break;
            case R.id.badges:
                break;
        }

    }
}
