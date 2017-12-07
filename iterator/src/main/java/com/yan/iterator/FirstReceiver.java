package com.yan.iterator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

/**
 * @author : 楠GG
 * @date : 2017/12/7 21:28
 * @description : TODO
 */
public class FirstReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        //获取Intent中附加的限制值
        int limit = intent.getIntExtra("limit", -1001);
        //如果限制值等于1000，则处理，否则继续转发给下一个Receiver
        if (limit == 1000) {
            //获取Intent中附加的字符串消息并Toast
            String msg = intent.getStringExtra("msg");
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();

            //终止广播
            abortBroadcast();
        } else {
            //添加信息发送给下一个Receiver
            Bundle bundle = new Bundle();
            bundle.putString("new", "Message from FirstReceiver");
            setResultExtras(bundle);
        }
    }
}
