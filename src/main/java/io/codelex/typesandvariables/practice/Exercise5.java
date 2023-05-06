package io.codelex.typesandvariables.practice;

public class Exercise5 {

    private static void printTable() {
        String teacher1 = "Ms. Lapan";
        String teacher2 = "Mrs. Gideon";
        String teacher3 = "Mr. Davis";
        String teacher4 = "Ms. Palmer";
        String teacher5 = "Ms. Garcia";
        String teacher6 = "Mrs. Barnett";
        String teacher7 = "Ms. Johannessen";
        String teacher8 = "Mr. James";

        String course1 = "English III";
        String course2 = "Precalculus";
        String course3 = "Music Theory";
        String course4 = "Biotechnology";
        String course5 = "Principles of Technology I";
        String course6 = "Latin II";
        String course7 = "AP US History";
        String course8 = "Business Computer Infomation Systems";

        System.out.printf("+------------------------------------------------------------+ \n");
        System.out.printf("| 1 | %36s | %15s | \n", course1, teacher1);
        System.out.printf("| 2 | %36s | %15s | \n", course2, teacher2);
        System.out.printf("| 3 | %36s | %15s | \n", course3, teacher3);
        System.out.printf("| 4 | %36s | %15s | \n", course4, teacher4);
        System.out.printf("| 5 | %36s | %15s | \n", course5, teacher5);
        System.out.printf("| 6 | %36s | %15s | \n", course6, teacher6);
        System.out.printf("| 7 | %36s | %15s | \n", course7, teacher7);
        System.out.printf("| 8 | %36s | %15s | \n", course8, teacher8);
        System.out.printf("+------------------------------------------------------------+ \n");

    }

    public static void main(String[] args) {
        printTable();
    }
}
