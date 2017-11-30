package com.yan.status.mode;

import android.content.Context;
import android.content.Intent;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:32
 * @description : 注销状态，即未登录状态
 */
public class LogoutState implements UserState {
    @Override
    public void forward(Context context) {
        gotoLoginActivity(context);
    }

    @Override
    public void comment(Context context) {
        gotoLoginActivity(context);
    }

    private void gotoLoginActivity(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
