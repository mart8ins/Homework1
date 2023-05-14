package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        boolean gameEnded = false;
        char winner;
        char PLAYER1 = 'X';
        char PLAYER2 = 'O';
        char playerTurn = PLAYER1;

        initBoard();
        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("\'" + playerTurn + "\'" + ", choose your location (row, column): ");
            String[] input = keyboard.nextLine().split("");

            updateBoard(playerTurn, input);

            char isWinner = checkWinner();

            if (isWinner == ' ') {
                playerTurn = playerTurn == PLAYER1 ? PLAYER2 : PLAYER1;
                displayBoard();
            } else if (isWinner == 't') {
                gameEnded = true;
                System.out.println("Game is tie.");
            } else {
                winner = isWinner;
                gameEnded = true;
                System.out.println(winner + " won the game!");
            }

        } while (!gameEnded);
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static void updateBoard(char player, String[] move) {
        String moveForRow = move[0];
        String moveForCol = move[1];
        int row = Integer.parseInt(moveForRow);
        int col = Integer.parseInt(moveForCol);

        Scanner keyboard = new Scanner(System.in);

        // CHECK IF COORDINATES ARE IN VALID RANGE
        if (row > 2 || col > 2) {
            System.out.println("Your coordinates is out of board range (0-2).");
            System.out.println("\'" + player + "\'" + ", choose your location again (row, column): ");
            String[] input = keyboard.nextLine().split("");
            updateBoard(player, input);
        } else {

            // CHECK IF COORDINATES IS EMPTY
            if (!Character.isLetter(board[row][col])) {
                board[row][col] = player;
            } else {
                System.out.println("Coordinate is already taken.");
                System.out.println("\'" + player + "\'" + ", choose your location again (row, column): ");
                String[] input = keyboard.nextLine().split("");
                updateBoard(player, input);
            }
        }
    }
    // CHECK IF THERE IS WINNER OR TIE

    public static char checkWinner() {
        char winner = ' ';
        // loop to check winner in rows
        for (int i = 0; i < board.length; i++) {
            if (board[i][0] == board[i][1]) {
                if (board[i][0] == board[i][2]) {
                    winner = board[i][0];
                    break;
                }
            }
        }

        // if for col 1
        if (board[0][0] == board[1][0]) {

            if (board[0][0] == board[2][0]) {
                winner = board[0][0];
            }
        }
        // if for col 2
        if (board[0][1] == board[1][1]) {
            if (board[1][1] == board[2][1]) {
                winner = board[0][1];
            }
        }
        // if for col 3
        if (board[0][2] == board[1][2]) {
            if (board[1][2] == board[2][2]) {
                winner = board[0][2];
            }
        }
        // if for diagonal left top -> right
        if (board[0][0] == board[1][1]) {
            if (board[1][1] == board[2][2]) {
                winner = board[0][0];
            }
        }
        // if for diagonal right top -> left
        if (board[0][2] == board[1][1]) {
            if (board[1][1] == board[2][0]) {
                winner = board[0][2];
            }
        }

        // CHECK FOR TIE
        if (winner == ' ') {
            boolean tie = true;
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    if (board[i][j] == ' ') {
                        tie = false;
                    }
                }
            }
            if (tie) {
                winner = 't';
            }
        }
        return winner;
    }
}