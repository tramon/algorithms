package org.algorithm.lecture8;

public class Tree {

    private Node root;

    public Node getRoot() {
        return root;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;

            if (data < current.getData()) {
                current = current.getLeft();
                if (current == null) {
                    parent.setLeft(newNode);
                    return;
                }
            } else if (data > current.getData()) {
                current = current.getRight();
                if (current == null) {
                    parent.setRight(newNode);
                    return;
                }
            } else {
                // якщо не хочеш дублікати – просто виходимо
                return;
            }
        }
    }

    public Node find(int key) {
        Node current = root;

        while (current != null && current.getData() != key) {
            if (key < current.getData()) {
                current = current.getLeft();
            } else {
                current = current.getRight();
            }
        }

        return current; // або null, якщо не знайдено
    }

    public Node findMinNode() {
        if (root == null) {
            return null;
        }

        Node current = root;
        Node result = null;

        while (current != null) {
            result = current;
            current = current.getLeft();
        }

        return result;
    }

    public Node findMaxNode() {
        if (root == null) {
            return null;
        }

        Node current = root;
        Node result = null;

        while (current != null) {
            result = current;
            current = current.getRight();
        }

        return result;
    }

    public void traverse() {
        traverse(root);
        System.out.println();
    }

    private void traverse(Node node) {
        if (node != null) {
            traverse(node.getLeft());
            System.out.print(node.getData() + " ");
            traverse(node.getRight());
        }
    }

    public void display() {
        printTree(root, "", true);
    }

    private void printTree(Node node, String prefix, boolean isTail) {
        if (node == null) {
            return;
        }

        System.out.println(prefix + (isTail ? "|__ " : "|-- ") + node.getData());

        String newPrefix = prefix + (isTail ? "    " : "|   ");

        boolean hasLeft = node.getLeft() != null;
        boolean hasRight = node.getRight() != null;

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
