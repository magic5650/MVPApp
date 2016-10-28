package com.shining.mvpapp.view;


import com.shining.mvpapp.model.PhoneInfo;

/**
 * Created by Administrator on 2016-10-21.
 */
public interface PhoneView {
    void showPhoneInfo(PhoneInfo phoneInfo);
    void showLoading();
    void hideLoading();
    void showError();
}
