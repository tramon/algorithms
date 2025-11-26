package org.algorithm.lecture9;

public class RedBlackTree {

    private Node root;

    public void insert(int data) {
        Node newNode = new Node(data);
        root = bstInsert(root, newNode);
        fixInsert(newNode);
    }

    private Node bstInsert(Node root, Node node) {
        if (root == null) return node;

        if (node.getData() < root.getData()) {
            root.setLeft(bstInsert(root.getLeft(), node));
        } else if (node.getData() > root.getData()) {
            root.setRight(bstInsert(root.getRight(), node));
        }
        return root;
    }

    private void fixInsert(Node node) {
        while (node != root && node.getParent().isRed()) {

            Node parent = node.getParent();
            Node grand = parent.getParent();

            if (parent == grand.getRight()) {
                Node uncle = grand.getLeft();

                if (uncle != null && uncle.isRed()) {
                    parent.setColor(Node.BLACK);
                    uncle.setColor(Node.BLACK);
                    grand.setColor(Node.RED);
                    node = grand;
                } else {

                    if (node == parent.getLeft()) {
                        node = parent;
                        rotateRight(node);
                    }

                    parent.setColor(Node.BLACK);
                    grand.setColor(Node.RED);
                    rotateLeft(grand);
                }

            } else {
                Node uncle = grand.getRight();

                if (uncle != null && uncle.isRed()) {
                    parent.setColor(Node.BLACK);
                    uncle.setColor(Node.BLACK);
                    grand.setColor(Node.RED);
                    node = grand;
                } else {

                    if (node == parent.getRight()) {
                        node = parent;
                        rotateLeft(node);
                    }

                    parent.setColor(Node.BLACK);
                    grand.setColor(Node.RED);
                    rotateRight(grand);
                }
            }
        }

        root.setColor(Node.BLACK);
    }

    private void rotateLeft(Node x) {
        Node y = x.getRight();
        x.setRight(y.getLeft());

        if (x.getParent() == null) {
            root = y;
        } else if (x == x.getParent().getLeft()) {
            x.getParent().setLeft(y);
        } else {
            x.getParent().setRight(y);
        }

        y.setLeft(x);
    }

    private void rotateRight(Node x) {
        Node y = x.getLeft();
        x.setLeft(y.getRight());

        if (x.getParent() == null) {
            root = y;
        } else if (x == x.getParent().getRight()) {
            x.getParent().setRight(y);
        } else {
            x.getParent().setLeft(y);
        }

        y.setRight(x);
    }


    private static final String RED = "\u001B[31m";
    private static final String BLACK = "\u001B[30m";
    private static final String RESET = "\u001B[0m";

    public void display() {
        printTree(root, "", true);
        System.out.println();
    }

    private void printTree(Node node, String prefix, boolean isTail) {
        if (node == null) return;

        String color = node.isRed() ? (RED + "R") : (BLACK + "B");

        System.out.println(prefix + (isTail ? "|-- " : "|-- ")
                + node.getData() + "(" + color + RESET + ")");

        boolean hasLeft = node.getLeft() != null;
        boolean hasRight = node.getRight() != null;

        String newPrefix = prefix + (isTail ? "    " : "|   ");

        if (hasLeft && hasRight) {
            printTree(node.getLeft(), newPrefix, false);
            printTree(node.getRight(), newPrefix, true);
        } else if (hasLeft) {
            printTree(node.getLeft(), newPrefix, true);
        } else if (hasRight) {
            printTree(node.getRight(), newPrefix, true);
        }
    }
}
