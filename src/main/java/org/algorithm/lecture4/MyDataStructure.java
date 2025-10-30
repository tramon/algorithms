package org.algorithm.lecture4;

public class MyDataStructure implements  DataStructure {
    private int[] array;
    private int numberOfElements;

    public MyDataStructure (int maxSize) {
        array = new int[maxSize];
        numberOfElements = 0;
    }

    public void addElement(int element) {
        array[numberOfElements++] = element;
    }
    public int size() {
        return numberOfElements;
    }
}




