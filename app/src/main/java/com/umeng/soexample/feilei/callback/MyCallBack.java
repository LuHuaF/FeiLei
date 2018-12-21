package com.umeng.soexample.feilei.callback;

public interface MyCallBack<T> {
    void setSuccess(T successData);
    void setError(T errorData);
}
