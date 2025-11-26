package org.algorithm.lecture5;

public class LinkedList implements List {
    private Node first;

    public LinkedList() {
        this.first = null;
    }

    @Override
    public void add(int data) {
        Node newNode = new Node(data);
        newNode.setNext(first);
        first = newNode;
    }

    @Override
    public int remove() {
        Node tmp = first;
        first = first.getNext();
        return tmp.getData();
    }

    public Node remove(int data) {
        if (first == null) {
            return null;
        }

        if (first.getData() == data) {
            Node removed = first;
            first = first.getNext();
            removed.setNext(null);
            return removed;
        }

        Node current = first;

        while (current.getNext() != null &&
                current.getNext().getData() != data) {
            current = current.getNext();
        }

        if (current.getNext() == null) {
            return null;
        }

        Node removed = current.getNext();
        current.setNext(removed.getNext());
        removed.setNext(null);

        return removed;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    public Node find(int data) {
        Node current = this.first;

        while (current != null) {
            if (current.getData() == data) {
                return current;   // знайдено
            }
            current = current.getNext();
        }

        return null;
    }

    @Override
    public void display() {
        Node current = first;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println("]");
    }

}

