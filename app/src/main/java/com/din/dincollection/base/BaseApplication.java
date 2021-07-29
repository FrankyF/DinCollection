package com.din.dincollection.base;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class BaseApplication extends Application {
    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
