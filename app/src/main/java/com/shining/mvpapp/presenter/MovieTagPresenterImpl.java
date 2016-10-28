package com.shining.mvpapp.presenter;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.shining.mvpapp.R;
import com.shining.mvpapp.model.MovieTag;
import com.shining.mvpapp.model.MovieTagModel;
import com.shining.mvpapp.model.MovieTagModelImpl;
import com.shining.mvpapp.view.MovieHtmlActivity;
import com.shining.mvpapp.view.MovieTagActivity;
import com.shining.mvpapp.view.MovieTagView;

/**
 * Created by Administrator on 2016-10-25.
 */

public class MovieTagPresenterImpl implements MovieTagPresenter,OnMovieTagListener {
    private MovieTagView movieTagView;
    private MovieTagModel movieTagModel;
    public MovieTagPresenterImpl(MovieTagView View){
        this.movieTagView = View;
        movieTagModel = new MovieTagModelImpl();
    }
    @Override
    public void getMovieTagInfo(String movieTag) {
        movieTagView.showLoading();
        movieTagModel.GetMovieTagInfo(movieTag,this);
    }


    @Override
    public void onSuccess(MovieTag movieTag) {
        movieTagView.hideLoading();
        movieTagView.showMovieTagInfo(movieTag);
    }

    @Override
    public void onError() {
        movieTagView.hideLoading();
        movieTagView.showError();
    }
}
