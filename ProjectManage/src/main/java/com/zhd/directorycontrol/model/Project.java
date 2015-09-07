package com.zhd.directorycontrol.model;

import java.io.File;

/**
 * Created by 2015032501 on 2015/9/7.
 * 一个项目对象拥有的属性和对应的方法
 * 名称
 * 创建时间
 * 备注内容
 * 配置文件(以上3个都会被写入其中)
 */
public class Project {
    private String mName;
    private String mTime;
    private String mBackup;
    private File mConfig;

    public Project(String mName, String mTime, String mBackup, File mConfig) {
        this.mName = mName;
        this.mTime = mTime;
        this.mBackup = mBackup;
        this.mConfig = mConfig;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmTime() {
        return mTime;
    }

    public void setmTime(String mTime) {
        this.mTime = mTime;
    }

    public File getmConfig() {
        return mConfig;
    }

    public void setmConfig(File mConfig) {
        this.mConfig = mConfig;
    }

    public String getmBackup() {
        return mBackup;
    }

    public void setmBackup(String mBackup) {
        this.mBackup = mBackup;
    }
}
