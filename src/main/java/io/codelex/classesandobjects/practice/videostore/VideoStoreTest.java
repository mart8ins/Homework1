package io.codelex.classesandobjects.practice.videostore;

import java.util.Scanner;

public class VideoStoreTest {
    private static final int COUNT_OF_MOVIES = 3;

    public static void main(String[] args) {
        final Scanner keyboard = new Scanner(System.in);
        VideoStore videoStore = new VideoStore();

        while (true) {
            System.out.println("Choose the operation you want to perform ");
            System.out.println("Choose 0 for EXIT");
            System.out.println("Choose 1 to fill video store");
            System.out.println("Choose 2 to rent video (as user)");
            System.out.println("Choose 3 to return video (as user)");
            System.out.println("Choose 4 to show movie info (as user)");
            System.out.println("Choose 5 to show store info (as user)");
            System.out.println("Choose 6 to only available videos (as user)");

            int n = keyboard.nextInt();

            switch (n) {
                case 0:
                    System.exit(0);
                case 1:
                    fillVideoStore(keyboard, videoStore);
                    break;
                case 2:
                    rentVideo(keyboard, videoStore);
                    break;
                case 3:
                    returnVideo(keyboard, videoStore);
                    break;
                case 4:
                    showMovieInfo(keyboard, videoStore);
                    break;
                case 5:
                    showStoreInfo(videoStore);
                    break;
                case 6:
                    showOnlyAvailableVideos(videoStore);
                    break;
                default:
                    break;
            }

        }
    }

    private static void showOnlyAvailableVideos(VideoStore videoStore) {
        videoStore.getAvailableVideos();
    }

    private static void showStoreInfo(VideoStore videoStore) {
        videoStore.getAllVideosInInventory();
    }

    private static void showMovieInfo(Scanner scanner, VideoStore videoStore) {
        System.out.println("Please enter a movies title to see its info.");
        String movieName = scanner.next();
        videoStore.getVideoInfo(movieName);
    }

    private static void fillVideoStore(Scanner scanner, VideoStore videoStore) {
        for (int i = 0; i < COUNT_OF_MOVIES; i++) {
            System.out.println("Enter movie name");
            String movieName = scanner.next();
            System.out.println("Enter rating");
            double rating = scanner.nextDouble();
            //todo - add video
            videoStore.addVideoToInventory(new Video(movieName, rating));
        }
    }

    private static void rentVideo(Scanner scanner, VideoStore videoStore) {
        //todo - rent video
        boolean rentSuccess = false;
        String movieName;
        do {
            System.out.println("Please enter video name what to rent.");
            movieName = scanner.next();
            rentSuccess = videoStore.rentVideo(movieName);
        } while (!rentSuccess);
    }

    private static void returnVideo(Scanner scanner, VideoStore videoStore) {
        //todo - return video
        System.out.println("Please enter video name for return.");
        String movieName = scanner.next();
        System.out.println("Please rate the video from 1-10");
        double rate = scanner.nextDouble();
        videoStore.returnVideo(movieName, rate);
    }
}
