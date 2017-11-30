package com.yan.status.mode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 *  @author      : 楠GG
 *  @date        : 2017/11/30 22:15
 *  @description ：MainActivity
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initListener();
    }

    private void initListener() {
        findViewById(R.id.btn_forward).setOnClickListener(this);
        findViewById(R.id.btn_logout).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_forward:
                //调用LoginContext的转发函数
                LoginContext.getLoginContext().forward(this);
                break;
            case R.id.btn_logout:
                //设置为注销状态
                LoginContext.getLoginContext().setState(new LogoutState());
                Toast.makeText(this, "注销成功", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
