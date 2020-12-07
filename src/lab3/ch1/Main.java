package lab3.ch1;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3};
        ArrayCustomIterator<Integer> it = new ArrayCustomIterator<Integer>(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
