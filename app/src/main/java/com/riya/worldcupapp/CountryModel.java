package com.riya.worldcupapp;

public class CountryModel {

    private String country_name, cup_win_count;
    private int flag_image;


    public CountryModel(String country_name, String cup_win_count, int flag_image) {
        this.country_name = country_name;
        this.cup_win_count = cup_win_count;
        this.flag_image = flag_image;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCup_win_count() {
        return cup_win_count;
    }

    public void setCup_win_count(String cup_win_count) {
        this.cup_win_count = cup_win_count;
    }

    public int getFlag_image() {
        return flag_image;
    }

    public void setFlag_image(int flag_image) {
        this.flag_image = flag_image;
    }

}
