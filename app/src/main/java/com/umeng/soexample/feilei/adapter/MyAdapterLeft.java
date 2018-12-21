package com.umeng.soexample.feilei.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.umeng.soexample.feilei.R;
import com.umeng.soexample.feilei.bean.MyData;

import java.util.List;

public class MyAdapterLeft extends RecyclerView.Adapter<MyAdapterLeft.ViewHolder>{
    private List<MyData.DataBean> list ;
    private Context context;

    public MyAdapterLeft(List<MyData.DataBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.left_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        MyData.DataBean dataBean = list.get(position);
        holder.name.setText(dataBean.getName());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(callback!=null){
                    callback.setOnItemClick(view,position);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        public ViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
        }
    }
    //点击事件接口回调
    public interface Callback{
        void setOnItemClick(View view, int position);
    }
    private Callback callback;
    public void setOnClick(Callback callback){
        this.callback = callback;
    }
}
