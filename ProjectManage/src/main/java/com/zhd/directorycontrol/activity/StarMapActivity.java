package com.zhd.directorycontrol.activity;

import android.app.Activity;
import android.os.Bundle;
import com.zhd.directorycontrol.R;


/**
 * 现在突然不能关联layout资源变量
 * Created by 2015032501 on 2015/9/9.
 */
public class StarMapActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starmap);
    }
}
