package com.example.project.project6;


import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_format, parent, false);
        }
        News currentNews = getItem(position);
        TextView title = (TextView) listItemView.findViewById(R.id.title);
        title.setText(currentNews.getTitle());
        TextView section = (TextView) listItemView.findViewById(R.id.section);
        section.setText(currentNews.getSection());
        switch(currentNews.getSection()){
            case "Politics": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.politics));break;
            case "Film": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.film));break;
            case "Football": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.football));break;
            case "World news": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.world_news));break;
            case "Business": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.business));break;
            case "Society": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.society));break;
            case "Technology": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.tech));break;
            case "Money": listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.money));break;
            default: listItemView.setBackgroundColor(ContextCompat.getColor(getContext(), R.color.other));break;

        }
        TextView author = (TextView) listItemView.findViewById(R.id.author);
        author.setText(currentNews.getAuthor());

        String dateAndTime = currentNews.getDate();
        String date= dateAndTime.substring(0,10);
        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(date);
        return listItemView;
    }


}
