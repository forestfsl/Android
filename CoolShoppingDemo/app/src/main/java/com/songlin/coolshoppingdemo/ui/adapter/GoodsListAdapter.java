package com.songlin.coolshoppingdemo.ui.adapter;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;

import com.facebook.drawee.view.SimpleDraweeView;
import com.songlin.coolshoppingdemo.R;
import com.songlin.coolshoppingdemo.entity.GoodsInfo;

import java.util.List;

/**
 * Created by songlin on 2018/8/1.
 */

public class GoodsListAdapter extends BaseAdapter {
    private Context mContext;
    private List<GoodsInfo.ResultBean.GoodlistBean> mGoodList;
    private int mHeaderCount;

    public GoodsListAdapter(Context mContext, List<GoodsInfo.ResultBean.GoodlistBean> mGoodList, int mHeaderCount) {
        this.mContext = mContext;
        this.mGoodList = mGoodList;
        this.mHeaderCount = mHeaderCount;
    }

    @Override
    public int getCount() {
        return mGoodList.size();
    }

    @Override
    public Object getItem(int i) {
        return mGoodList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder = null;
        if (view == null){
            holder = new ViewHolder();
            view = LayoutInflater.from(mContext).inflate(R.layout.item_good_list,null);
            holder.goodPhoto = (SimpleDraweeView)view.findViewById(R.id.good_photo);
            holder.goodIcon = (ImageView)view.findViewById(R.id.good_icon);
            holder.goodAppointmentImg = (ImageView)view.findViewById(R.id.good_appointment_img);
            holder.goodLoading = (ProgressBar)view.findViewById(R.id.good_loading);
            holder.goodDistance = (TextView)view.findViewById(R.id.good_tv_distance);
            holder.goodTitle = (TextView)view.findViewById(R.id.good_tv_title);
            holder.goodFreshOrderLayout = (LinearLayout)view.findViewById(R.id.good_fresh_order_layout);
            holder.goodDescription = (TextView)view.findViewById(R.id.good_tv_distance);
            holder.goodCommentScore = (RatingBar)view.findViewById(R.id.good_comment_score);
            holder.goodPrice = (TextView)view.findViewById(R.id.good_tv_price);
            holder.goodValue = (TextView)view.findViewById(R.id.good_tv_value);
            holder.goodValue.getPaint().setFlags(Paint.STRIKE_THRU_TEXT_FLAG);//添加删除线
            holder.goodCount = (TextView)view.findViewById(R.id.good_tv_count);
            holder.goodArea = (TextView)view.findViewById(R.id.good_tv_area);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        holder.goodPhoto.setImageURI(Uri.parse(mGoodList.get(i).getImages().get(0).getImage()));
        holder.goodIcon.setVisibility(View.VISIBLE);
        if (mGoodList.get(i).getIs_appointment() == 1){
            holder.goodAppointmentImg.setVisibility(View.VISIBLE);
        }else {
            holder.goodAppointmentImg.setVisibility(View.GONE);
        }
        holder.goodLoading.setVisibility(View.GONE);
        holder.goodDistance.setText(mGoodList.get(i).getDistance());
        holder.goodTitle.setText(mGoodList.get(i).getProduct());
        if (mGoodList.get(i).getIs_new().equals("0")){
            holder.goodFreshOrderLayout.setVisibility(View.GONE);
        }else {
            holder.goodFreshOrderLayout.setVisibility(View.VISIBLE);
        }
        holder.goodDescription.setText(mGoodList.get(i).getTitle());
        holder.goodCommentScore.setVisibility(View.GONE);
        holder.goodPrice.setText(mGoodList.get(i).getPrice());
        holder.goodValue.setText(mGoodList.get(i).getValue());
        holder.goodCount.setText("已售"+mGoodList.get(i).getBought()+"份");
        return view;
    }


    static class ViewHolder
    {
        public SimpleDraweeView goodPhoto;
        public ImageView goodIcon;
        public ImageView goodAppointmentImg;
        public ProgressBar goodLoading;

        public TextView goodDistance;
        public TextView goodTitle;
        public LinearLayout goodFreshOrderLayout;
        public TextView goodDescription;
        public RatingBar goodCommentScore;
        public TextView goodPrice;
        public TextView goodValue;
        public TextView goodCount;
        public TextView goodArea;
    }
}
