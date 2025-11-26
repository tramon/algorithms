package org.algorithm.lecture8;

public class Lecture_8 {

    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(10);
        tree.insert(1);
        tree.insert(6);
        tree.insert(14);

        System.out.print("In-order: ");
        tree.traverse(); // 1 3 6 8 10 14

        System.out.println("Min: " + tree.findMinNode());
        System.out.println("Max: " + tree.findMaxNode());
        System.out.println("Find 6: " + tree.find(6));

        tree.display();
    }


    public void traverse(Node node) {
        if(node != null) {
            traverse(node.getLeft());
            System.out.print(node.getData() + " ");
            traverse(node.getRight());
        }
    }



}
