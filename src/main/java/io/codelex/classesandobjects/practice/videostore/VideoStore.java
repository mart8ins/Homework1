package io.codelex.classesandobjects.practice.videostore;

import java.util.ArrayList;

public class VideoStore {
    private ArrayList<Video> videosInventory = new ArrayList<Video>();

    public void addVideoToInventory(Video video) {
        videosInventory.add(video);
    }

    public void getVideoInfo(String title) {
        for (Video video : videosInventory) {
            String titleToCheck = video.getTitle();
            if (titleToCheck.equals(title)) {
                System.out.println(video.getMovieInfo());
            }
        }
    }

    public boolean rentVideo(String title) {
        boolean success = false;
        for (Video video : videosInventory) {
            String titleToCheck = video.getTitle();
            if (titleToCheck.equals(title)) {
                if (!video.isCheckedOut()) {
                    video.setCheckedOut(true);
                    success = true;
                    System.out.println("Movie rented.");
                } else {
                    System.out.println("Sorry, this video is already rented by some one else.");
                }
            }
        }
        return success;
    }

    public void returnVideo(String title, double rateVideo) {
        for (Video video : videosInventory) {
            String titleToCheck = video.getTitle();
            if (titleToCheck.equals(title)) {
                video.addRating(rateVideo);
                video.setCheckedOut(false);
                System.out.println("Movie returned.");
            }
        }
    }

    public void getAllVideosInInventory() {
        if (videosInventory.size() < 1) {
            System.out.println("Sorry, store is empty.");
        } else {
            for (Video video : videosInventory) {
                System.out.println(video.getMovieInfo());
            }
        }
    }

    public void getAvailableVideos() {
        if (videosInventory.size() < 1) {
            System.out.println("Sorry, store is empty.");
        } else {
            for (Video video : videosInventory) {
                if (!video.isCheckedOut()) {
                    System.out.println(video.getMovieInfo());
                }
            }
        }
    }
}
