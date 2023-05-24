package io.codelex.enums.practice.exercise2;

import java.util.Random;

public class Game {

    private static int gamesPlayed;
    private static int userWonTimes;
    private static int computerWonTimes;
    private static int tieGame;

    public static String getComputerWeapon() {
        Random random = new Random();
        return Weapons.values()[random.nextInt(3)].getWeapon();
    }

    public static String getUserWeapon(String choice) {
        return Weapons.valueOf(choice).getWeapon();
    }

    public static String getWinner(String userWeapon, String computerWeapon) {
        gamesPlayed++;
        if (userWeapon.equals(Weapons.S.getWeapon()) && computerWeapon.equals(Weapons.S.getWeapon()) ||
                userWeapon.equals(Weapons.T.getWeapon()) && computerWeapon.equals(Weapons.T.getWeapon()) ||
                userWeapon.equals(Weapons.P.getWeapon()) && computerWeapon.equals(Weapons.P.getWeapon())
        ) {
            tieGame++;
            return "Its a tie! Both players choose " + userWeapon;
        }
        if (userWeapon.equals(Weapons.S.getWeapon()) && computerWeapon.equals(Weapons.P.getWeapon()) ||
                userWeapon.equals(Weapons.P.getWeapon()) && computerWeapon.equals(Weapons.T.getWeapon()) ||
                userWeapon.equals(Weapons.T.getWeapon()) && computerWeapon.equals(Weapons.S.getWeapon())
        ) {
            userWonTimes++;
            return userWeapon + " beats " + computerWeapon + ". User won!";
        } else {
            computerWonTimes++;
            return computerWeapon + " beats " + userWeapon + ". Computer won!";
        }

    }

    public static String getGameStats() {
        StringBuilder stats = new StringBuilder("Total games played " + gamesPlayed + ". ");
        double userPercentage = ((double) userWonTimes / (double) gamesPlayed) * 100;
        double computerPercentage = ((double) computerWonTimes / (double) gamesPlayed) * 100;
        double tiePercentage = ((double) tieGame / (double) gamesPlayed) * 100;

        stats.append("User won " + userWonTimes + " times. (" + String.format("%.2f", userPercentage) + "%). ");
        stats.append("Computer won " + computerWonTimes + " times. (" + String.format("%.2f", computerPercentage) + "%). ");
        stats.append("Tie was " + tieGame + " times. (" + String.format("%.2f", tiePercentage) + "%). ");
        return stats.toString();
    }
}
