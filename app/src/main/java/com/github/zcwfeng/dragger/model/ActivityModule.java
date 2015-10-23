package com.github.zcwfeng.dragger.model;

import android.app.Activity;

import dagger.Module;
import dagger.Provides;

/**
 * ==========================================
 * Created by David Zhang on 2015/08/30.
 * Description：
 * Copyright © 2015 张传伟. All rights reserved.
 * Modified by:
 * Modified Content:
 * ==========================================
 */
@Module
public class ActivityModule {
    private Activity mActivity;

    public ActivityModule(Activity activity) {
        mActivity = activity;
    }


    @Provides
    Activity providesActivity() {
        return mActivity;
    }
}
