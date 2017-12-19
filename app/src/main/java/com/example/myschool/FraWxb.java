package com.example.myschool;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;

import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.text.Layout;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.ScrollView;
import android.widget.TextView;

import org.litepal.crud.DataSupport;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.net.URL;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.zip.Inflater;
import  java.net.*;
/**
 * Created by 德锐 on 2017/12/4.
 * 主页
 */

public class FraWxb extends  android.app.Fragment {
    private ImageView add_time;
    private PopupWindow popupWindow;
    private Button timesave;
    private EditText timename,timeyear,timemonth,timeday;
    private ListView listView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fra_wxb,container,false);
        add_time=(ImageView)view.findViewById(R.id.add_time);
        listView=(ListView) view.findViewById(R.id.time_list);

        Daycard();


        add_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initAddtime();
            }
        });



        return  view;

    }

    //创建倒数view

    public void  Daycard(){
        //获取数据Day

        ArrayList<String>list=new ArrayList<String>();
        int i=0;

        List<Day> dayList=DataSupport.findAll(Day.class);
        for (Day day: dayList){
            //动态加载线性布局
            String Dtimename=day.getTimename();
            int Dyear=day.getYear();
            int Dday=day.getDay();
            int Dmonth=day.getMonth();
            int frommonth;
            int fromday;


            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
            String year = sdf.format(System.currentTimeMillis());
            SimpleDateFormat sdfm = new SimpleDateFormat("MM");
            String month = sdfm.format(System.currentTimeMillis());
            SimpleDateFormat sdfd = new SimpleDateFormat("dd");
            String days = sdfd.format(System.currentTimeMillis());////正确
           int Iyear =Integer.parseInt(year);
            int Imonth =Integer.parseInt(month);
            int Idays =Integer.parseInt(days);


           frommonth=(Dyear-Iyear)*12+(Dmonth-Imonth);
            fromday=(Dday-Idays);

           list.add("距离"+Dtimename+"还有"+frommonth+"月"+fromday+"天");


        }

       ArrayAdapter<String>  adapter=new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);
    }

//tianjia
    public void  initAddtime(){

        View view= LayoutInflater.from(getActivity()).inflate(R.layout.time_popup,null,false);

        //构造一个悬浮框，并加载view 宽，高，设置焦点
        popupWindow=new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT,ViewGroup.LayoutParams.WRAP_CONTENT,true);
        //设置关闭
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
        //设置背景
        popupWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));

        //设置位置
        View rootview = LayoutInflater.from(getActivity()).inflate(R.layout.activity_main, null);
        popupWindow.showAtLocation(rootview, Gravity.CENTER,0,0);
        timemonth=(EditText)view.findViewById(R.id.timemonth);
        timeyear=(EditText)view.findViewById(R.id.timeyear);
        timeday=(EditText)view.findViewById(R.id.timeday);
        timename=(EditText)view.findViewById(R.id.timename);



        timesave=(Button)view.findViewById(R.id.timesave);
        timesave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Stimename=timename.getText().toString();
                int Stimeyear=Integer.parseInt(timeyear.getText().toString());
                int Stimeday=Integer.parseInt(timeday.getText().toString());
                int Stimemonth=Integer.parseInt(timemonth.getText().toString());
                //数据保存操作
                Day day=new Day();
                day.setTimename(""+Stimename);
                day.setDay(Stimeday);
                day.setMonth(Stimemonth);
                day.setYear(Stimeyear);
                day.save();
                //创建倒数view
                Daycard();
                popupWindow.dismiss();
            }
        });




    }




}
