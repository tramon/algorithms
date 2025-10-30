package org.algorithm.lecture4;

public interface Stack {
    void push(int element);

    int pop();

    int peek();

    int size();

    boolean isEmpty();

    boolean isFull();
}

