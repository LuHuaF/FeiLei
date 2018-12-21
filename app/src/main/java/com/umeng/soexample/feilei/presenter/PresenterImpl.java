package com.umeng.soexample.feilei.presenter;

import com.umeng.soexample.feilei.callback.MyCallBack;
import com.umeng.soexample.feilei.model.ModelImpl;
import com.umeng.soexample.feilei.view.IView;

public class PresenterImpl implements Presenter {
    private IView iView;
    private ModelImpl model;

    public PresenterImpl(IView iView) {
        this.iView = iView;
        model = new ModelImpl();
    }

    @Override
    public void startRequest(String url) {
        model.getData(url, new MyCallBack() {
            @Override
            public void setSuccess(Object successData) {
                iView.success(successData);
            }

            @Override
            public void setError(Object errorData) {
                iView.error(errorData);
            }
        });
    }
}
