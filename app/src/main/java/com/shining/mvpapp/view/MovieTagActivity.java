package com.shining.mvpapp.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.shining.mvpapp.Constants;
import com.shining.mvpapp.R;
import com.shining.mvpapp.model.MovieTag;
import com.shining.mvpapp.presenter.MovieTagPresenter;
import com.shining.mvpapp.presenter.MovieTagPresenterImpl;
import com.shining.mvpapp.view.adapter.BaseRecyclerAdapter;
import com.shining.mvpapp.view.adapter.ItemClickSupport;
import com.shining.mvpapp.view.adapter.MovieRecyclerAdapter;
import com.shining.mvpapp.view.adapter.MovieTagAdapter;

import java.util.ArrayList;
import java.util.Collection;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

import static android.R.attr.data;

public class MovieTagActivity extends AppCompatActivity implements MovieTagView {

    @Bind(R.id.movies_tag)
    TextView moviesTag;
    @Bind(R.id.recycler_movie)
    RecyclerView recyclerMovie;
    @Bind(R.id.load_movie)
    Button loadMovie;
    private MovieTagPresenter movieTagPresenter;

    private MovieTagAdapter adapter;
    private MovieRecyclerAdapter recyclerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie);
        ButterKnife.bind(this);
        movieTagPresenter = new MovieTagPresenterImpl(this);
        recyclerMovie.setLayoutManager(new LinearLayoutManager(
                this, LinearLayoutManager.VERTICAL, false));

        ItemClickSupport.addTo(recyclerMovie).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
            @Override
            public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                // do it
                TextView view = (TextView) v.findViewById(R.id.movie_url);
                String Url = view.getText().toString();
                Log.d(Constants.TAG, Url);
                Intent intent = new Intent(MovieTagActivity.this, MovieHtmlActivity.class);
                // 把需要传递的数据附加到intent中
                intent.putExtra("Url", Url);
                startActivity(intent);
            }
        });
    }

    @Override
    public void showMovieTagInfo(MovieTag movieTag) {
        Collection<MovieTag.SubjectsBean> movieData2 = new ArrayList<>(movieTag.getSubjects());
        recyclerAdapter = new MovieRecyclerAdapter(this,recyclerMovie, movieData2);
        recyclerMovie.setAdapter(recyclerAdapter);
/*        ArrayList<MovieTag.SubjectsBean> movieData = new ArrayList<>(movieTag.getSubjects());
        adapter = new MovieTagAdapter(this,movieData);
        recyclerMovie.setAdapter(adapter);*/

    }

    @Override
    public void showMovieTagInfoImage(Bitmap bitmap, int item){

    }

    @Override
    public void hideLoading() {

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void showError() {

    }


    @OnClick(R.id.load_movie)
    public void onClick() {
        movieTagPresenter.getMovieTagInfo("喜剧");
    }
}
