package com.zhd.directorycontrol;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;


import com.zhd.directorycontrol.Moudle.Project;

import java.util.List;

/**
 * Created by 2015032501 on 2015/9/7.
 */
public class ProjectAdapter extends BaseAdapter {
    private List<Project> mProjects;

    public ProjectAdapter(List<Project> mProjects) {
        this.mProjects = mProjects;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return null;
    }
}
