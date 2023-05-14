package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class Video {
    private String title;
    private boolean checkedOut;

    private ArrayList<Double> ratings = new ArrayList<Double>();

    private double rating;

    public Video(String title, double rating) {
        this.title = title;
        this.rating = rating;

        this.ratings.add(rating);
    }

    public void addRating(double rating) {
        this.ratings.add(rating);
        updateAvarageRating();
    }

    private void updateAvarageRating() {
        double sum = 0;
        for (int i = 0; i < ratings.size(); i++) {
            sum += ratings.get(i);
        }
        this.rating = sum / (double) ratings.size();
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public String getMovieInfo() {
        String available = checkedOut ? "is not available" : "available";
        return String.format("Movie title: %s. Average rating: %s . Currently video is %s for renting.", title, rating, available);
    }

    public String getTitle() {
        return title;
    }
}
