package com.github.zcwfeng.dragger;

import android.app.Application;

import com.github.zcwfeng.dragger.component.ApplicationComponent;
import com.github.zcwfeng.dragger.component.DaggerApplicationComponent;
import com.github.zcwfeng.dragger.model.ApplicationModule;

/**
 * ==========================================
 * Created by David Zhang on 2015/08/30.
 * Description：
 * Copyright © 2015 张传伟. All rights reserved.
 * Modified by:
 * Modified Content:
 * ==========================================
 */
public class DraggerApplication extends Application {
    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();
        this.component =  DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        this.component.injectApplication(this);
    }

    public ApplicationComponent getComponent(){
        return component;
    }
}

