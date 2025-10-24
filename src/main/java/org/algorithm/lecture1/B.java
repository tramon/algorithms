package org.algorithm.lecture1;

public class B {

    public static void main(String[] args) {
        A a1 = new A("a");
        A a2 = new A("a");
        if (a1 == a2) {
            System.out.println("a1 == a2");
        } else {
            System.out.println("a1 != a2");
        }

    }
}

