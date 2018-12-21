package com.umeng.soexample.feilei.view;


public interface IView<T> {
    void success(T user);
    void error(T error);
}
