package com.example.myschool;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by 德锐 on 2017/12/19.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder> {


    private List<News> mNews;
    public  NewsAdapter(List<News> newsList){
        mNews=newsList;
    }
    static  class ViewHolder extends RecyclerView.ViewHolder{
        TextView Newstitle;
        View newsView;
        public ViewHolder(View view){
            super(view);
            newsView=view;
            Newstitle=(TextView)view.findViewById(R.id.newstitle);

        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.news_title,parent,false);
       final ViewHolder holder=new ViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        News news=mNews.get(position);
        holder.Newstitle.setText(news.getTitle());
    }

    @Override
    public int getItemCount() {
        return mNews.size();
    }
}
