package com.pcs.pcs_tabbednavigation_0609;


public class Movie {
    public String getTitle() {
        return title;
    }

    public Movie(String title, String year, String image, String language, String original, String rate, String overview) {
        this.title = title;
        this.year = year;
        this.image = image;
        this.language = language;
        this.original = original;
        this.rate = rate;
        this.overview = overview;
    }



    public void setTitle(String title) {
        this.title = title;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }



    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    private String title;
    private String year;
    private String image;

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getOriginal() {
        return original;
    }

    public void setOriginal(String original) {
        this.original = original;
    }

    private String original;


    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    private String rate;
    private String overview;


}