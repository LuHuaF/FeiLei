package com.umeng.soexample.feilei.weight;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.umeng.soexample.feilei.R;

public class MyView extends LinearLayout implements View.OnClickListener {
    private TextView jian;
    private TextView num;
    private TextView jia;
    private int count=0;
    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
        LayoutInflater.from(context).inflate(R.layout.my_view,this);
        initView();
    }

    private void initView() {
        jian = findViewById(R.id.jian);
        num = findViewById(R.id.num);
        jia = findViewById(R.id.jia);

        jian.setOnClickListener(this);
        jia.setOnClickListener(this);
    }
    public void setCount(int count) {
        this.count = count;
        if(count==0){
            jian.setVisibility(GONE);
            num.setVisibility(GONE);
        }else{
            jian.setVisibility(VISIBLE);
            num.setVisibility(VISIBLE);
        }
        num.setText(count+"");
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.jian:
                if(count>0){
                    count--;
                    num.setText(count+"");
                    if(countCallBack!=null){
                        countCallBack.setNum(count);
                    }
                }
                break;
            case R.id.jia:
                count++;
                num.setText(count+"");
                if(countCallBack!=null){
                    countCallBack.setNum(count);
                }
                break;
        }
    }
    //接口回调
    public interface  CountCallBack{
        void setNum(int num);
    }
    private CountCallBack countCallBack;
    public  void getNum(CountCallBack countCallBack){
        this.countCallBack = countCallBack;
    }
}
