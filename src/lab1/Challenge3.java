package lab1;

public class Challenge3 {
    public static void main(String[] args) {
        int[] numbers = {5,9,-5,7,5};
        int[] numbers2;
        int numOfPairs = 0;

        for (int i = 0; i < numbers.length; i++){
            for (int j = i+1; j < numbers.length; j++)
                if (numbers[i] + numbers[j] == 0){
                    numOfPairs++;
                    numbers[j] = 123456789;
                }
        }

        System.out.println(numOfPairs);
    }
}
