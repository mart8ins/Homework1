package io.codelex.classesandobjects.practice.exercise9;

public class Exercise9 {
    public static void main(String[] args) {
        Point p1 = new Point(5, 2);
        Point p2 = new Point(-3, 6);

        swapPoints(p1, p2);

        System.out.println("(" + p1.x + ", " + p1.y + ")");
        System.out.println("(" + p2.x + ", " + p2.y + ")");
    }

    private static void swapPoints(Point p1, Point p2) {
        int x1 = p1.x;
        int y1 = p1.y;
        int x2 = p2.x;
        int y2 = p2.y;

        p2.x = x1;
        p2.y = y1;

        p1.x = x2;
        p1.y = y2;
    }
}
