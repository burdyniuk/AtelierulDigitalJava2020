package lab5.ch5;

import java.util.Arrays;
import java.util.Iterator;

public class BinarySearch<T extends Comparable<T>> {

    public int binarySearch(T[] arr, int start, int end, T key) {
        try {
            if (isSorted(arr)) {
                if (start <= end) {
                    int mid = start + end / 2;

                    if (arr[mid] == key) {
                        return mid;
                    }
                    if (arr[mid].compareTo(key) > 0) {
                        return binarySearch(arr, start, mid - 1, key);
                    }
                    else {
                        return binarySearch(arr, mid + 1, end, key);
                    }
                }
            }
        } catch (ArrayNotSortedException exception) {
            System.out.println("Array-ul nu este sortat.");
        }
        // daca elementul nu este gasit
        return -1;
    }

    public boolean isSorted(T[] arr) throws ArrayNotSortedException {
        if (arr.length == 0) {
            return true;
        }
        if(arr.length == 1) {
            return true;
        }
        
        ArrayNotSortedException exception = new ArrayNotSortedException();
        Iterator<T> iterator = Arrays.stream(arr).iterator();
        T current;
        T previous = iterator.next();

        while (iterator.hasNext()) {
            current = iterator.next();
            if (previous.compareTo(current) > 0) {
                throw exception;
            }
            previous = current;
        }
        return true;
    }
}
