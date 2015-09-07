package com.zhd.testfunciton;

import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import java.io.File;


public class MainActivity extends ActionBarActivity implements OnClickListener {

    Button btn_dire;
    private String project_path;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_dire = (Button) findViewById(R.id.btn_directory);
        btn_dire.setOnClickListener(this);
        //在创建的时候创建一个文件夹用来存储所有的文件
        createDirectory();

    }

    private void createDirectory() {
        File ext_path = Environment.getExternalStorageDirectory();
        File file = new File(ext_path, "LJJ_TEST");
        //第一次安装，或判断是否存在
        if (!file.exists()){
            file.mkdir();
        }
        //创建project目录
        File pro_file=new File(file.getPath()+"/project");
        if (!pro_file.exists()){
            //第一次创建后就不会再第二次创建了
            pro_file.mkdir();
        }
        //无论存在与否都会得到路径
        project_path=pro_file.getPath();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_directory:
                Intent project = new Intent("com.zhd.action.PROJECT");
                project.putExtra("project_path",project_path);
                startActivity(project);
                break;
        }
    }
}
