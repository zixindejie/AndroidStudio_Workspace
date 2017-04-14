package com.inititute.flabbybird.activity;

import android.content.Intent;
import android.os.Bundle;

import com.inititute.flabbybird.R;
import com.inititute.flabbybird.utils.ConastClassUtil;

import net.youmi.android.AdManager;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by LiRan on 2017-02-05.
 */

public class StartActivity extends BaseActivity {


    private Intent localIntent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        //广告sdk初始化
        AdManager.getInstance(this).init(ConastClassUtil.appId, ConastClassUtil.appSecret, true);

        //停留一段时间启动登陆界面
        localIntent = new Intent(this, LoginActivity.class);



        Timer timer = new Timer();
        TimerTask tast = new TimerTask() {
            @Override
            public void run() {

                startActivity(localIntent);
                finish();

            }
        };
        timer.schedule(tast, 3000);


    }
}