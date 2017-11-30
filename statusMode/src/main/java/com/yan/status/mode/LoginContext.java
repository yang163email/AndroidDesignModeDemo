package com.yan.status.mode;

import android.content.Context;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:28
 * @description : 用户接口和状态管理类
 */
public class LoginContext {
    //用户状态，默认为未登录状态
    UserState mState = new LogoutState();
    //单例
    static LoginContext sLoginContext = new LoginContext();

    private LoginContext() { }

    public static LoginContext getLoginContext() {
        return sLoginContext;
    }

    public void setState(UserState state) {
        mState = state;
    }
    //转发
    public void forward(Context context) {
        mState.forward(context);
    }
    //评论
    public void comment(Context context) {
        mState.comment(context);
    }
}
