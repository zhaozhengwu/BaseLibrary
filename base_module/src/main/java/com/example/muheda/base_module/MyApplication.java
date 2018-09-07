package com.example.muheda.base_module;

import android.app.Application;

import com.alibaba.android.arouter.*;
import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by 13660 on 2018/9/7.
 */

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        initRouter(this);
    }

    public static void initRouter(Application application) {
        if (BuildConfig.DEBUG) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(application);
    }
}
