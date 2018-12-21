package com.umeng.soexample.feilei.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.umeng.soexample.feilei.R;
import com.umeng.soexample.feilei.bean.MyData;
import com.umeng.soexample.feilei.weight.MyView;

import java.util.List;

public class MyAdapterRight extends RecyclerView.Adapter<MyAdapterRight.ViewHolder> {
    private List<MyData.DataBean.SpusBean> list;
    private Context context;

    public MyAdapterRight(List<MyData.DataBean.SpusBean> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.right_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context).load(list.get(position).getPic_url()).into(holder.cimg);
        holder.cname.setText(list.get(position).getName());
        holder.cprice.setText(list.get(position).getSkus().get(0).getPrice()+"");

        holder.myView.setCount(list.get(position).getPraise_num());
        holder.myView.getNum(new MyView.CountCallBack() {
            @Override
            public void setNum(int num) {
                list.get(position).setPraise_num(num);
                notifyDataSetChanged();
                adapterCallBack.shuaxin();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView cimg;
        private TextView cname;
        private TextView cprice;
        private MyView myView;
        public ViewHolder(View itemView) {
            super(itemView);
            cimg = itemView.findViewById(R.id.cimg);
            cname = itemView.findViewById(R.id.cname);
            cprice = itemView.findViewById(R.id.cprice);
            myView=itemView.findViewById(R.id.my_view);
        }
    }
    //接口回调

    public interface AdapterCallBack{
        void shuaxin();
    }
    private AdapterCallBack adapterCallBack;;
    public void setCallBack(AdapterCallBack adapterCallBack){
        this.adapterCallBack=adapterCallBack;
    }

    //计算商品价钱
    public float getGoodsPrice(){
        float price = 0;
        for (int i = 0; i < list.size(); i++) {
            price+=list.get(i).getPraise_num() * Float.valueOf(list.get(i).getSkus().get(0).getPrice());
        }
        return price;
    }
}
