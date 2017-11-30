package com.yan.status.mode;

import android.content.Context;

/**
 * @author : 楠GG
 * @date : 2017/11/30 22:29
 * @description : 用户状态
 */
public interface UserState {
    /**
     * 转发
     */
    void forward(Context context);

    /**
     * 评论
     */
    void comment(Context context);
}
