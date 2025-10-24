package org.algorithm.leacure1;

class Person {
    String name = "Bob";
    int age = 20;

    public void birthday() {
        age = age + 1;
        System.out.println(name + " is now " + age);
    }

}
