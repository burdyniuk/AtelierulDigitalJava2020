package lab3.ch1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayCustomIterator<Integer> implements Iterator<java.lang.Integer> {
    int[] arr = null;
    int size = 0;
    int currentPointer = 0;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
        this.size = arr.length;
        this.currentPointer = 0;
    }

    @Override
    public boolean hasNext() {
        return (currentPointer < size);
    }

    public java.lang.Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int val = this.arr[currentPointer];
        currentPointer++;
        return val;
    }
}
