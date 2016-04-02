package com.juhe.weather;

import android.app.Application;

import com.thinkland.juheapi.common.CommonFun;

/**
 * Created by Archer on 2015/12/27.
 *
 */
public class WeatherApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        CommonFun.initialize(getApplicationContext());
    }
}
