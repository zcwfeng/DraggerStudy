package com.github.zcwfeng.dragger;

import android.content.Context;
import android.widget.Toast;

import javax.inject.Inject;

/**
 * ==========================================
 * Created by David Zhang on 2015/08/30.
 * Description：
 * Copyright © 2015 张传伟. All rights reserved.
 * Modified by:
 * Modified Content:
 * ==========================================
 */
public class ToastHelper {
    @Inject
    ToastHelper() {
    }

    //@Inject
    //Utils utils;
    Toast toast = null;

    public void showToast(Context context, CharSequence text) {
        if (toast == null) {
            toast = Toast.makeText(context, text, Toast.LENGTH_LONG);
        } else {
            toast.setText(text);
        }
        toast.show();
    }

    public void show(Context context) {
        // showToast(context, utils.getContent());
    }
}
