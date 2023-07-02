package io.codelex.collections.practice;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;


public class FlightPlanner {
    private static final Charset charset = Charset.defaultCharset();
    private static final String file = "/collections/flights.txt";

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner in = new Scanner(System.in);
        final Path path = Paths.get(Histogram.class.getResource(file).toURI());
        List<String> file = Files.readAllLines(path, charset);

        Map<String, List> allRoutes = new HashMap<String, List>(); // key: starting destination / value: list of flights
        Set<String> uniqueStartDestinations = new HashSet<String>(); // helper to get unique keys.

        // SETS UP DATA STRUCTURE FOR USE
        for (String route : file) {
            String[] pairs = route.split(" -> ");
            String departure = pairs[0];
            String arrival = pairs[1];
            boolean added = uniqueStartDestinations.add(departure);
            if (added) {
                List<String> finalDestination = new ArrayList<String>();
                finalDestination.add(arrival);
                allRoutes.put(departure, finalDestination);
            } else {
                allRoutes.get(departure).add(arrival);
            }
        }
        Object[] startDestinationArray = uniqueStartDestinations.toArray();


        while (true) {
            String currentLocation;
            List<String> userTravelRoute = new ArrayList<String>();

            System.out.println("Please enter 1 to select your starting point. Enter # to quit.");
            String userChoice = in.nextLine();
            if (userChoice.equals("1")) {
                // APP STARTS
                System.out.println(" * Flight assistant: please select your start destination.");
                for (int i = 0; i < startDestinationArray.length; i++) {
                    System.out.println("Enter " + i + " to start from " + startDestinationArray[i]);
                }

                int userDepartureLocationIndex = in.nextInt();
                in.nextLine();
                currentLocation = startDestinationArray[userDepartureLocationIndex].toString();
                System.out.println(" * Your starting destination will be " + startDestinationArray[userDepartureLocationIndex]);

                userTravelRoute.add(currentLocation);

                while (userTravelRoute.size() == 1 || !userTravelRoute.get(0).toString().equals(currentLocation)) {
                    Object[] destinationArray = allRoutes.get(currentLocation).toArray();
                    System.out.println(" * Where to fly next?");
                    for (int i = 0; i < destinationArray.length; i++) {
                        System.out.println("Enter " + i + " to fly to " + destinationArray[i]);
                    }
                    int userTravelLocationIndex = in.nextInt();
                    in.nextLine();
                    System.out.println("Your traveled to " + destinationArray[userTravelLocationIndex]);
                    currentLocation = destinationArray[userTravelLocationIndex].toString();
                    userTravelRoute.add(currentLocation);
                    if (userTravelRoute.get(0).toString().equals(currentLocation)) {
                        System.out.println("*".repeat(60));
                        System.out.println("Your trip is over. You are where you started - " + userTravelRoute.get(0));
                        System.out.println("Your travel destination log: ");
                        for (String dest : userTravelRoute) {
                            System.out.print(" -> " + dest);
                        }
                        System.out.println();
                        System.out.println("*".repeat(60));
                        System.out.println();
                    }
                }
            } else {
                break;
            }
        }

    }
}
