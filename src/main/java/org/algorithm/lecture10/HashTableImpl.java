package org.algorithm.lecture10;

import org.algorithm.lecture5.LinkedList;
import org.algorithm.lecture5.Node;

public class HashTableImpl implements HashTable {

    private LinkedList[] container;
    private int numberOfBuckets;

    public HashTableImpl(int numberOfBuckets) {
        this.numberOfBuckets = numberOfBuckets;
        container = new LinkedList[numberOfBuckets];
        for (int i = 0; i < numberOfBuckets; i++) {
            container[i] = new LinkedList();
        }
    }

    private int getBucketNumber(int data) {
        int hash = data % numberOfBuckets;
        if (hash < 0) {
            hash += numberOfBuckets;
        }
        return hash;
    }

    @Override
    public void put(int data) {
        int bucketNumber = getBucketNumber(data);

        if (container[bucketNumber].find(data) == null) {
            container[bucketNumber].add(data);
        }
    }

    @Override
    public int get(int data) {
        int bucketNumber = getBucketNumber(data);
        Node node = container[bucketNumber].find(data);

        return (node == null) ? -1 : node.getData();
    }

    @Override
    public int remove(int data) {
        int bucketNumber = getBucketNumber(data);

        Node removed = container[bucketNumber].remove(data);

        return (removed == null) ? -1 : removed.getData();
    }

    @Override
    public boolean containsKey(int data) {
        int bucketNumber = getBucketNumber(data);
        return container[bucketNumber].find(data) != null;
    }

    @Override
    public void display() {
        for (int i = 0; i < numberOfBuckets; i++) {
            System.out.print("bucket number = " + i + " data: ");
            container[i].display();
        }
    }

}
