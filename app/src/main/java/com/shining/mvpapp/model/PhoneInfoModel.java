package com.shining.mvpapp.model;

import com.shining.mvpapp.presenter.OnPhoneListener;

/**
 * Created by Administrator on 2016-10-21.
 */
public interface PhoneInfoModel {
    void GetPhoneInfo(String phoneNumber,final OnPhoneListener listener);
}
