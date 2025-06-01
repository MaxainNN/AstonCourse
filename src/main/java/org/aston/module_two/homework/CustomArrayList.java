package org.aston.module_two.homework;

import java.util.Arrays;
import java.util.Collection;

/**
 * CustomArrayList class
 * Features:
 * 1) Dynamic expansion: When the array is full, its
 * capacity is automatically increased by 1.5 times
 * (standard ArrayList behavior).
 * 2) Methods:
 * add(E element) - O(1) amortized time (if no expansion required)
 * add(int index, E element) - O(n) worst case (element shift required)
 * get(int index) - O(1)
 * remove(int index) - O(n) worst case (element shift required)
 * 3) Optimizations:
 * Use System.arraycopy for efficient element copying
 * Fast remove (fastRemove) without redundant checks
 */
public class CustomArrayList<E> {

    private static final int DEFAULT_CAPACITY = 10; // Default initial array capacity

    private Object[] elements; // Array to store elements

    private int size; // Current count of elements

    // Default constructor
    public CustomArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
        this.size = 0;
    }

    // Constructor with defined initial capacity
    public CustomArrayList(int initialCapacity) {
        if (initialCapacity < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elements = new Object[initialCapacity];
        this.size = 0;
    }

    /**
     * Increases the list capacity if needed
     * @param minCapacity minimum required capacity
     */
    private void ensureCapacity(int minCapacity) {
        if (minCapacity - elements.length > 0) {
            grow(minCapacity);
        }
    }

    /**
     * Increases the capacity of the array
     * @param minCapacity minimum required capacity
     */
    private void grow(int minCapacity) {
        int oldCapacity = elements.length;
        int newCapacity = oldCapacity + (oldCapacity >> 1);

        if (newCapacity - minCapacity < 0) {
            newCapacity = minCapacity;
        }

        elements = Arrays.copyOf(elements, newCapacity);
    }

    /**
     * Fast element removal without bounds checking
     * (used only inside the class)
     * @param index index of the element to remove
     */
    private void fastRemove(int index) {
        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }
        elements[--size] = null;
    }

    /**
     * Index check for get/remove methods
     * @param index index to check
     * @throws IndexOutOfBoundsException if index is invalid
     */
    private void rangeCheck(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Check index for add method
     * @param index index to check
     * @throws IndexOutOfBoundsException if index is invalid
     */
    private void rangeCheckForAdd(int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
    }

    /**
     * Adds an element to the end of the list
     * @param e the element to add
     * @return true
     */
    public boolean add(E e){
        ensureCapacity(size + 1);
        elements[size++] = e;
        return true;
    }

    /**
     * Adds an element at the specified index
     * @param index the index at which to insert the element
     * @param element the element to insert
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        ensureCapacity(size + 1);

        System.arraycopy(elements, index, elements, index + 1, size - index);

        elements[index] = element;
        size++;
    }

    /**
     * Adds all elements from the collection to the end of the list
     * @param c collection of elements to add
     * @return true if the list has changed
     */
    public boolean addAll(Collection<? extends E> c) {
        if (c == null) {
            throw new NullPointerException("Collection cannot be null");
        }
        if (c.isEmpty()) {
            return false;
        }

        ensureCapacity(size + c.size());

        for (E element : c) {
            elements[size++] = element;
        }

        return true;
    }

    /**
     * Returns the element at the specified index
     * @param index the index of the element
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    @SuppressWarnings("unchecked")
    public E get(int index) {
        rangeCheck(index);
        return (E) elements[index];
    }

    /**
     * Removes the element at the specified index
     * @param index index of the element to remove
     * @return the removed element
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public E remove(int index) {
        rangeCheck(index);

        E oldValue = get(index);

        int numMoved = size - index - 1;
        if (numMoved > 0) {
            System.arraycopy(elements, index + 1, elements, index, numMoved);
        }

        elements[--size] = null;

        return oldValue;
    }

    /**
     * Removes the first occurrence of the specified element
     * @param o the element to remove
     * @return true if the element was found and removed
     */
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elements[i] == null) {
                    fastRemove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elements[i])) {
                    fastRemove(i);
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Returns the number of elements in the list
     * @return the number of elements
     */
    public int size() {
        return size;
    }

    /**
     * Checks if the list is empty
     * @return true if the list is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }
}
