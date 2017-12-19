package com.example.myschool;

import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.Nullable;

import android.support.v7.app.AlertDialog;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import org.litepal.crud.DataSupport;

import java.util.List;


/**
 * Created by 德锐 on 2017/12/4.
 * 课表
 */

public class FraCart extends android.app.Fragment {

    private ImageButton btn_add,btn_delete;
    private PopupWindow popupWindow;


    private  EditText inputDeleteDay;
    private EditText inputDeleteStart;
    private  Button btn_finish;
    private  Button btn_deletefinish;
    private EditText inputCourseName ;
    private EditText inputTeacher ;
    private EditText inputClassRoom ;
    private EditText inputDay;
    private EditText inputStart ;
    private EditText inputEnd ;

    private TextView day1class1name;
    private TextView day1class1where;
    private TextView day1class1teacher;
    private LinearLayout day1class1back;

    private TextView day1class3name;
    private TextView day1class3where;
    private TextView day1class3teacher;
    private LinearLayout day1class3back;

    private TextView day1class5name;
    private TextView day1class5where;
    private TextView day1class5teacher;
    private LinearLayout day1class5back;

    private TextView day1class7name;
    private TextView day1class7where;
    private TextView day1class7teacher;
    private LinearLayout day1class7back;

    private TextView day1class9name;
    private TextView day1class9where;
    private TextView day1class9teacher;
    private LinearLayout day1class9back;

    private TextView day1class11name;
    private TextView day1class11where;
    private TextView day1class11teacher;
    private LinearLayout day1class11back;

    private TextView day2class1name;
    private TextView day2class1where;
    private TextView day2class1teacher;
    private LinearLayout day2class1back;

    private TextView day2class3name;
    private TextView day2class3where;
    private TextView day2class3teacher;
    private LinearLayout day2class3back;

    private TextView day2class5name;
    private TextView day2class5where;
    private TextView day2class5teacher;
    private LinearLayout day2class5back;

    private TextView day2class7name;
    private TextView day2class7where;
    private TextView day2class7teacher;
    private LinearLayout day2class7back;

    private TextView day2class9name;
    private TextView day2class9where;
    private TextView day2class9teacher;
    private LinearLayout day2class9back;

    private TextView day2class11name;
    private TextView day2class11where;
    private TextView day2class11teacher;
    private LinearLayout day2class11back;

    private TextView day3class1name;
    private TextView day3class1where;
    private TextView day3class1teacher;
    private LinearLayout day3class1back;

    private TextView day3class3name;
    private TextView day3class3where;
    private TextView day3class3teacher;
    private LinearLayout day3class3back;

    private TextView day3class5name;
    private TextView day3class5where;
    private TextView day3class5teacher;
    private LinearLayout day3class5back;

    private TextView day3class7name;
    private TextView day3class7where;
    private TextView day3class7teacher;
    private LinearLayout day3class7back;

    private TextView day3class9name;
    private TextView day3class9where;
    private TextView day3class9teacher;
    private LinearLayout day3class9back;

    private TextView day3class11name;
    private TextView day3class11where;
    private TextView day3class11teacher;
    private LinearLayout day3class11back;

    private TextView day4class1name;
    private TextView day4class1where;
    private TextView day4class1teacher;
    private LinearLayout day4class1back;

    private TextView day4class3name;
    private TextView day4class3where;
    private TextView day4class3teacher;
    private LinearLayout day4class3back;

    private TextView day4class5name;
    private TextView day4class5where;
    private TextView day4class5teacher;
    private LinearLayout day4class5back;

    private TextView day4class7name;
    private TextView day4class7where;
    private TextView day4class7teacher;
    private LinearLayout day4class7back;

    private TextView day4class9name;
    private TextView day4class9where;
    private TextView day4class9teacher;
    private LinearLayout day4class9back;

    private TextView day4class11name;
    private TextView day4class11where;
    private TextView day4class11teacher;
    private LinearLayout day4class11back;

    private TextView day7class1name;
    private TextView day7class1where;
    private TextView day7class1teacher;
    private LinearLayout day7class1back;

    private TextView day7class3name;
    private TextView day7class3where;
    private TextView day7class3teacher;
    private LinearLayout day7class3back;

    private TextView day7class5name;
    private TextView day7class5where;
    private TextView day7class5teacher;
    private LinearLayout day7class5back;

    private TextView day7class7name;
    private TextView day7class7where;
    private TextView day7class7teacher;
    private LinearLayout day7class7back;

    private TextView day7class9name;
    private TextView day7class9where;
    private TextView day7class9teacher;
    private LinearLayout day7class9back;

    private TextView day7class11name;
    private TextView day7class11where;
    private TextView day7class11teacher;
    private LinearLayout day7class11back;

    private TextView day6class1name;
    private TextView day6class1where;
    private TextView day6class1teacher;
    private LinearLayout day6class1back;

    private TextView day6class3name;
    private TextView day6class3where;
    private TextView day6class3teacher;
    private LinearLayout day6class3back;

    private TextView day6class5name;
    private TextView day6class5where;
    private TextView day6class5teacher;
    private LinearLayout day6class5back;

    private TextView day6class7name;
    private TextView day6class7where;
    private TextView day6class7teacher;
    private LinearLayout day6class7back;

    private TextView day6class9name;
    private TextView day6class9where;
    private TextView day6class9teacher;
    private LinearLayout day6class9back;

    private TextView day6class11name;
    private TextView day6class11where;
    private TextView day6class11teacher;
    private LinearLayout day6class11back;

    private TextView day5class1name;
    private TextView day5class1where;
    private TextView day5class1teacher;
    private LinearLayout day5class1back;

    private TextView day5class3name;
    private TextView day5class3where;
    private TextView day5class3teacher;
    private LinearLayout day5class3back;

    private TextView day5class5name;
    private TextView day5class5where;
    private TextView day5class5teacher;
    private LinearLayout day5class5back;

    private TextView day5class7name;
    private TextView day5class7where;
    private TextView day5class7teacher;
    private LinearLayout day5class7back;

    private TextView day5class9name;
    private TextView day5class9where;
    private TextView day5class9teacher;
    private LinearLayout day5class9back;

    private TextView day5class11name;
    private TextView day5class11where;
    private TextView day5class11teacher;
    private LinearLayout day5class11back;


    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fra_cart,container,false);



        btn_add=(ImageButton) view.findViewById(R.id.add_class);
        btn_delete=(ImageButton)view.findViewById(R.id.delete_class);

        day1class1name=(TextView)view.findViewById(R.id.day1class1name);
        day1class1where=(TextView)view.findViewById(R.id.day1class1where);
        day1class1teacher=(TextView)view.findViewById(R.id.day1class1teacher);
        day1class1back=(LinearLayout)view.findViewById(R.id.day1class1back) ;

        day1class3name=(TextView)view.findViewById(R.id.day1class3name);
        day1class3where=(TextView)view.findViewById(R.id.day1class3where);
        day1class3teacher=(TextView)view.findViewById(R.id.day1class3teacher);
        day1class3back=(LinearLayout)view.findViewById(R.id.day1class3back) ;

        day1class5name=(TextView)view.findViewById(R.id.day1class5name);
        day1class5where=(TextView)view.findViewById(R.id.day1class5where);
        day1class5teacher=(TextView)view.findViewById(R.id.day1class5teacher);
        day1class5back=(LinearLayout)view.findViewById(R.id.day1class5back) ;

        day1class7name=(TextView)view.findViewById(R.id.day1class7name);
        day1class7where=(TextView)view.findViewById(R.id.day1class7where);
        day1class7teacher=(TextView)view.findViewById(R.id.day1class7teacher);
        day1class7back=(LinearLayout)view.findViewById(R.id.day1class7back) ;

        day1class9name=(TextView)view.findViewById(R.id.day1class9name);
        day1class9where=(TextView)view.findViewById(R.id.day1class9where);
        day1class9teacher=(TextView)view.findViewById(R.id.day1class9teacher);
        day1class9back=(LinearLayout)view.findViewById(R.id.day1class9back) ;

        day1class11name=(TextView)view.findViewById(R.id.day1class11name);
        day1class11where=(TextView)view.findViewById(R.id.day1class11where);
        day1class11teacher=(TextView)view.findViewById(R.id.day1class11teacher);
        day1class11back=(LinearLayout)view.findViewById(R.id.day1class11back) ;

        day2class1name=(TextView)view.findViewById(R.id.day2class1name);
        day2class1where=(TextView)view.findViewById(R.id.day2class1where);
        day2class1teacher=(TextView)view.findViewById(R.id.day2class1teacher);
        day2class1back=(LinearLayout)view.findViewById(R.id.day2class1back) ;

        day2class3name=(TextView)view.findViewById(R.id.day2class3name);
        day2class3where=(TextView)view.findViewById(R.id.day2class3where);
        day2class3teacher=(TextView)view.findViewById(R.id.day2class3teacher);
        day2class3back=(LinearLayout)view.findViewById(R.id.day2class3back) ;

        day2class5name=(TextView)view.findViewById(R.id.day2class5name);
        day2class5where=(TextView)view.findViewById(R.id.day2class5where);
        day2class5teacher=(TextView)view.findViewById(R.id.day2class5teacher);
        day2class5back=(LinearLayout)view.findViewById(R.id.day2class5back) ;

        day2class7name=(TextView)view.findViewById(R.id.day2class7name);
        day2class7where=(TextView)view.findViewById(R.id.day2class7where);
        day2class7teacher=(TextView)view.findViewById(R.id.day2class7teacher);
        day2class7back=(LinearLayout)view.findViewById(R.id.day2class7back) ;

        day2class9name=(TextView)view.findViewById(R.id.day2class9name);
        day2class9where=(TextView)view.findViewById(R.id.day2class9where);
        day2class9teacher=(TextView)view.findViewById(R.id.day2class9teacher);
        day2class9back=(LinearLayout)view.findViewById(R.id.day2class9back) ;

        day2class11name=(TextView)view.findViewById(R.id.day2class11name);
        day2class11where=(TextView)view.findViewById(R.id.day2class11where);
        day2class11teacher=(TextView)view.findViewById(R.id.day2class11teacher);
        day2class11back=(LinearLayout)view.findViewById(R.id.day2class11back) ;

        day3class1name=(TextView)view.findViewById(R.id.day3class1name);
        day3class1where=(TextView)view.findViewById(R.id.day3class1where);
        day3class1teacher=(TextView)view.findViewById(R.id.day3class1teacher);
        day3class1back=(LinearLayout)view.findViewById(R.id.day3class1back) ;

        day3class3name=(TextView)view.findViewById(R.id.day3class3name);
        day3class3where=(TextView)view.findViewById(R.id.day3class3where);
        day3class3teacher=(TextView)view.findViewById(R.id.day3class3teacher);
        day3class3back=(LinearLayout)view.findViewById(R.id.day3class3back) ;

        day3class5name=(TextView)view.findViewById(R.id.day3class5name);
        day3class5where=(TextView)view.findViewById(R.id.day3class5where);
        day3class5teacher=(TextView)view.findViewById(R.id.day3class5teacher);
        day3class5back=(LinearLayout)view.findViewById(R.id.day3class5back) ;

        day3class7name=(TextView)view.findViewById(R.id.day3class7name);
        day3class7where=(TextView)view.findViewById(R.id.day3class7where);
        day3class7teacher=(TextView)view.findViewById(R.id.day3class7teacher);
        day3class7back=(LinearLayout)view.findViewById(R.id.day3class7back) ;

        day3class9name=(TextView)view.findViewById(R.id.day3class9name);
        day3class9where=(TextView)view.findViewById(R.id.day3class9where);
        day3class9teacher=(TextView)view.findViewById(R.id.day3class9teacher);
        day3class9back=(LinearLayout)view.findViewById(R.id.day3class9back) ;

        day3class11name=(TextView)view.findViewById(R.id.day3class11name);
        day3class11where=(TextView)view.findViewById(R.id.day3class11where);
        day3class11teacher=(TextView)view.findViewById(R.id.day3class11teacher);
        day3class11back=(LinearLayout)view.findViewById(R.id.day3class11back) ;

        day4class1name=(TextView)view.findViewById(R.id.day4class1name);
        day4class1where=(TextView)view.findViewById(R.id.day4class1where);
        day4class1teacher=(TextView)view.findViewById(R.id.day4class1teacher);
        day4class1back=(LinearLayout)view.findViewById(R.id.day4class1back) ;

        day4class3name=(TextView)view.findViewById(R.id.day4class3name);
        day4class3where=(TextView)view.findViewById(R.id.day4class3where);
        day4class3teacher=(TextView)view.findViewById(R.id.day4class3teacher);
        day4class3back=(LinearLayout)view.findViewById(R.id.day4class3back) ;

        day4class5name=(TextView)view.findViewById(R.id.day4class5name);
        day4class5where=(TextView)view.findViewById(R.id.day4class5where);
        day4class5teacher=(TextView)view.findViewById(R.id.day4class5teacher);
        day4class5back=(LinearLayout)view.findViewById(R.id.day4class5back) ;

        day4class7name=(TextView)view.findViewById(R.id.day4class7name);
        day4class7where=(TextView)view.findViewById(R.id.day4class7where);
        day4class7teacher=(TextView)view.findViewById(R.id.day4class7teacher);
        day4class7back=(LinearLayout)view.findViewById(R.id.day4class7back) ;

        day4class9name=(TextView)view.findViewById(R.id.day4class9name);
        day4class9where=(TextView)view.findViewById(R.id.day4class9where);
        day4class9teacher=(TextView)view.findViewById(R.id.day4class9teacher);
        day4class9back=(LinearLayout)view.findViewById(R.id.day4class9back) ;

        day4class11name=(TextView)view.findViewById(R.id.day4class11name);
        day4class11where=(TextView)view.findViewById(R.id.day4class11where);
        day4class11teacher=(TextView)view.findViewById(R.id.day4class11teacher);
        day4class11back=(LinearLayout)view.findViewById(R.id.day4class11back) ;

        day5class1name=(TextView)view.findViewById(R.id.day5class1name);
        day5class1where=(TextView)view.findViewById(R.id.day5class1where);
        day5class1teacher=(TextView)view.findViewById(R.id.day5class1teacher);
        day5class1back=(LinearLayout)view.findViewById(R.id.day5class1back) ;

        day5class3name=(TextView)view.findViewById(R.id.day5class3name);
        day5class3where=(TextView)view.findViewById(R.id.day5class3where);
        day5class3teacher=(TextView)view.findViewById(R.id.day5class3teacher);
        day5class3back=(LinearLayout)view.findViewById(R.id.day5class3back) ;

        day5class5name=(TextView)view.findViewById(R.id.day5class5name);
        day5class5where=(TextView)view.findViewById(R.id.day5class5where);
        day5class5teacher=(TextView)view.findViewById(R.id.day5class5teacher);
        day5class5back=(LinearLayout)view.findViewById(R.id.day5class5back) ;

        day5class7name=(TextView)view.findViewById(R.id.day5class7name);
        day5class7where=(TextView)view.findViewById(R.id.day5class7where);
        day5class7teacher=(TextView)view.findViewById(R.id.day5class7teacher);
        day5class7back=(LinearLayout)view.findViewById(R.id.day5class7back) ;

        day5class9name=(TextView)view.findViewById(R.id.day5class9name);
        day5class9where=(TextView)view.findViewById(R.id.day5class9where);
        day5class9teacher=(TextView)view.findViewById(R.id.day5class9teacher);
        day5class9back=(LinearLayout)view.findViewById(R.id.day5class9back) ;

        day5class11name=(TextView)view.findViewById(R.id.day5class11name);
        day5class11where=(TextView)view.findViewById(R.id.day5class11where);
        day5class11teacher=(TextView)view.findViewById(R.id.day5class11teacher);
        day5class11back=(LinearLayout)view.findViewById(R.id.day5class11back) ;

        day6class1name=(TextView)view.findViewById(R.id.day6class1name);
        day6class1where=(TextView)view.findViewById(R.id.day6class1where);
        day6class1teacher=(TextView)view.findViewById(R.id.day6class1teacher);
        day6class1back=(LinearLayout)view.findViewById(R.id.day6class1back) ;

        day6class3name=(TextView)view.findViewById(R.id.day6class3name);
        day6class3where=(TextView)view.findViewById(R.id.day6class3where);
        day6class3teacher=(TextView)view.findViewById(R.id.day6class3teacher);
        day6class3back=(LinearLayout)view.findViewById(R.id.day6class3back) ;

        day6class5name=(TextView)view.findViewById(R.id.day6class5name);
        day6class5where=(TextView)view.findViewById(R.id.day6class5where);
        day6class5teacher=(TextView)view.findViewById(R.id.day6class5teacher);
        day6class5back=(LinearLayout)view.findViewById(R.id.day6class5back) ;

        day6class7name=(TextView)view.findViewById(R.id.day6class7name);
        day6class7where=(TextView)view.findViewById(R.id.day6class7where);
        day6class7teacher=(TextView)view.findViewById(R.id.day6class7teacher);
        day6class7back=(LinearLayout)view.findViewById(R.id.day6class7back) ;

        day6class9name=(TextView)view.findViewById(R.id.day6class9name);
        day6class9where=(TextView)view.findViewById(R.id.day6class9where);
        day6class9teacher=(TextView)view.findViewById(R.id.day6class9teacher);
        day6class9back=(LinearLayout)view.findViewById(R.id.day6class9back) ;

        day6class11name=(TextView)view.findViewById(R.id.day6class11name);
        day6class11where=(TextView)view.findViewById(R.id.day6class11where);
        day6class11teacher=(TextView)view.findViewById(R.id.day6class11teacher);
        day6class11back=(LinearLayout)view.findViewById(R.id.day6class11back) ;

        day7class1name=(TextView)view.findViewById(R.id.day7class1name);
        day7class1where=(TextView)view.findViewById(R.id.day7class1where);
        day7class1teacher=(TextView)view.findViewById(R.id.day7class1teacher);
        day7class1back=(LinearLayout)view.findViewById(R.id.day7class1back) ;

        day7class3name=(TextView)view.findViewById(R.id.day7class3name);
        day7class3where=(TextView)view.findViewById(R.id.day7class3where);
        day7class3teacher=(TextView)view.findViewById(R.id.day7class3teacher);
        day7class3back=(LinearLayout)view.findViewById(R.id.day7class3back) ;

        day7class5name=(TextView)view.findViewById(R.id.day7class5name);
        day7class5where=(TextView)view.findViewById(R.id.day7class5where);
        day7class5teacher=(TextView)view.findViewById(R.id.day7class5teacher);
        day7class5back=(LinearLayout)view.findViewById(R.id.day7class5back) ;

        day7class7name=(TextView)view.findViewById(R.id.day7class7name);
        day7class7where=(TextView)view.findViewById(R.id.day7class7where);
        day7class7teacher=(TextView)view.findViewById(R.id.day7class7teacher);
        day7class7back=(LinearLayout)view.findViewById(R.id.day7class7back) ;

        day7class9name=(TextView)view.findViewById(R.id.day7class9name);
        day7class9where=(TextView)view.findViewById(R.id.day7class9where);
        day7class9teacher=(TextView)view.findViewById(R.id.day7class9teacher);
        day7class9back=(LinearLayout)view.findViewById(R.id.day7class9back) ;

        day7class11name=(TextView)view.findViewById(R.id.day7class11name);
        day7class11where=(TextView)view.findViewById(R.id.day7class11where);
        day7class11teacher=(TextView)view.findViewById(R.id.day7class11teacher);
        day7class11back=(LinearLayout)view.findViewById(R.id.day7class11back) ;

        initClassCard();

        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              initAddPopup(v);


            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initDeletePopup(v);
            }
        });


        return view;
    }






    //创建课程卡片
    public  void initClassCard(){
      //查询课程数据
        List<Crouse> crouseList=DataSupport.findAll(Crouse.class);
        for (Crouse crouse: crouseList){

            //  course_name, teacher, class_room, day, start, end

           switch (crouse.getDay()){
               case 1:
                   switch (crouse.getStart()){
                       case 1:
                           day1class1back.setBackgroundColor(Color.parseColor("#D1EEEE"));
                           day1class1name.setText(""+crouse.getCourseName());
                           day1class1where.setText(""+crouse.getClassRoom());
                           day1class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day1class3back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day1class3name.setText(""+crouse.getCourseName());
                           day1class3where.setText(""+crouse.getClassRoom());
                           day1class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day1class5back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day1class5name.setText(""+crouse.getCourseName());
                           day1class5where.setText(""+crouse.getClassRoom());
                           day1class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day1class7back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day1class7name.setText(""+crouse.getCourseName());
                           day1class7where.setText(""+crouse.getClassRoom());
                           day1class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day1class9back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day1class9name.setText(""+crouse.getCourseName());
                           day1class9where.setText(""+crouse.getClassRoom());
                           day1class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day1class11back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day1class11name.setText(""+crouse.getCourseName());
                           day1class11where.setText(""+crouse.getClassRoom());
                           day1class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
               case 2:
                   switch (crouse.getStart()){
                       case 1:
                           day2class1back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day2class1name.setText(""+crouse.getCourseName());
                           day2class1where.setText(""+crouse.getClassRoom());
                           day2class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day2class3back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day2class3name.setText(""+crouse.getCourseName());
                           day2class3where.setText(""+crouse.getClassRoom());
                           day2class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day2class5back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day2class5name.setText(""+crouse.getCourseName());
                           day2class5where.setText(""+crouse.getClassRoom());
                           day2class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day2class7back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day2class7name.setText(""+crouse.getCourseName());
                           day2class7where.setText(""+crouse.getClassRoom());
                           day2class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day2class9back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day2class9name.setText(""+crouse.getCourseName());
                           day2class9where.setText(""+crouse.getClassRoom());
                           day2class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day2class11back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day2class11name.setText(""+crouse.getCourseName());
                           day2class11where.setText(""+crouse.getClassRoom());
                           day2class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
               case 3:
                   switch (crouse.getStart()){
                       case 1:
                           day3class1back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day3class1name.setText(""+crouse.getCourseName());
                           day3class1where.setText(""+crouse.getClassRoom());
                           day3class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day3class3back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day3class3name.setText(""+crouse.getCourseName());
                           day3class3where.setText(""+crouse.getClassRoom());
                           day3class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day3class5back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day3class5name.setText(""+crouse.getCourseName());
                           day3class5where.setText(""+crouse.getClassRoom());
                           day3class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day3class7back.setBackgroundColor(Color.parseColor("#D1EEEE"));
                           day3class7name.setText(""+crouse.getCourseName());
                           day3class7where.setText(""+crouse.getClassRoom());
                           day3class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day3class9back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day3class9name.setText(""+crouse.getCourseName());
                           day3class9where.setText(""+crouse.getClassRoom());
                           day3class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day3class11back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day3class11name.setText(""+crouse.getCourseName());
                           day3class11where.setText(""+crouse.getClassRoom());
                           day3class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
               case 4:
                   switch (crouse.getStart()){
                       case 1:
                           day4class1back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day4class1name.setText(""+crouse.getCourseName());
                           day4class1where.setText(""+crouse.getClassRoom());
                           day4class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day4class3back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day4class3name.setText(""+crouse.getCourseName());
                           day4class3where.setText(""+crouse.getClassRoom());
                           day4class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day4class5back.setBackgroundColor(Color.parseColor("#D1EEEE"));
                           day4class5name.setText(""+crouse.getCourseName());
                           day4class5where.setText(""+crouse.getClassRoom());
                           day4class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day4class7back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day4class7name.setText(""+crouse.getCourseName());
                           day4class7where.setText(""+crouse.getClassRoom());
                           day4class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day4class9back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day4class9name.setText(""+crouse.getCourseName());
                           day4class9where.setText(""+crouse.getClassRoom());
                           day4class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day4class11back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day4class11name.setText(""+crouse.getCourseName());
                           day4class11where.setText(""+crouse.getClassRoom());
                           day4class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
               case 5:
                   switch (crouse.getStart()){
                       case 1:
                           day5class1back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day5class1name.setText(""+crouse.getCourseName());
                           day5class1where.setText(""+crouse.getClassRoom());
                           day5class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day5class3back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day5class3name.setText(""+crouse.getCourseName());
                           day5class3where.setText(""+crouse.getClassRoom());
                           day5class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day5class5back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day5class5name.setText(""+crouse.getCourseName());
                           day5class5where.setText(""+crouse.getClassRoom());
                           day5class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day5class7back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day5class7name.setText(""+crouse.getCourseName());
                           day5class7where.setText(""+crouse.getClassRoom());
                           day5class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day5class9back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day5class9name.setText(""+crouse.getCourseName());
                           day5class9where.setText(""+crouse.getClassRoom());
                           day5class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day5class11back.setBackgroundColor(Color.parseColor("#D1EEEE"));
                           day5class11name.setText(""+crouse.getCourseName());
                           day5class11where.setText(""+crouse.getClassRoom());
                           day5class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
               case 6:
                   switch (crouse.getStart()){
                       case 1:
                           day6class1back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day6class1name.setText(""+crouse.getCourseName());
                           day6class1where.setText(""+crouse.getClassRoom());
                           day6class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day6class3back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day6class3name.setText(""+crouse.getCourseName());
                           day6class3where.setText(""+crouse.getClassRoom());
                           day6class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day6class5back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day6class5name.setText(""+crouse.getCourseName());
                           day6class5where.setText(""+crouse.getClassRoom());
                           day6class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day6class7back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day6class7name.setText(""+crouse.getCourseName());
                           day6class7where.setText(""+crouse.getClassRoom());
                           day6class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day6class9back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day6class9name.setText(""+crouse.getCourseName());
                           day6class9where.setText(""+crouse.getClassRoom());
                           day6class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day6class11back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day6class11name.setText(""+crouse.getCourseName());
                           day6class11where.setText(""+crouse.getClassRoom());
                           day6class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
               case 7:
                   switch (crouse.getStart()){
                       case 1:
                           day7class1back.setBackgroundColor(Color.parseColor("#D1EEEE"));
                           day7class1name.setText(""+crouse.getCourseName());
                           day7class1where.setText(""+crouse.getClassRoom());
                           day7class1teacher.setText(""+crouse.getTeacher());
                           break;
                       case 3:
                           day7class3back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day7class3name.setText(""+crouse.getCourseName());
                           day7class3where.setText(""+crouse.getClassRoom());
                           day7class3teacher.setText(""+crouse.getTeacher());
                           break;
                       case 5:
                           day7class5back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day7class5name.setText(""+crouse.getCourseName());
                           day7class5where.setText(""+crouse.getClassRoom());
                           day7class5teacher.setText(""+crouse.getTeacher());
                           break;
                       case 7:
                           day7class7back.setBackgroundColor(Color.parseColor("#ADFF2F"));
                           day7class7name.setText(""+crouse.getCourseName());
                           day7class7where.setText(""+crouse.getClassRoom());
                           day7class7teacher.setText(""+crouse.getTeacher());
                           break;
                       case 9:
                           day7class9back.setBackgroundColor(Color.parseColor("#EEEE00"));
                           day7class9name.setText(""+crouse.getCourseName());
                           day7class9where.setText(""+crouse.getClassRoom());
                           day7class9teacher.setText(""+crouse.getTeacher());
                           break;
                       case 11:
                           day7class11back.setBackgroundColor(Color.parseColor("#F5F5DC"));
                           day7class11name.setText(""+crouse.getCourseName());
                           day7class11where.setText(""+crouse.getClassRoom());
                           day7class11teacher.setText(""+crouse.getTeacher());
                           break;
                   }
                   break;
           }


        }

    }

    //课程表关闭开启一个悬浮框
    public  void initDeletePopup(View v){
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.delete_popup,null,false);

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
        btn_deletefinish=(Button) view.findViewById(R.id.button_delete);

        inputDeleteDay=(EditText)view.findViewById(R.id.delete_day);
        inputDeleteStart=(EditText)view.findViewById(R.id.delete_start);

       btn_deletefinish.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               int day = Integer.parseInt(inputDeleteDay.getText().toString());
               int start= Integer.parseInt(inputDeleteStart.getText().toString());
               if(day==1||day==2||day==3||day==4||day==5||day==6||day==7)
               {
                   if((start==1) || (start==3) ||(start==5) ||(start==7) ||(start==9) ||(start==112) )
                   {  //  course_name, teacher, class_room, day, start, end 数据存入数据库

                       DataSupport.deleteAll(Crouse.class,"day=? and start=?",""+day,""+start);


                       switch (day){
                           case 1:
                               switch (start){
                                   case 1:
                                       day1class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day1class1name.setText(null);
                                       day1class1where.setText(null);
                                       day1class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day1class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day1class3name.setText(null);
                                       day1class3where.setText(null);
                                       day1class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day1class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day1class5name.setText(null);
                                       day1class5where.setText(null);
                                       day1class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day1class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day1class7name.setText(null);
                                       day1class7where.setText(null);
                                       day1class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day1class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day1class9name.setText(null);
                                       day1class9where.setText(null);
                                       day1class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day1class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day1class11name.setText(null);
                                       day1class11where.setText(null);
                                       day1class11teacher.setText(null);
                                       break;
                               }
                               break;
                           case 2:
                               switch (start){
                                   case 1:
                                       day2class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day2class1name.setText(null);
                                       day2class1where.setText(null);
                                       day2class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day2class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day2class3name.setText(null);
                                       day2class3where.setText(null);
                                       day2class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day2class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day2class5name.setText(null);
                                       day2class5where.setText(null);
                                       day2class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day2class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day2class7name.setText(null);
                                       day2class7where.setText(null);
                                       day2class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day2class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day2class9name.setText(null);
                                       day2class9where.setText(null);
                                       day2class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day2class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day2class11name.setText(null);
                                       day2class11where.setText(null);
                                       day2class11teacher.setText(null);
                                       break;
                               }
                               break;
                           case 3:
                               switch (start){
                                   case 1:
                                       day3class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day3class1name.setText(null);
                                       day3class1where.setText(null);
                                       day3class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day3class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day3class3name.setText(null);
                                       day3class3where.setText(null);
                                       day3class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day3class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day3class5name.setText(null);
                                       day3class5where.setText(null);
                                       day3class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day3class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day3class7name.setText(null);
                                       day3class7where.setText(null);
                                       day3class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day3class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day3class9name.setText(null);
                                       day3class9where.setText(null);
                                       day3class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day3class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day3class11name.setText(null);
                                       day3class11where.setText(null);
                                       day3class11teacher.setText(null);
                                       break;
                               }
                               break;
                           case 4:
                               switch (start){
                                   case 1:
                                       day4class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day4class1name.setText(null);
                                       day4class1where.setText(null);
                                       day4class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day4class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day4class3name.setText(null);
                                       day4class3where.setText(null);
                                       day4class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day4class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day4class5name.setText(null);
                                       day4class5where.setText(null);
                                       day4class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day4class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day4class7name.setText(null);
                                       day4class7where.setText(null);
                                       day4class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day4class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day4class9name.setText(null);
                                       day4class9where.setText(null);
                                       day4class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day4class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day4class11name.setText(null);
                                       day4class11where.setText(null);
                                       day4class11teacher.setText(null);
                                       break;
                               }
                               break;
                           case 5:
                               switch (start){
                                   case 1:
                                       day5class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day5class1name.setText(null);
                                       day5class1where.setText(null);
                                       day5class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day5class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day5class3name.setText(null);
                                       day5class3where.setText(null);
                                       day5class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day5class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day5class5name.setText(null);
                                       day5class5where.setText(null);
                                       day5class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day5class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day5class7name.setText(null);
                                       day5class7where.setText(null);
                                       day5class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day5class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day5class9name.setText(null);
                                       day5class9where.setText(null);
                                       day5class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day5class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day5class11name.setText(null);
                                       day5class11where.setText(null);
                                       day5class11teacher.setText(null);
                                       break;
                               }
                               break;
                           case 6:
                               switch (start){
                                   case 1:
                                       day6class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day6class1name.setText(null);
                                       day6class1where.setText(null);
                                       day6class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day6class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day6class3name.setText(null);
                                       day6class3where.setText(null);
                                       day6class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day6class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day6class5name.setText(null);
                                       day6class5where.setText(null);
                                       day6class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day6class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day6class7name.setText(null);
                                       day6class7where.setText(null);
                                       day6class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day6class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day6class9name.setText(null);
                                       day6class9where.setText(null);
                                       day6class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day6class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day6class11name.setText(null);
                                       day6class11where.setText(null);
                                       day6class11teacher.setText(null);
                                       break;
                               }
                               break;
                           case 7:
                               switch (start){
                                   case 1:
                                       day7class1back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day7class1name.setText(null);
                                       day7class1where.setText(null);
                                       day7class1teacher.setText(null);
                                       break;
                                   case 3:
                                       day7class3back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day7class3name.setText(null);
                                       day7class3where.setText(null);
                                       day7class3teacher.setText(null);
                                       break;
                                   case 5:
                                       day7class5back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day7class5name.setText(null);
                                       day7class5where.setText(null);
                                       day7class5teacher.setText(null);
                                       break;
                                   case 7:
                                       day7class7back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day7class7name.setText(null);
                                       day7class7where.setText(null);
                                       day7class7teacher.setText(null);
                                       break;
                                   case 9:
                                       day7class9back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day7class9name.setText(null);
                                       day7class9where.setText(null);
                                       day7class9teacher.setText(null);
                                       break;
                                   case 11:
                                       day7class11back.setBackgroundColor(Color.parseColor("#01000000"));
                                       day7class11name.setText(null);
                                       day7class11where.setText(null);
                                       day7class11teacher.setText(null);
                                       break;
                               }
                               break;
                       }
                       popupWindow.dismiss();

                   }
               }else {
                   Toast.makeText(getActivity(), "输入内容有错！", Toast.LENGTH_LONG).show();
               }

           }
       });


    }
    //课程表添加开启一个悬浮框
    public  void initAddPopup(View v){
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.add_popup,null,false);

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

        btn_finish=(Button)view.findViewById(R.id.button_finish);

        inputCourseName=(EditText)view.findViewById(R.id.course_name);
        inputTeacher=(EditText)view.findViewById(R.id.teacher_name);
        inputClassRoom=(EditText)view.findViewById(R.id.class_room);
        inputDay=(EditText)view.findViewById(R.id.week);
        inputStart=(EditText)view.findViewById(R.id.classes_begin);
        inputEnd=(EditText)view.findViewById(R.id.classes_ends);
        btn_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String courseName = inputCourseName.getText().toString();
                String teacher = inputTeacher.getText().toString();
                String classRoom = inputClassRoom.getText().toString();
                String day1 = inputDay.getText().toString();
                int day = Integer.parseInt(day1);
                String start1 = inputStart.getText().toString();
                int start = Integer.parseInt(start1);
                String end1 = inputEnd.getText().toString();
                int end = Integer.parseInt(end1);

                if(day==1||day==2||day==3||day==4||day==5||day==6||day==7)
                {
                    if((start==1&&end==2) || (start==3&&end==4) ||(start==5&&end==6) ||(start==7&&end==8) ||(start==9&&end==10) ||(start==11&&end==12) )
                    {  //  course_name, teacher, class_room, day, start, end 数据存入数据库
                        Crouse crouse=new Crouse();
                        crouse.setCourseName(""+courseName);
                        crouse.setTeacher(""+teacher);
                        crouse.setClassRoom(""+classRoom);
                        crouse.setDay(day);
                        crouse.setStart(start);
                        crouse.setEnd(end);
                        crouse.save();

                        initClassCard();
                        popupWindow.dismiss();

                    }
                }else {
                    Toast.makeText(getActivity(), "输入内容有错！", Toast.LENGTH_LONG).show();
                }














            }
        });


    }




}
