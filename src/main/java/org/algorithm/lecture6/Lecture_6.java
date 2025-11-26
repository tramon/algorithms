package org.algorithm.lecture6;

public class Lecture_6 {

    static int fibonacci(int number) {
        return (number < 2) ?  number :
                fibonacci(number - 1) + fibonacci(number - 2);
    }

    static int fibonacciRecursion(int number) {
        int fib = 0;
        int n1 = 0;
        int n2 = 1;
        if (number < 2) {
            return number;
        }
        while (number > 1) {
            fib = n1 + n2;
            n1 = n2;
            n2 = fib;
            number--;
        }
        return fib;
    }

    public static void mergeSort(int[] array) {
        int n = array.length;
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left);
        mergeSort(right);

        merge(array, left, right);
    }

    public static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }
        while (i < left.length) {
            array[k++] = left[i++];
        }
        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

}
