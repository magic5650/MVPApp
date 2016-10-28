package com.shining.mvpapp.presenter;

import com.shining.mvpapp.model.MovieTag;

/**
 * Created by Administrator on 2016-10-25.
 */

public interface OnMovieTagListener {
    /**
     * 成功时回调
     *
     * @param movieTag
     */
    void onSuccess(MovieTag movieTag);
    /**
     * 失败时回调，简单处理，没做什么
     */
    void onError();
}
