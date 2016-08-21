package com.example.a17381.broadcastbestpractice;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by 17381 on 2016/8/20.
 */
public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityCollector.addActivity(this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
    }
}
