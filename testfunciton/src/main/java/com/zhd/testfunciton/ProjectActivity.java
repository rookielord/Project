package com.zhd.testfunciton;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by 2015032501 on 2015/9/7.
 */
public class ProjectActivity extends Activity {
    private ListView lv;

    private Button btn, btn_del;
    private EditText et;
    private String path;
    private String mCurrentPath;
    private static final String TAG = "project";
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        path = intent.getStringExtra("project_path");
        Log.d(TAG, path);
        setContentView(R.layout.activity_project);
        tv = (TextView) findViewById(R.id.tv_content);
        btn_del = (Button) findViewById(R.id.btn_del);
        btn_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "delete");
                deleteFile(new File(path + "/pro0"));
            }
        });
        //分别创建3个文件夹
        for (int i = 0; i < 3; i++) {
            File file = new File(path + "/" + "pro" + i);
            if (!file.exists()) {
                file.mkdir();
            }
        }
        //写入文件的位置和名称
        File pro1 = new File(path + "/pro1", "config.txt");
        OutputStream out = null;
        try {
            //写入文件流
            out = new BufferedOutputStream(new FileOutputStream(pro1));
            //写入内容
            String msg = "这是配置文件";
            out.write(msg.getBytes());
            //写入
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            //关闭流
            if (out!=null)
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        //将其查询出来显示,显示出来的是全部路径需要对其进行截取
//        File files = new File(path);
//        File[] contents = files.listFiles();
//        if (contents.length > 1) {
//            for (File file : contents) {
//                tv.append(file.getPath()+"\n");
//            }
//        }
        //删除的实现,指定pro1删除


    }

    private void deleteFile(File del_path) {
        //假如是个目录的话
        if (del_path.isDirectory()) {
            File[] files = del_path.listFiles();
            for (File file : files) {
                //因为在目录下还会有目录，所以先递归调用
                deleteFile(file);
                file.delete();
                //删除完子目录和子文件后删除自己
            }
            del_path.delete();
        } else {
            del_path.delete();
        }
    }
}
