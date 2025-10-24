package org.algorithm.leacure1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LectureReader {
    public static void main(String[] args) throws IOException {
        // 1. Set up the readers
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // 2. Prompt the user and read their input
        System.out.print("Please enter your name: ");
        String name = br.readLine();

        // 3. Use the input
        System.out.println("Hello, " + name + "!");

        // 4. Close the reader (good practice)
        br.close();
    }
}
