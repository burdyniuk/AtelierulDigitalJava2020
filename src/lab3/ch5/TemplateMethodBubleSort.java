package lab3.ch5;

public abstract class TemplateMethodBubleSort {
    void sort(Integer[] list) {
        int len = list.length;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (numbersInCorrectOrder(list[j], list[j + 1])) {
                    // swap temp and arr[i]
                    Integer temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
    }

    abstract boolean numbersInCorrectOrder(Integer i1, Integer i2);
}
