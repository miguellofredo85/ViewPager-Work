package com.example.viewpager_work;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.PagerAdapter;

import java.lang.annotation.Retention;

public class MyPagerAdapter extends PagerAdapter {
    private Context mContext;

    public MyPagerAdapter(Context mContext) {
        this.mContext = mContext;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        ModelCalss modelCalss = ModelCalss.values()[position]; // its an enum so can extract values with values()
        LayoutInflater inflater = LayoutInflater.from(mContext);
        ViewGroup layout = (ViewGroup) inflater.inflate(modelCalss.getLayoutId(), container, false);
        container.addView(layout);
        return layout;
    }

    @Override
    public int getCount() {
        return ModelCalss.values().length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        ModelCalss customPagerEnum = ModelCalss.values()[position];
        return mContext.getString(customPagerEnum.getTitleId());
    }
}
