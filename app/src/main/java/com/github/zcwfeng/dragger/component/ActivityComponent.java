package com.github.zcwfeng.dragger.component;

import com.github.zcwfeng.dragger.DraggerApplication;
import com.github.zcwfeng.dragger.MainActivity;
import com.github.zcwfeng.dragger.ToastHelper;
import com.github.zcwfeng.dragger.model.ActivityModule;
import com.github.zcwfeng.dragger.model.ApplicationModule;

import dagger.Component;

/**
 * ==========================================
 * Created by David Zhang on 2015/08/30.
 * Description：
 * Copyright © 2015 张传伟. All rights reserved.
 * Modified by:
 * Modified Content:
 * ==========================================
 */
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    MainActivity injectActivity(MainActivity activity);
    ToastHelper getToastHelper();
}
