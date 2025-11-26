package org.algorithm.lecture9;

public class Node {
    public static final boolean RED = true;
    public static final boolean BLACK = false;

    private int data;
    private boolean color;
    private Node left;
    private Node right;
    private Node parent;

    public Node(int data) {
        this.data = data;
        this.color = RED; // новий вузол завжди червоний
    }

    public int getData() {
        return data;
    }

    public boolean isRed() {
        return color == RED;
    }

    public boolean isBlack() {
        return color == BLACK;
    }

    public void setColor(boolean color) {
        this.color = color;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
        if (left != null) left.parent = this;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
        if (right != null) right.parent = this;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }
}
