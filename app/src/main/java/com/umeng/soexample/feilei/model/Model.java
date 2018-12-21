package com.umeng.soexample.feilei.model;

import com.umeng.soexample.feilei.callback.MyCallBack;

public interface Model {
    void getData(String url, MyCallBack myCallBack);
}
