package org.aston.module_two.homework;

import java.util.LinkedList;


/**
 * CustomHashSet class that stores elements in an array (buckets) using
 * hashing and collision resolution using chaining (via LinkedList)
 */
public class CustomHashSet<E> {

    private static final int DEFAULT_CAPACITY = 16; // Initial size of an array
    private LinkedList<E>[] buckets; // Buckets array
    private int size; // Elements count

    public CustomHashSet(){
        buckets = new LinkedList[DEFAULT_CAPACITY];
        for (int i = 0; i < DEFAULT_CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        size = 0;
    }

    private int getBucketIndex(E e) {
        int hashCode = e.hashCode();
        return Math.abs(hashCode) % buckets.length;
    }

    private void resize() {
        int newCapacity = buckets.length * 2;
        LinkedList<E>[] newBuckets = new LinkedList[newCapacity];

        for (int i = 0; i < newCapacity; i++) {
            newBuckets[i] = new LinkedList<>();
        }

        for (LinkedList<E> bucket : buckets) {
            for (E element : bucket) {
                int newBucketIndex = Math.abs(element.hashCode()) % newCapacity;
                newBuckets[newBucketIndex].add(element);
            }
        }

        buckets = newBuckets;
    }

    public boolean add(E e){
        if (e == null){
            throw new IllegalArgumentException("Null element no allowed");
        }

        int bucketIndex = getBucketIndex(e);
        LinkedList<E> bucket = buckets[bucketIndex];

        if (bucket.contains(e)) {
            return false;
        }

        bucket.add(e);
        size++;

        if ((double) size / buckets.length > 0.75) {
            resize();
        }

        return true;
    }

    public boolean remove(E e){
        if (e == null){
            throw new IllegalArgumentException("Null element no allowed");
        }

        int bucketIndex = getBucketIndex(e);
        LinkedList<E> bucket = buckets[bucketIndex];
        boolean removed = bucket.remove(e);

        if (removed){
            size--;
        }

        return removed;
    }
}
