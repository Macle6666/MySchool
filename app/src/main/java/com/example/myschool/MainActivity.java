package com.example.myschool;

        import android.app.Activity;
        import android.app.Fragment;
        import android.content.Context;
        import android.content.SharedPreferences;
        import android.graphics.PixelFormat;
        import android.graphics.drawable.ColorDrawable;
        import android.support.annotation.IdRes;
        import android.support.v4.app.FragmentActivity;

        import android.app.FragmentManager;
        import android.app.FragmentTransaction;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.support.v7.widget.Toolbar;
        import android.view.Gravity;
        import android.view.LayoutInflater;
        import android.view.MotionEvent;
        import android.view.View;
        import android.view.ViewGroup;
        import android.view.Window;
        import android.view.WindowManager;
        import android.widget.Button;
        import android.widget.LinearLayout;
        import android.widget.PopupWindow;
        import android.widget.RadioButton;
        import android.widget.RadioGroup;
        import android.widget.Toast;

        import org.litepal.LitePal;

        import static android.R.attr.data;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener
{
    private  RadioGroup radioGroup;
    private RadioButton message;
    private FragmentManager fManager;
    private Button btn_add;
    private  PopupWindow popupWindow;
    private Toolbar toolbar; //工具条


    private FraWxb fraWxb;
    private FraMine fraMine;
    private FraMessage fraMessage;
    private FraCart fraCart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        //创建数据库
        LitePal.getDatabase();

        fManager=getFragmentManager(); //开启一个碎片管理器
        //设置监听
        radioGroup=(RadioGroup)findViewById(R.id.bottom_rg);
        radioGroup.setOnCheckedChangeListener(this);
        //获取单选按钮，设置为选中
        message=(RadioButton)findViewById(R.id.rb_message);
        message.setChecked(true);


    }



    @Override//监听
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        FragmentTransaction fragmentTransaction=fManager.beginTransaction();//开启事务
        hidtFragment(fragmentTransaction);
        switch (checkedId){
            case R.id.rb_message:
                if (fraMessage==null){
                    fraMessage=new FraMessage();

                    fragmentTransaction.add(R.id.ly_content,fraMessage);
                } else{
                    fragmentTransaction.show(fraMessage);
                }
                break;
            case R.id.rb_wxb:
                if (fraWxb==null){
                    fraWxb=new FraWxb();
                    fragmentTransaction.add(R.id.ly_content,fraWxb);
                } else{
                    fragmentTransaction.show(fraWxb);
                }
                break;
            case R.id.rb_cart:
                if (fraCart==null){
                    fraCart=new FraCart();
                    fragmentTransaction.add(R.id.ly_content,fraCart);

                } else{
                    fragmentTransaction.show(fraCart);
                }
                break;
            case R.id.rb_mine:
                if (fraMine==null){
                    fraMine=new FraMine();
                    fragmentTransaction.add(R.id.ly_content,fraMine);
                } else{
                    fragmentTransaction.show(fraMine);
                }
                break;
        }
       fragmentTransaction.commit();
    }

    //隐藏所有Fragment
     private void hidtFragment(FragmentTransaction fragmentTransaction){
         if (fraCart != null){
                   fragmentTransaction.hide(fraCart);
                }
         if (fraMessage != null){
                    fragmentTransaction.hide(fraMessage);
                }
         if (fraMine != null){
                    fragmentTransaction.hide(fraMine);
                }
          if (fraWxb != null){
              fragmentTransaction.hide(fraWxb);
                }
        }



}
