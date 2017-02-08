package com.liran.flabbybird.utils;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import net.tsz.afinal.FinalDb;

/**
 * Created by LiRan on 2017-01-25.
 */
public class MyApplication extends Application {

    private static final String TAG = "MyApplication";

    public static Context mContext;

    private static FinalDb db;

    @Override
    public void onCreate() {
        super.onCreate();

        mContext = this.getApplicationContext();

        Log.d(TAG, "onCreate: 哈哈哈");


    }

    /**
     * 如果没有则创建并返回一个数据库操作对象
     * @return FinalDb对象
     */
    public static FinalDb getDB() {
        if (db == null) {
            db = FinalDb.create(mContext);
        }
        return db;
    }


}
