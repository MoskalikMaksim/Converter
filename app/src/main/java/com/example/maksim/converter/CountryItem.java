package com.example.maksim.converter;

public class CountryItem {
    private String mCountryName;
    private int mFlagImage;

    public CountryItem(String countryName, int flagImage){
        mCountryName = countryName;
        mFlagImage = flagImage;
    }

    public String getcountryName(){
        return mCountryName;
    }

    public int getmFlagImage(){
        return mFlagImage;
    }
}
