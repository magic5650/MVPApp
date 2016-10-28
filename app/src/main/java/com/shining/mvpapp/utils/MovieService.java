package com.shining.mvpapp.utils;

import com.shining.mvpapp.model.MovieTag;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016-10-25.
 */

public interface MovieService {
    @GET("v2/movie/search")
    Call<MovieTag> getsearch(
            @Query("tag") String tag
    );

    @GET("v2/movie/search")
    Observable<MovieTag> Obgetsearch(
            @Query("tag") String tag
    );
}
