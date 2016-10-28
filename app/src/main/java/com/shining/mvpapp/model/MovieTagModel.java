package com.shining.mvpapp.model;

import com.shining.mvpapp.presenter.OnMovieTagListener;
import com.shining.mvpapp.presenter.OnPhoneListener;

/**
 * Created by Administrator on 2016-10-25.
 */

public interface MovieTagModel {
    void GetMovieTagInfo(String tag,final OnMovieTagListener listener);
}
