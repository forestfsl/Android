package com.songlin.coolshoppingdemo.ui.fragment;

import android.os.Handler;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;

import com.handmark.pulltorefresh.library.PullToRefreshListView;
import com.songlin.coolshoppingdemo.R;
import com.songlin.coolshoppingdemo.entity.FilmInfo;
import com.songlin.coolshoppingdemo.entity.GoodsInfo;
import com.songlin.coolshoppingdemo.ui.base.BaseFragment;
import com.songlin.coolshoppingdemo.ui.widget.Indicator;
import com.songlin.coolshoppingdemo.entity.HommeGridInfo;


import java.util.ArrayList;
import java.util.List;


/**
 * Created by songlin on 2018/7/23.
 */

public class HomeFragment extends BaseFragment {
    private static final int GOOD_REQUEST = 0X01;
    private static final int FILM_REQUEST = 0X12;
    private static final int SCAN_OR_REQUEST = 103;
    private static final String GOODS_ID = "goodsId";
    private static final String GOODS_SEVEN_REFUND = "sevenRefund";
    private static final String GOODS_TIME_REFUND = "timeRefund";
    private static final String GOODS_BOUGHT = "bought";
    private static final int CITY_REQUEST_CODE = 4000;

    private int [] imgRes = new int[]{R.drawable.banner01,R.drawable.banner02,R.drawable.banner03};
    private Handler mHandler = new Handler();
    //广告轮播
    private ViewPager bannerPager;
    private Indicator bannerIndicator;
    private View mView;

    private List<HommeGridInfo> pageOneData = new ArrayList<>();
    private List<HommeGridInfo> pageTwoData = new ArrayList<>();
    private PullToRefreshListView mRefreshListView;
    private List<View> mViewList = new ArrayList<>();

    private List<GoodsInfo.ResultBean.GoodlistBean> mGoodlist = new ArrayList<>();

    private List<FilmInfo.ResultBean> mFilmList = new ArrayList<>();
    private LinearLayout mFilmLayout;
    private ListView mListView;



}
