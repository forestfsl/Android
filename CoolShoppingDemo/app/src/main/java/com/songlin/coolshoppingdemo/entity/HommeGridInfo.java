package com.songlin.coolshoppingdemo.entity;

import android.support.annotation.StringRes;

/**
 * Created by songlin on 2018/7/31.
 */

public class HommeGridInfo {
    private @StringRes int gridIcon;
    private String gridTitle;

    public HommeGridInfo(int gridIcon, String gridTitle) {
        this.gridIcon = gridIcon;
        this.gridTitle = gridTitle;
    }

    public int getGridIcon() {
        return gridIcon;
    }

    public void setGridIcon(int gridIcon) {
        this.gridIcon = gridIcon;
    }

    public String getGridTitle() {
        return gridTitle;
    }

    public void setGridTitle(String gridTitle) {
        this.gridTitle = gridTitle;
    }
}
