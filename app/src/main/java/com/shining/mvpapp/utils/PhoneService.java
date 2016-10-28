package com.shining.mvpapp.utils;

import com.shining.mvpapp.model.PhoneInfo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016-10-24.
 */
public interface PhoneService {
        @GET("Locating/showji.com2016234999234.aspx")
        Call<PhoneInfo> getResult(
                @Query("m") String phone,
                @Query("output") String json
        );

        @GET("Locating/showji.com2016234999234.aspx")
        Observable<PhoneInfo> ObgetResult(
                @Query("m") String phone,
                @Query("output") String json
        );
}
