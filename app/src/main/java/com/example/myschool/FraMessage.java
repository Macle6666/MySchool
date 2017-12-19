package com.example.myschool;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 德锐 on 2017/12/4.
 * 信息
 */

public class FraMessage extends  android.app.Fragment {

    private List<News> newsList=new ArrayList<>();


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fra_message,container,false);

        initNewsTitle();
        RecyclerView recyclerView=(RecyclerView)view.findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(layoutManager);
        NewsAdapter adapter=new NewsAdapter(newsList);
        recyclerView.setAdapter(adapter);
        return  view;
    }

    public  void  initNewsTitle(){
        News news1=new News("新闻1");
        newsList.add(news1);
        News news2=new News("新闻2");
        newsList.add(news2);
    }
}
