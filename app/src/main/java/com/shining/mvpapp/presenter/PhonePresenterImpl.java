package com.shining.mvpapp.presenter;

import com.shining.mvpapp.model.PhoneInfo;
import com.shining.mvpapp.model.PhoneInfoModel;
import com.shining.mvpapp.model.PhoneInfoModelImpl;
import com.shining.mvpapp.view.PhoneView;

/**
* Created by MVPHelper on 2016/10/21
*/

public class PhonePresenterImpl implements PhonePresenter,OnPhoneListener{
    private PhoneView phoneView;
    private PhoneInfoModel phoneInfoModel;
    public PhonePresenterImpl(PhoneView View){
        this.phoneView = View;
        phoneInfoModel = new PhoneInfoModelImpl();
    }
    @Override
    public void getPhoneInfo(String phoneNumber) {
        phoneView.showLoading();
        phoneInfoModel.GetPhoneInfo(phoneNumber,this);
    }

    @Override
    public void onSuccess(PhoneInfo phoneInfo) {
        phoneView.hideLoading();
        phoneView.showPhoneInfo(phoneInfo);
    }

    @Override
    public void onError() {
        phoneView.hideLoading();
        phoneView.showError();
    }

}