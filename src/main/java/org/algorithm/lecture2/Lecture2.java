package org.algorithm.lecture2;

public class Lecture2 {


    static void main() {
        int[] intArray = new int[10];
        String[] stringArray = new String[10];
        Object[] objectArray = new Object[10];

        System.out.println("Array length is: " + intArray.length);

        String[] seasons  = new String[4];

        seasons[0] = "Winter";
        seasons[1] = "Spring";
        seasons[2] = "Summer";
        seasons[3] = "Autumn";

        System.out.println("Seasons[2]=" + seasons[2]);

        //another way to init an Array
        String[] seasons2  = new String[] {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println();
        System.out.println("Seasons iterate:");
        for (int i = 0; i < 4; i++) {
            System.out.println(seasons[i]);
        }

        float floatArray[][] = new float[3][4];

        floatArray[0][0] = 1.0f;
        floatArray[0][1] = 2.0f;
        floatArray[0][2] = 3.0f;
        floatArray[0][3] = 4.0f;
        floatArray[1][0] = 5.0f;
        floatArray[1][1] = 6.0f;
        floatArray[1][2] = 7.0f;
        floatArray[1][3] = 8.0f;
        floatArray[2][0] = 9.0f;
        floatArray[2][1] = 10.0f;
        floatArray[2][2] = 11.0f;
        floatArray[2][3] = 12.0f;

        float arrayName[][] = {
                { 0.5f, -2.8f, -1.0f, 23.45f },
                { -2.3f, 0.4f, 10.5f, 0.8f },
                { 12.5f, 10.4f, 5.4f, 3.56f }
        };

        int[] myArray  = new int[] {5, 7, 9, 10, 25};

        System.out.println();
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }

        System.out.println();
        Lecture2.displayArray(myArray, "array name:");


        // copy an array
        int[] copiedArray  = new int[myArray.length];
        for (int i = 0; i < myArray.length; i++) {
            copiedArray[i] = myArray[i];
        }

        copyArray(myArray, copiedArray);


        // add elements
        int[] myArray3  = new int[100];
        int numElements = 0;
        numElements = addElement(myArray3, numElements, 5);
        numElements = addElement(myArray3, numElements, 10);
        displayArray(myArray3, "myArray3");


        // find Elements
        int[] myArray4  = new int[] {5, 7, 9, 10, 25};
        int index = findIndexOfElement(myArray4, 9);
        System.out.println("index = " + index);

        //delete Elements
        int[] myArray5  = new int[] {5, 7, 9, 10, 25};
        deleteElement(myArray5, 9);
        displayArray(myArray5, "myArray5");


    }

    private static void displayArray(int[] arr, String arrayName) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arrayName + "[" + i + "] = " + arr[i]);
        }
    }

    private static void copyArray(int[] source, int[] target) {
        for (int i = 0; i < source.length && i < target.length; i++) {
            target[i] = source[i];
        }
    }

    private static int addElement(int[] arr, int numElements, int element) {
        arr[numElements] = element;
        return ++numElements;
    }

    private static int findIndexOfElement(int[] arr, int element) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                return i;
            }
        }
        return -1;
    }

    private static void deleteElement(int[] arr, int element) {
        int index = findIndexOfElement(arr, element);
        if (index != -1) {
            for (int i = index; i < arr.length; i++) {
                if (i + 1 < arr.length) {
                    arr[i] = arr[i + 1];
                } else {
                    arr[i] = 0;
                }
            }
        }
    }


}
