package com.qa;

public class Pub {
    private String location;
    private int openTime;
    private int closeTime;
    private double rating;
    private Drink drink;

    public Pub(String location, int openTime, int closeTime, double rating, Drink drink){
        this.location = location;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.rating = rating;
        this.drink = drink;
    }
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 5) {
            this.rating = rating;
        }
    }

    public int getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(int closeTime) {
        this.closeTime = closeTime;
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        this.openTime = openTime;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
