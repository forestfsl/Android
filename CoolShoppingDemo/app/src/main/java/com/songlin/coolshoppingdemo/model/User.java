package com.songlin.coolshoppingdemo.model;


import cn.bmob.v3.BmobUser;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by songlin on 2018/7/28.
 */

public class User extends BmobUser {
    private BmobFile headIcon;
    private String sex;
    private float balance;

    public BmobFile getHeadIcon() {
        return headIcon;
    }

    public void setHeadIcon(BmobFile headIcon) {
        this.headIcon = headIcon;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }
}
