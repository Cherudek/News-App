package com.example.android.news;

import java.util.Date;

/**
 * Created by Gregorio on 06/06/2017.
 */

public class News {


    // 3 variable instances
    private String mTitle;
    private String mSection;
    private String mDate;
    private String mWeblink;
    private String mThumbnail;
    private String mAuthor;
    private String mAuthorUrl;



    public String getmTitle() {
        return mTitle;
    }

    public String getmSection() {
        return mSection;
    }

    public String getmDate() {
        return mDate;
    }

    public String getmWeblink() {
        return mWeblink;
    }

    public String getmThumbnail() {
        return mThumbnail;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmAuthorUrl() {
        return mAuthorUrl;
    }

    // 1 Constructor with 5 states
    public News(String mTitle, String mSection, String mDate, String mWeblink, String mThumbnail, String mAuthor, String mAuthorUrl) {
        this.mTitle = mTitle;
        this.mSection = mSection;
        this.mDate = mDate;
        this.mWeblink = mWeblink;
        this.mThumbnail = mThumbnail;
        this.mAuthor = mAuthor;
        this.mAuthorUrl = mAuthorUrl;

    }

}
