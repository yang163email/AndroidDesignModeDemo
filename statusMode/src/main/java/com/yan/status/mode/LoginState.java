package com.yan.status.mode;

import android.content.Context;
import android.widget.Toast;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:31
 * @description : 已登录状态
 */
public class LoginState implements UserState {
    @Override
    public void forward(Context context) {
        Toast.makeText(context, "转发微博", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void comment(Context context) {
        Toast.makeText(context, "评论微博", Toast.LENGTH_SHORT).show();
    }
}
