package com.shining.mvpapp.view.adapter;

/**
 * Created by Administrator on 2016-10-25.
 */

import android.content.Context;
import android.graphics.Bitmap;

import com.shining.mvpapp.Constants;
import com.shining.mvpapp.R;
import com.squareup.picasso.Picasso;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;


//import top.codecafe.kjframe.KJBitmap;


/**
 * 适配一切RecyclerView.ViewHolder
 *
 * @author kymjs (http://www.kymjs.com/) on 8/27/15.
 */
public class RecyclerHolder extends RecyclerView.ViewHolder {
    private final SparseArray<View> mViews;

    public RecyclerHolder(View itemView) {
        super(itemView);
        //一般不会超过8个吧
        this.mViews = new SparseArray<View>(8);
    }

    public SparseArray<View> getAllView() {
        return mViews;
    }

    /**
     * 通过控件的Id获取对于的控件，如果没有则加入views
     *
     * @param viewId
     * @return
     */
    @SuppressWarnings("unchecked")
    public <T extends View> T getView(int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;
    }

    /**
     * 为TextView设置字符串
     *
     * @param viewId
     * @param text
     * @return
     */
    public RecyclerHolder setText(int viewId, String text) {
        TextView view = getView(viewId);
        view.setText(text);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @param drawableId
     * @return
     */
    public RecyclerHolder setImageResource(int viewId, int drawableId) {
        ImageView view = getView(viewId);
        view.setImageResource(drawableId);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @param bm
     * @return
     */
    public RecyclerHolder setImageBitmap(int viewId, Bitmap bm) {
        ImageView view = getView(viewId);
        view.setImageBitmap(bm);
        return this;
    }

    /**
     * 为ImageView设置图片
     *
     * @param viewId
     * @param url
     * @return
     */
    public RecyclerHolder setImageByUrl(Context context, int viewId, String url) {
        Log.d(Constants.TAG,"setImageByUrl"+viewId+url);
        ImageView imageView = getView(viewId);
        //bitmap.displayCacheOrDefult(getView(viewId), url, R.mipmap.ic_launcher);
        Picasso.with(context).load(url).placeholder(R.drawable.ic_perm_identity_black_24dp).into(imageView);
        return this;
    }

}
