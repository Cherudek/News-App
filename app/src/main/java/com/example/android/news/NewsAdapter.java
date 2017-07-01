package com.example.android.news;

import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import android.graphics.drawable.GradientDrawable;
import com.squareup.picasso.Picasso;

import butterknife.BindView;

/**
 * Created by Gregorio on 06/06/2017.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String LOCATION_SEPARATOR = " of ";
    private static final String LOG_TAG = NewsAdapter.class.getSimpleName();
    //new variables (primary location and location offset) to store the resulting Strings.
    String primaryLocation;
    String locationOffset;

    @BindView(R.id.title) TextView titleView;
    @BindView(R.id.section) TextView sectionView;
    @BindView(R.id.date) TextView dateView;
    @BindView(R.id.image) ImageView imageView;
    @BindView(R.id.author) TextView authorView;



    //Constructor for our customized News Class
    public NewsAdapter(Activity context, ArrayList<News> newses) {
        super(context, 0, newses);
    }


    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;

        //to reference the child views for later actions
        ViewHolder holder;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Find the news at the given position in the list of newses
        News currentNews = getItem(position);


        // cache view fields into the holder
        holder = new ViewHolder();
        holder.titleView = (TextView) listItemView.findViewById(R.id.title);
        holder.sectionView = (TextView) listItemView.findViewById(R.id.section);
        holder.dateView = (TextView) listItemView.findViewById(R.id.date);
        holder.imageView = (ImageView) listItemView.findViewById(R.id.image);
        // associate the holder with the view for later lookup
        listItemView.setTag(holder);

        //Get the Title String from the News object and store that in a variable.
        String title = currentNews.getmTitle();
        // Set the title text in the titleView
        holder.titleView.setText(title);


        //Get the Section String from the News object and store that in a variable.
        String section = currentNews.getmSection();
        // Set the section text in the sectionView
        holder.sectionView.setText(section);


        //Get the Section String from the News object and store that in a variable.
        String date = currentNews.getmDate();
        // Set the date text in the dateView
        holder.dateView.setText(date);

        //Get the Section String from the News object and store that in a variable.
        String imageUrl = currentNews.getmThumbnail();

        // set the book cover image in the ImageView
        Picasso.with(getContext()).load(imageUrl).into(holder.imageView);

        //Get the author String from the News object and store that in a variable.
        String author = currentNews.getmDate();
        // Set the date text in the dateView
        holder.authorView.setText(author);


        // url link string from the News object and store it in a variable
        String newsUrl = currentNews.getmWeblink();

        // authorUrl link string from the News object and store it in a variable
        String authorUrl = currentNews.getmAuthorUrl();


        // Return the list item view that is now showing the appropriate data
        return listItemView;
    }

    // somewhere else in your class definition
    static class ViewHolder {
        TextView titleView;
        TextView sectionView;
        TextView dateView;
        ImageView imageView;
        TextView authorView;
    }
}
