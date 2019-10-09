package android.pims.com.beijingnews.fragment;
/*
* 作者：刘思慧  on 2019/10/07
* 微信号：lsh666888
* QQ号：1252353927
* 作用：左侧菜单的Fragment
* */


import android.graphics.Color;
import android.pims.com.beijingnews.base.BaseFragment;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;


public class LeftmeauFragment extends BaseFragment {

    private TextView textView;

    @Override
    public View initView() {
        textView=new TextView(context);
        textView.setTextSize(23);
        textView.setGravity(Gravity.CENTER);
        textView.setTextColor(Color.RED);
        return textView;
    }

    public void initData(){
        super.initData();

       // textView.setText("左侧菜单页面");
    }

}
