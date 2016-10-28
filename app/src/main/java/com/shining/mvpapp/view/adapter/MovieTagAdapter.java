package com.shining.mvpapp.view.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.shining.mvpapp.Constants;
import com.shining.mvpapp.R;
import com.shining.mvpapp.model.MovieTag;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016-10-26.
 */

public class MovieTagAdapter extends RecyclerView.Adapter<MovieTagAdapter.ViewHolder>{
    private ArrayList<MovieTag.SubjectsBean> movieTagList;
    private Context context;

    public MovieTagAdapter(Context context,ArrayList<MovieTag.SubjectsBean> movieTagList) {
        this.context = context;
        this.movieTagList = movieTagList;

    }

    @Override
    public MovieTagAdapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.movie_list, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Log.d(Constants.TAG,"onBindViewHolder "+i+" "+movieTagList.get(i).getId());
        viewHolder.movieTitle.setText(movieTagList.get(i).getTitle());
        viewHolder.movieInfo.setText(movieTagList.get(i).getId());
        Picasso.with(context).load(movieTagList.get(i).getImages().getSmall()).into(viewHolder.movieSmallImage);
    }

    @Override
    public int getItemCount() {
        return movieTagList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView movieTitle;
        TextView movieInfo;
        ImageView movieSmallImage;
        public ViewHolder(View view) {
            super(view);
            movieTitle = (TextView)view.findViewById(R.id.movie_title);
            movieInfo = (TextView)view.findViewById(R.id.movie_info);
            movieSmallImage = (ImageView)view.findViewById(R.id.movie_small_image);
        }
    }
}
