package com.umeng.soexample.feilei.model;

import android.os.Handler;
import android.os.Message;

import com.google.gson.Gson;
import com.umeng.soexample.feilei.bean.MyData;
import com.umeng.soexample.feilei.callback.MyCallBack;
import com.umeng.soexample.feilei.utils.OkHttpUtils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class ModelImpl implements Model {
    private Handler mHandler = new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            String s = (String) msg.obj;
            Gson gson = new Gson();
            MyData myData =gson.fromJson(s,MyData.class);
            myCallBack.setSuccess(myData);
        }
    };
    private MyCallBack myCallBack;
    @Override
    public void getData(String url, MyCallBack myCallBack) {
        this.myCallBack= myCallBack;
        OkHttpUtils.getInstance().getAsync(url, new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {

            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                String string = response.body().string();
                mHandler.sendMessage(mHandler.obtainMessage(0,string));
            }
        });
    }
}
