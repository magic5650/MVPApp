package com.shining.mvpapp.view;

import android.content.Context;
import android.graphics.Bitmap;

import com.shining.mvpapp.model.MovieTag;

/**
 * Created by Administrator on 2016-10-25.
 */

public interface MovieTagView {
    void showMovieTagInfo(MovieTag movieTag);
    void showMovieTagInfoImage(Bitmap bitmap,int item);
    void showLoading();
    void hideLoading();
    void showError();
}
