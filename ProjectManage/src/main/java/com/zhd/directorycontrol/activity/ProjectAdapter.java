package com.zhd.directorycontrol.activity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;


import com.zhd.directorycontrol.R;
import com.zhd.directorycontrol.model.Project;

import java.util.List;

/**
 * Created by 2015032501 on 2015/9/7.
 */
public class ProjectAdapter extends BaseAdapter {
    private List<Project> mProjects;
    private Context mContext;
    public ProjectAdapter(List<Project> Projects,Context context) {
        this.mProjects = Projects;
        this.mContext=context;
    }

    @Override
    public int getCount() {
        return mProjects.size();
    }

    @Override
    public Object getItem(int position) {
        return mProjects.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //将一个layout布局文件创建为一个view对象
        //创建需要赋值的控件对象
        TextView pro_name,pro_back,pro_time;
        RadioButton radio;
        View v=View.inflate(mContext, R.layout.item_pro,null);
        Project p=mProjects.get(position);
        //找到对应的控件
        pro_name= (TextView) v.findViewById(R.id.tv_proname);
        pro_back= (TextView) v.findViewById(R.id.tv_proback);
        pro_time= (TextView) v.findViewById(R.id.tv_protime);
        radio= (RadioButton) v.findViewById(R.id.rb);
        //设置对应的内容
        pro_name.setText(p.getmName());
        pro_back.setText(p.getmBackup());
        pro_time.setText(p.getmTime());
        //对radioButton设置监听

        return v;
    }
}
