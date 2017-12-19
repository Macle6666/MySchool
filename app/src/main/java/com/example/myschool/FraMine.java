package com.example.myschool;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;
import android.widget.ImageButton;
import android.widget.PopupWindow;
import android.app.Activity;

import android.support.v7.app.AppCompatActivity;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.jar.Manifest;

import static android.app.Activity.RESULT_OK;


/**
 * Created by 德锐 on 2017/12/4.
 * 我的
 */

public class FraMine  extends  android.app.Fragment{

    private ImageButton setting;
    private PopupWindow popupWindow;
    private Button tianjia;
    private  ImageView mineImage;

    private EditText jiaoyu;
    private EditText qianming;
    private EditText jiaoyou;
    private EditText geren;
    private EditText ID;

    private TextView Tjiaoyu;
    private TextView Tqianming;
    private TextView Tjiaoyou;
    private TextView Tgeren;
    private TextView TID;

    public static  final  int CHOOSE_PHOTO=2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fra_mine,container,false);
        mineImage=(ImageView)view.findViewById(R.id.mine_image) ;
        setting=(ImageButton)view.findViewById(R.id.setting);
        Tjiaoyou=(TextView)view.findViewById(R.id.jiaoyou) ;
        Tjiaoyu=(TextView)view.findViewById(R.id.jiaoyu) ;
        Tgeren=(TextView)view.findViewById(R.id.geren) ;
        Tqianming=(TextView)view.findViewById(R.id.qianming) ;
        TID=(TextView)view.findViewById(R.id.mine_name) ;
        restore();
        setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initSet();
            }
        });
        mineImage.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {



                return false;
            }
        });

        return view;
    }

    private void openAlbum() {
        Intent intent=new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        startActivityForResult(intent,CHOOSE_PHOTO);//打开相册
    }


    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);



        }

    //更新文本
    public void restore()
    {


        SharedPreferences preferences=getActivity().getSharedPreferences("data", Context.MODE_PRIVATE);
        String RID=preferences.getString("ID","");
        String Rgeren=preferences.getString("geren","");
        String Rjiaoyu=preferences.getString("jiaoyu","");
        String Rjiaoyou=preferences.getString("jiaoyou","");
        String Rqianming=preferences.getString("qianming","");
        Tjiaoyou.setText(""+Rjiaoyou);
        Tjiaoyu.setText(""+Rjiaoyu);
        Tgeren.setText(""+Rgeren);
        Tqianming.setText(""+Rqianming);
        TID.setText(""+RID);

    }


    //设置窗口
    public void initSet(){
        View view= LayoutInflater.from(getActivity()).inflate(R.layout.set_popup,null,false);

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
        tianjia=(Button)view.findViewById(R.id.tianjia);
        ID=(EditText)view.findViewById(R.id.mine_ID);
        jiaoyou=(EditText)view.findViewById(R.id.mine_jiaoyou);
        jiaoyu=(EditText)view.findViewById(R.id.mine_jiaoyu);
        geren=(EditText)view.findViewById(R.id.mine_geren);
        qianming=(EditText)view.findViewById(R.id.mine_qianming);
        tianjia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Sjiaoyou=jiaoyou.getText().toString();
                String Sjiaoyu=jiaoyu.getText().toString();
                String Sgeren=geren.getText().toString();
                String Sqianming=qianming.getText().toString();
                String SID=ID.getText().toString();

                SharedPreferences.Editor editor = getActivity().getSharedPreferences("data",Context.MODE_PRIVATE).edit();
                editor.putString("ID",""+SID);
                editor.putString("jiaoyou",""+Sjiaoyou);
                editor.putString("jiaoyu",""+Sjiaoyu);
                editor.putString("geren",""+Sgeren);
                editor.putString("qianming",""+Sqianming);
                editor.apply();
                restore();
                popupWindow.dismiss();
            }
        });


    }


}
