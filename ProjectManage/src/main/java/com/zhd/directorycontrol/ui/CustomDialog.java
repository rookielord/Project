package com.zhd.directorycontrol.ui;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import com.zhd.directorycontrol.R;

/**
 * Created by juiz on 2015/9/7.
 */
public class CustomDialog extends DialogFragment {
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        AlertDialog.Builder builder=new AlertDialog.Builder(getActivity());
//        //创建layout布局文件
//        LayoutInflater inflater=getActivity().getLayoutInflater();
//        //填充布局文件
//        builder.setView(inflater.inflate(R.layout.dialog_sign,null))
//                //设置按钮
//        .setPositiveButton("创建", new DialogInterface.OnClickListener() {
//            @Override
//            public void onClick(DialogInterface dialog, int which) {
//
//            }
//        })
//                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
//                    @Override
//                    public void onClick(DialogInterface dialog, int which) {
//
//                    }
//                });
//    }

    //创建返回一个自定义弹出框
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        //使用dialogbuild来创建
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        //设置layoutInflater来
        //LayoutInflater inflater=LayoutInflater.from(getActivity());
        LayoutInflater inflater = getActivity().getLayoutInflater();
        //将AlertDialog用布局填充器进行设置和填充
        builder.setView(inflater.inflate(R.layout.dialog_sign, null))
                //设置确定按钮
                .setPositiveButton("创建", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
        return builder.create();
    }
}