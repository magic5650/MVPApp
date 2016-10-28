package com.shining.mvpapp.model;

import android.util.Log;

import com.shining.mvpapp.Constants;
import com.shining.mvpapp.presenter.OnPhoneListener;
import com.shining.mvpapp.utils.PhoneAPI;
import com.shining.mvpapp.utils.PhoneService;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
* Created by MVPHelper on 2016/10/21
*/

public class PhoneInfoModelImpl implements PhoneInfoModel {

    @Override
    public void GetPhoneInfo(String phoneNumber,final OnPhoneListener listener) {
        PhoneService service = new PhoneAPI().getService();
        service.ObgetResult(phoneNumber,"json")
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<PhoneInfo>() {
                    @Override
                    public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable e) {
                        Log.d(Constants.TAG,e.toString());
                        listener.onError();
                    }
                    @Override
                    public void onNext(PhoneInfo phoneInfo) {
                        listener.onSuccess(phoneInfo);
                    }
                });
    }

}