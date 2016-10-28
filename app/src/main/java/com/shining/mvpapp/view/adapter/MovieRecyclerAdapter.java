package com.shining.mvpapp.view.adapter;


/**
 * Created by Administrator on 2016-10-25.
 */
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import com.shining.mvpapp.Constants;
import com.shining.mvpapp.R;
import com.shining.mvpapp.model.MovieTag;

import java.util.Collection;

public class MovieRecyclerAdapter extends BaseRecyclerAdapter<MovieTag.SubjectsBean> {
    //private KJBitmap kjBitmap;
    private Context context;
    public MovieRecyclerAdapter(Context context,RecyclerView v, Collection<MovieTag.SubjectsBean> data) {
        super(v, data, R.layout.movie_list);
        //kjBitmap = new KJBitmap(new BitmapConfig());
        this.context = context;
    }

    @Override
    public void convert(RecyclerHolder holder, MovieTag.SubjectsBean movieSubjectsBean, int position, boolean isScrolling) {
        //holder.setImageByUrl(kjBitmap,R.id.movie_small_image,movieSubjectsBean.getImages().getSmall());
        Log.d(Constants.TAG,"MovieRecyclerAdapter convert");
        holder.setText(R.id.movie_url,movieSubjectsBean.getAlt());
        holder.setImageByUrl(context,R.id.movie_small_image,movieSubjectsBean.getImages().getSmall());
        holder.setText(R.id.movie_title, movieSubjectsBean.getTitle());
        String movie_info = movieSubjectsBean.getYear()+"年"+"("+movieSubjectsBean.getGenres().toString()+")";
        holder.setText(R.id.movie_info,movie_info);
        String movie_actors = movieSubjectsBean.getCasts().get(0).getName()+"/"+movieSubjectsBean.getCasts().get(1).getName();
        holder.setText(R.id.movie_actors, movie_actors);
        String movie_rating = movieSubjectsBean.getRating().getAverage() + "("+ movieSubjectsBean.getCollect_count()+"人评价)";
        holder.setText(R.id.movie_rating,movie_rating);
    }
    
}
