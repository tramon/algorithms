package org.algorithm.lecture7;

public class Lecture_7 {

    public static int[] insertSort(int[] array) {
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

    public static int[] shellSort(int[] array) {
        int h = 1;
        while (h < array.length / 3) {
            h = h * 3 - 1;
        }
        while (h > 0) {
            for (int i = h; i < array.length; i++) {
                int tmp = array[i];
                int j = i;
                for (; j - h >= 0 && array[j - h] >= tmp; j = j -h) {
                    array[j] = array[j - h];
                }
                array[j] = tmp;
            }
            h = (h - 1) / 3;
        }
        return array;
    }

    public static void sort(int[] array, int left, int right) {
        if (right - left <= 0) {
            return;
        }

        int pivot = array[right];
        int position = partition(array, left, right, pivot);
        sort(array, left, position - 1);
        sort(array, position + 1, right);
    }

    private static int partition(int[] array, int left, int right, int pivot) {
        int currentIndex = left;
        int wall = left;
        while (currentIndex <= right) {
            if (pivot < array[currentIndex]) {
                currentIndex++;
            } else {
                swap(array, currentIndex, wall);
                currentIndex++;
                wall++;
            }
        }
        return wall - 1;
    }

    private static void swap(int[] array, int left, int right) {
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
    }


}
