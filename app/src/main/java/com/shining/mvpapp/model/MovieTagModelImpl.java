package com.shining.mvpapp.model;

import android.util.Log;

import com.shining.mvpapp.Constants;
import com.shining.mvpapp.presenter.OnMovieTagListener;
import com.shining.mvpapp.utils.MovieAPI;
import com.shining.mvpapp.utils.MovieService;

import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by Administrator on 2016-10-26.
 */

public class MovieTagModelImpl implements MovieTagModel{
    @Override
    public void GetMovieTagInfo(String tag,final OnMovieTagListener listener){
        MovieService movieService = new MovieAPI().getService();
        movieService.Obgetsearch(tag)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<MovieTag>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d(Constants.TAG,e.toString());
                        listener.onError();
                    }

                    @Override
                    public void onNext(MovieTag movieTag) {
                        listener.onSuccess(movieTag);
                    }
                });
    }
}
