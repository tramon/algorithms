package org.algorithm.lecture4;

public class StackImpl implements Stack {

    private int[] array;
    private int numberOfElements;

    public StackImpl() {
        this(20);
    }

    public StackImpl(int stackSize) {
        array = new int[stackSize];
        numberOfElements = 0;
    }

    @Override
    public void push(int element) {
        array[numberOfElements++] = element;
    }

    @Override
    public int pop() {
        return array[--numberOfElements];
    }

    @Override
    public int peek() {
        return array[numberOfElements -1];
    }

    @Override
    public int size() {
        return numberOfElements;
    }

    @Override
    public boolean isEmpty() {
        return numberOfElements == 0;
    }

    @Override
    public boolean isFull() {
        return numberOfElements == array.length;
    }


}