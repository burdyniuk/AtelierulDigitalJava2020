package lab5.ch5;

public class Main {
    public static void main(String[] args) {

        Integer[] arr = new Integer[]{1, 2, 3, 4};
        Integer[] arr1 = new Integer[]{2, 5, 4, 3, 1};
        BinarySearch<Integer> binarySearch = new BinarySearch<>();

        int index = binarySearch.binarySearch(arr, 0, arr.length, 3);
        System.out.println("Element gasit la indice: " + index);
        if (index != -1) {
            index = binarySearch.binarySearch(arr1, 0, arr1.length, 3);
        }
        if (index != -1) {
            System.out.println("Element gasit la indece: " + index);
        }
    }
}
