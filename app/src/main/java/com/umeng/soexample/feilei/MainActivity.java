package com.umeng.soexample.feilei;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.umeng.soexample.feilei.adapter.MyAdapterLeft;
import com.umeng.soexample.feilei.adapter.MyAdapterRight;
import com.umeng.soexample.feilei.bean.MyData;
import com.umeng.soexample.feilei.presenter.PresenterImpl;
import com.umeng.soexample.feilei.view.IView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements IView {
    private String url = "http://www.wanandroid.com/tools/mockapi/6523/restaurant-list";
    private RecyclerView recyLeft;
    private RecyclerView recyRight;
    private List<MyData.DataBean> list = new ArrayList<>();
    private MyAdapterLeft myAdapterLeft;
    private MyAdapterRight myAdapterRight;
    private PresenterImpl presenter;
    private TextView shangjia;
    private TextView jiesuan;
    List<MyData.DataBean.SpusBean> spus = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        myAdapterLeft = new MyAdapterLeft(list, MainActivity.this);
        myAdapterRight = new MyAdapterRight(spus, MainActivity.this);
        recyLeft.setAdapter(myAdapterLeft);
        recyRight.setAdapter(myAdapterRight);
        presenter = new PresenterImpl(MainActivity.this);
        presenter.startRequest(url);
        myAdapterLeft.setOnClick(new MyAdapterLeft.Callback() {
            @Override
            public void setOnItemClick(View view, int position) {
                spus.clear();
                //刚进去数量全部为0
                spus.addAll(list.get(position).getSpus());
                for (int i = 0; i < spus.size(); i++) {
                    spus.get(i).setPraise_num(0);
                }
                myAdapterRight.notifyDataSetChanged();
                shangjia.setText(list.get(position).getName());

            }
        });
        myAdapterRight.setCallBack(new MyAdapterRight.AdapterCallBack() {
            @Override
            public void shuaxin() {
                jiesuan.setText(myAdapterRight.getGoodsPrice() + "");
            }
        });
    }

    private void initViews() {
        recyLeft = findViewById(R.id.recyLeft);
        LinearLayoutManager leftManager = new LinearLayoutManager(this);
        recyLeft.setLayoutManager(leftManager);

        recyRight = findViewById(R.id.recyRight);
        LinearLayoutManager rightManager = new LinearLayoutManager(this);
        recyRight.setLayoutManager(rightManager);
        shangjia = findViewById(R.id.shangjia);
        jiesuan = findViewById(R.id.jiesuan);
    }

    @Override
    public void success(Object user) {
        final MyData myData = (MyData) user;
        list.addAll(myData.getData());

        myAdapterLeft.notifyDataSetChanged();
    }

    @Override
    public void error(Object error) {

    }
}
