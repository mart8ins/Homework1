package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class Exercise5 {

    private static void phoneKeyPad() {
        String dialedNumberSwitch = "";
        String dialedNumberIf = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");

        while (dialedNumberSwitch.length() < 8) {
            String input = scanner.next().toLowerCase();

            if (input.contains("a") || input.contains("b") || input.contains("c")) {
                dialedNumberIf += 2;
            } else if (input.contains("d") || input.contains("e") || input.contains("f")) {
                dialedNumberIf += 3;
            } else if (input.contains("g") || input.contains("h") || input.contains("i")) {
                dialedNumberIf += 4;
            } else if (input.contains("j") || input.contains("k") || input.contains("l")) {
                dialedNumberIf += 5;
            } else if (input.contains("m") || input.contains("n") || input.contains("o")) {
                dialedNumberIf += 6;
            } else if (input.contains("p") || input.contains("q") || input.contains("r") || input.contains("s")) {
                dialedNumberIf += 7;
            } else if (input.contains("t") || input.contains("u") || input.contains("v")) {
                dialedNumberIf += 8;
            } else if (input.contains("w") || input.contains("x") || input.contains("y") || input.contains("z")) {
                dialedNumberIf += 9;
            }

            switch (input) {
                case "a":
                case "b":
                case "c":
                    dialedNumberSwitch += 2;
                    break;
                case "d":
                case "e":
                case "f":
                    dialedNumberSwitch += 3;
                    break;
                case "g":
                case "h":
                case "i":
                    dialedNumberSwitch += 4;
                    break;
                case "j":
                case "k":
                case "l":
                    dialedNumberSwitch += 5;
                    break;
                case "m":
                case "n":
                case "o":
                    dialedNumberSwitch += 6;
                    break;
                case "p":
                case "q":
                case "r":
                case "s":
                    dialedNumberSwitch += 7;
                    break;
                case "t":
                case "u":
                case "v":
                    dialedNumberSwitch += 8;
                    break;
                case "w":
                case "x":
                case "y":
                case "z":
                    dialedNumberSwitch += 9;
                    break;
                default:
                    dialedNumberSwitch += "_ _ _ _ _";
                    System.out.print("Wrong button...");
            }

            System.out.println("Dialed number if: " + dialedNumberIf);
            System.out.println("Dialed number switch: " + dialedNumberSwitch);

        }


    }

    public static void main(String[] args) {
        phoneKeyPad();

    }
}
