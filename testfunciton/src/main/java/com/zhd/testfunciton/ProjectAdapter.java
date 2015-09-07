package com.zhd.testfunciton;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by 2015032501 on 2015/9/7.
 */
public class ProjectAdapter extends BaseAdapter {

    private MyCallback mCallback;
    private Context mContext;
    private String[] direc_name;

    public ProjectAdapter(Context mContext, String[] direc_name) {
        this.mContext = mContext;
        this.direc_name = direc_name;
    }

    public void setmCallback(MyCallback mCallback) {
        this.mCallback = mCallback;
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
        View v= View.inflate(mContext, R.layout.item_project,null);
        TextView tv= (TextView) v.findViewById(R.id.tv_name);
        return null;
    }
}
