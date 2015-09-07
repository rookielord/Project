package com.zhd.directorycontrol;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


import com.zhd.directorycontrol.Moudle.Project;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2015032501 on 2015/9/7.
 */
public class ProjectActivity extends Activity {
    private ListView mlv;
    private String mPath;
    private List<Project> mProjects;
    private List<String> mProPath;
    private boolean mHasProject;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);
        Intent intent = getIntent();
        mPath = intent.getStringExtra("path");
        mlv = (ListView) findViewById(R.id.lv);
        //获得Project目录下所有的Project文件对象
        mHasProject=getAllProjects(mPath);
        if (mHasProject) {
            getProjectInstance();
            //将对象传给适配器，然后对item内容进行填充
            ProjectAdapter pa = new ProjectAdapter(mProjects);
            mlv.setAdapter(pa);
        }
    }

    private void getProjectInstance() {
        //对应路径下的config.txt文件进行读取
        File file;
        for (String path:mProPath){
            file=new File(path+"/config.txt");
        }

    }

    //第一步获取所有的Project的路径
    private boolean getAllProjects(String mPath) {
        File files = new File(mPath);
        //将project对象中的配置文件进行读取，并创建Project对象
        File[] contents = files.listFiles();
        if (contents.length > 1) {
            for (File file : contents) {
                mProPath.add(file.getPath());
            }
            return true;
        } else {
            return false;
        }
    }
    //第二步根据路径来获取对应的配置文件来创建Project对象，并填充进集合

    //第三步通过适配器，将项目显示到ListView上

    //这里使用menu来进行新建,创建Menu菜单项目
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    //点击后触发的事件
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.item_create) {
            //这里实现创建项目
        }

        return super.onOptionsItemSelected(item);
    }
}
