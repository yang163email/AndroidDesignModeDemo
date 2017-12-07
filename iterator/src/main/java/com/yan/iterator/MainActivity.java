package com.yan.iterator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *  @author      : 楠GG
 *  @date        : 2017/12/7 21:26
 *  @description ：MainActivity
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setAction("com.yan.iterator.action.ORDER_BROADCAST");
                intent.putExtra("limit", 100);
                intent.putExtra("msg", "Message from MainActivity");
                sendOrderedBroadcast(intent, null);
            }
        });
    }
}
