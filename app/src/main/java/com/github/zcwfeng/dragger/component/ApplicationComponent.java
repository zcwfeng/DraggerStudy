package com.github.zcwfeng.dragger.component;

import com.github.zcwfeng.dragger.DraggerApplication;
import com.github.zcwfeng.dragger.model.ApplicationModule;

import dagger.Component;
import dagger.Module;

/**
 * ==========================================
 * Created by David Zhang on 2015/08/30.
 * Description：
 * Copyright © 2015 张传伟. All rights reserved.
 * Modified by:
 * Modified Content:
 * ==========================================
 */
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    DraggerApplication injectApplication(DraggerApplication application);
}
