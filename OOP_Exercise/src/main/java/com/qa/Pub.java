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
        int closeHour = closeTime / 100;
        int closeMinute = closeTime % 100;
        if (closeHour <= 24 && closeMinute <= 60 && closeHour >=0 && closeMinute >=0) {
            this.closeTime = closeTime;
        }
    }

    public int getOpenTime() {
        return openTime;
    }

    public void setOpenTime(int openTime) {
        int openHour = openTime / 100;
        int openMinute = openTime % 100;
        if (openHour <= 24 && openMinute <= 60 && openHour >=0 && openMinute >=0) {
            this.openTime = openTime;
        }
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
