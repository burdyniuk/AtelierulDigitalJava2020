package lab3.ch2;

import java.util.Arrays;

public class Main {
    public static void displaySorted(SortingStrategy strategy, Integer[] arr) {
        strategy.sort(arr);
        for (Integer elem : arr) {
            System.out.print(elem + " ");
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[] {1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        displaySorted(new BubleSort(), copy01OfArr);
        System.out.println();
        displaySorted(new MergeSort(), copy02OfArr);
    }
}
