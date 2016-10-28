package com.shining.mvpapp.utils;

import com.shining.mvpapp.Constants;

import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016-10-25.
 */

public class MovieAPI {
    private MovieService service;
    private MovieService service2;
    public MovieAPI(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(Constants.doubanApiUrl)
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service = retrofit.create(MovieService.class);

        Retrofit retrofit2 = new Retrofit.Builder()
                .baseUrl(Constants.doubanApiUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        service2 = retrofit2.create(MovieService.class);
    }
    public MovieService getService(){
        return service;
    }

    public MovieService getService2(){
        return service2;
    }
}
