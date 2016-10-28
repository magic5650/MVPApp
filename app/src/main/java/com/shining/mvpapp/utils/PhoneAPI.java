package com.shining.mvpapp.utils;

import com.shining.mvpapp.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016-10-24.
 */
public class PhoneAPI {
    private PhoneService service;
    private PhoneService service2;
    public PhoneAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.phoneApiUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(PhoneService.class);

        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl(Constants.phoneApiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service2 = retrofit2.create(PhoneService.class);
    }
    public PhoneService getService(){
        return service;
    }

    public PhoneService getService2(){
        return service2;
    }

}
