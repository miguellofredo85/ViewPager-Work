package com.example.viewpager_work;

public enum ModelCalss {

    RED(R.string.red, R.layout.view_red),
    ORANGE(R.string.orange, R.layout.view_orange),
    GREEN(R.string.green, R.layout.view_green);

    private int titleId;
    private int layoutId;

    ModelCalss(int titleId, int layoutId) {
        this.titleId = titleId;
        this.layoutId = layoutId;
    }

    public int getTitleId() {
        return titleId;
    }

    public void setTitleId(int titleId) {
        this.titleId = titleId;
    }

    public int getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(int layoutId) {
        this.layoutId = layoutId;
    }
}
