package org.algorithm.lecture3;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

import static java.lang.Integer.MAX_VALUE;

public class Lecture_3 {

    static void main() {
        int[] array = new int[] {5, 7, 24, 3, 8};

        System.out.println("\nMin number in the array: " + getMin(array));
        System.out.println("Max number in the array: " + getMax(array));
        System.out.println("Random number : " + getRandomInt());
        System.out.println("Random number where max number is 100: " + getRandomInt(100));

        int[] arrayForBubble = new int[] {5, 7, 24, 3, 8};
        int[] arrayForSelection = new int[] {5, 7, 24, 3, 8};
        int[] arrayForInsertion = new int[] {5, 7, 24, 3, 8};

        int[] sortedViaBubbleArray = bubbleSort(arrayForBubble);
        int[] sortedViaSelectionArray = selectionSort(arrayForSelection);
        int[] sortedViaInsertionArray = insertionSort(arrayForInsertion);

        printArray(sortedViaBubbleArray);
        printArray(sortedViaSelectionArray);
        printArray(sortedViaInsertionArray);

    }

    private static int getMin(int[] array) {
        int min = MAX_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (min > array[j]) {
                min = array[j];
            }
        }
        return min;
    }

    private static int getMax(int[] array) {
        int max = Integer.MIN_VALUE;
        for (int j = 0; j < array.length; j++) {
            if (max < array[j]) {
                max = array[j];
            }
        }

        return max;
    }

    private static int getRandomInt() {
        long seed = 12345L;
        Random random = new Random(seed);
        return random.nextInt(MAX_VALUE);
    }

    private static int getRandomInt(int maxNumber) {
        Random random = new Random();
        return random.nextInt(maxNumber);
    }

    private static int[] swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        return array;
    }

    public static int[] bubbleSort(int[] array) {
        for (int i = array.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int minElementIndex = i;
            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minElementIndex]) {
                    minElementIndex = j;
                }
            }
            swap(array, i, minElementIndex);
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j = i;
            for (; j > 0 && array[j - 1] >= tmp; j--) {
                array[j] = array[j - 1];
            }
            array[j] = tmp;
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }



}
