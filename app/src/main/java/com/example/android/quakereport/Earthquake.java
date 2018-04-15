package com.example.android.quakereport;

public class Earthquake {
    private String mLocation;
    private double mMagnitude;
    private long mDate;

    public Earthquake(String mLocation, double mMagnitude, long mDate) {
        this.mLocation = mLocation;
        this.mMagnitude = mMagnitude;
        this.mDate = mDate;
    }

    public String getmLocation() {
        return mLocation;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public long getmDate() {
        return mDate;
    }
}
