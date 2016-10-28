package com.shining.mvpapp.presenter;

import com.shining.mvpapp.model.PhoneInfo;

/**
 * Created by Administrator on 2016-10-24.
 * 在Presenter层实现，给Model层回调，更改View层的状态，确保Model层不直接操作View层
 */
public interface OnPhoneListener {
    /**
     * 成功时回调
     *
     * @param phoneInfo
     */
    void onSuccess(PhoneInfo phoneInfo);
    /**
     * 失败时回调，简单处理，没做什么
     */
    void onError();
}
