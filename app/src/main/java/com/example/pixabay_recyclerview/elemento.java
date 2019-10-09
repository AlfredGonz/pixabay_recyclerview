package com.example.pixabay_recyclerview;

public class elemento {

    private String mImgUrl;
    private String mCreaor;
    private int mLikes;

    public elemento(String mImgUrl, String mCreaor, int mLikes) {
        this.mImgUrl = mImgUrl;
        this.mCreaor = mCreaor;
        this.mLikes = mLikes;
    }

    public String getmImgUrl() {
        return mImgUrl;
    }

    public String getmCreaor() {
        return mCreaor;
    }

    public int getmLikes() {
        return mLikes;
    }
}
