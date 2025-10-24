package org.algorithm.leacure1;

/* This kind of comment can span multiple lines */

// This kind is to the end of the line

/**
 * This kind of comment is a special  * ‘javadoc’ style comment
 */

public class Lecture_1 {


    public static void main() {

        int[] myArray = new int[10];
        System.out.println(myArray.length);

        System.out.println("Hello world! " + myArray.length);

        String formatted =  String.format("Hello %s world %s", "my", "!");
        System.out.println(formatted);

        // ---- if else

        if (1 == 2) {
            System.out.println("1 == 2");
        } else if (2 == 3) {
            System.out.println("2 == 3");
        } else {
            System.out.println("1 != 2 and 2 != 3");
        }


        int n = 0;
        int m = 0;

        // ---- switch case

        switch (n + 1) {
            case 0:
                m = n - 1;
                break;
            case 1:
                m = n + 1;
            case 3:
                m = m * n;
                break;
            default:
                m = -n;
                break;
        }


        // ---- cycles

        int x = 0;
        int y = 0;
        int max = 0;
        int sum = 0;

        while (x < y) {
            y = y - x;
        }

        do {
            y = y - x;
        } while (x < y);

        for (int i = 0; i < max; i++) {
            sum += i;
        }


    }

}
